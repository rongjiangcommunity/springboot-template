package com.rongshuichang.service;

import com.rongshuichang.entity.Pinfo;

import java.util.List;
import java.util.Optional;

public interface PinfoService {
    List<Pinfo> findAll();
    Optional<Pinfo> findbyId(Long id);
    String savePinfo(Pinfo pinfo);

}
