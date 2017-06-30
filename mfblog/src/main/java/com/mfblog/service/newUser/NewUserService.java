package com.mfblog.service.newUser;

import com.mfblog.domain.TestNewUser;
import com.mfblog.service.BaseService;
import org.apache.ibatis.javassist.NotFoundException;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liushiyu on 2017/6/30.
 */
public interface NewUserService extends BaseService<TestNewUser> {

    @Override
    void add(TestNewUser testNewUser) throws Exception;

    @Override
    List<TestNewUser> findAll(int pageNum, int pageSize);

    @Override
    TestNewUser findOneById(Serializable id) throws NotFoundException;

    void del(String name) throws Exception;

    List<TestNewUser> findAll();
}
