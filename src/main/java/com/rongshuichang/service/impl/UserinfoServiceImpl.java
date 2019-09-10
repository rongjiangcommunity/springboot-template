package com.rongshuichang.service.impl;

import com.rongshuichang.entity.Userinfo;
import com.rongshuichang.repository.UserinfoRepo;
import com.rongshuichang.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoRepo userinfoRepo;

    @Override
    public List<Userinfo> findAll(){
        return userinfoRepo.findAll();
    }

    @Override
    public Optional<Userinfo> findbyId(Long id){
        return userinfoRepo.findById(id);
    }

}
