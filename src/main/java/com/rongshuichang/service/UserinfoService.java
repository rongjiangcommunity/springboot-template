package com.rongshuichang.service;

import com.rongshuichang.entity.Userinfo;

import java.util.List;
import java.util.Optional;

public interface UserinfoService {
    List<Userinfo> findAll();
    Optional<Userinfo> findbyId(Long id);

}
