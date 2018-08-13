package com.sinosoft.analysis.service.impl;

import com.sinosoft.analysis.domain.dao.UserMapper;
import com.sinosoft.analysis.domain.entity.User;
import com.sinosoft.analysis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public User findById(int id) {
        User po = mapper.selectByPrimaryKey(id);
        return po;
    }
}
