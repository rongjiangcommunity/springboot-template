package com.rongshuichang.repository;

import com.rongshuichang.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoRepo extends JpaRepository<Userinfo, Long> {

}
