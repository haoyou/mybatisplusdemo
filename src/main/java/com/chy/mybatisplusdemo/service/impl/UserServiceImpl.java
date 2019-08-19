package com.chy.mybatisplusdemo.service.impl;

import com.chy.mybatisplusdemo.dto.UserDO;
import com.chy.mybatisplusdemo.errors.BusinessException;
import com.chy.mybatisplusdemo.errors.EnumList;
import com.chy.mybatisplusdemo.mapper.UserMapper;
import com.chy.mybatisplusdemo.pojo.User;
import com.chy.mybatisplusdemo.service.IUserService;
import com.chy.mybatisplusdemo.utils.DOConverPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Integer id) throws BusinessException {
        UserDO userDO = userMapper.selectUserByID(id);
        return DOConverPojo.convertFromDO(userDO);
    }
}
