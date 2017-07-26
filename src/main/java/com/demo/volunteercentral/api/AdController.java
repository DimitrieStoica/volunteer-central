package com.demo.volunteercentral.api;

import com.demo.volunteercentral.pojo.Ad;
import com.demo.volunteercentral.repository.AdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ad")
public class AdController {

    @Autowired
    AdDao adDao;

    @PostMapping({"/post"})
    public ResponseEntity<?> postAdd(@RequestBody Ad ad) {
        adDao.save(ad);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping({"/get"})
    public ResponseEntity<Ad> getAllAdds() {
        return new ResponseEntity(adDao.findAll(), HttpStatus.OK);
    }

    @GetMapping({"/get/{id}"})
    public ResponseEntity<Ad> getAdd(@PathVariable String id) {
        return new ResponseEntity(adDao.findById(id), HttpStatus.OK);
    }
}