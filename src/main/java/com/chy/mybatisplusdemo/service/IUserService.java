package com.chy.mybatisplusdemo.service;

import com.chy.mybatisplusdemo.errors.BusinessException;
import com.chy.mybatisplusdemo.pojo.User;

public interface IUserService {
    User getUser(Integer id) throws BusinessException;
}
