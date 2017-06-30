package com.mfblog.dao;

import com.mfblog.domain.TestNewUser;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liushiyu on 2017/6/30.
 */
@Repository("testNewDao")
public interface TestNewDao extends Dao<TestNewUser> {

    @Override
    int add(TestNewUser testNewUser);

    @Override
    int del(TestNewUser testNewUser);

    @Override
    int update(TestNewUser testNewUser);

    @Override
    TestNewUser findOneById(Serializable Id);

    @Override
    List<TestNewUser> findAll();
}
