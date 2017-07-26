package com.demo.volunteercentral.repository;

import com.demo.volunteercentral.pojo.Ad;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AdDao extends CrudRepository<Ad, Long> {

    public Ad findById(String id);
}
