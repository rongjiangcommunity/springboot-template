package com.rongshuichang.service.impl;

import com.rongshuichang.entity.Pinfo;
import com.rongshuichang.repository.PinfoRepo;
import com.rongshuichang.service.PinfoService;
import com.rongshuichang.util.UpdateTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PinfoServiceImpl implements PinfoService {

    @Autowired
    private PinfoRepo pinfoRepo;

    @Override
    public List<Pinfo> findAll(){
        return pinfoRepo.findAll();
    }

    @Override
    public Optional<Pinfo> findbyId(Long id){
        return pinfoRepo.findById(id);
    }

    @Override
    public String savePinfo(Pinfo pinfo){
        Optional<Pinfo> sourceOpt = pinfoRepo.findById(pinfo.getId());
        if(sourceOpt.isPresent()){
            Pinfo sourceData = sourceOpt.get();
            UpdateTool.copyNullProperties(sourceData, pinfo);
        }
        return pinfoRepo.save(pinfo).toString();
    }
}
