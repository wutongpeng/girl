package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wutongpeng on 2017/1/26.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{

    public List<Girl> findByAge(Integer age);

}
