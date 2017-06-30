package com.mfblog.service.newUser;

import com.mfblog.dao.TestNewDao;
import com.mfblog.domain.TestNewUser;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liushiyu on 2017/6/30.
 */
@Service("newUserService")
public class NewUserServiceImpl implements NewUserService {

    @Autowired
    private TestNewDao testNewDao;

    @Override
    public List<TestNewUser> findAll() {

        return testNewDao.findAll();
    }

    @Override
    public void add(TestNewUser testNewUser) throws Exception {

        testNewDao.add(testNewUser);
    }

    @Override
    public List<TestNewUser> findAll(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public TestNewUser findOneById(Serializable id) throws NotFoundException {
        return null;
    }

    @Override
    public void del(String name) throws Exception {
        TestNewUser testNewUser = new TestNewUser(name,"","");
        testNewDao.del(testNewUser);
    }
}
