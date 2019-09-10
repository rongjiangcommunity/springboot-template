package com.rongshuichang.repository;

import com.rongshuichang.entity.Pinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinfoRepo extends JpaRepository<Pinfo, Long> {

}
