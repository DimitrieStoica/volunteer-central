package com.demo.volunteercentral.repository;

import com.demo.volunteercentral.pojo.Add;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AddDao extends CrudRepository<Add, Long> {

    public Add findById(String id);
}
