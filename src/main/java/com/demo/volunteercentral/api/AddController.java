package com.demo.volunteercentral.api;

import com.demo.volunteercentral.pojo.Add;
import com.demo.volunteercentral.repository.AddDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class AddController {

    @Autowired
    AddDao addDao;

    @PostMapping({"/post"})
    public ResponseEntity<?> postAdd(@RequestBody Add add) {
        addDao.save(add);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping({"/get"})
    public ResponseEntity<Add> getAllAdds() {
        return new ResponseEntity(addDao.findAll(), HttpStatus.OK);
    }

    @GetMapping({"/get/{id}"})
    public ResponseEntity<Add> getAdd(@PathVariable String id) {
        return new ResponseEntity(addDao.findById(id), HttpStatus.OK);
    }
}