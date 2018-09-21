package com.xiaochen.demo.dao;

import com.xiaochen.demo.dynamicDs.DataSourceTarget;
import com.xiaochen.demo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByName(String name);

    //@Query(nativeQuery = true,value = "SELECT * FROM t_user_info WHERE id=?1")
    UserInfo findById(int id);

}