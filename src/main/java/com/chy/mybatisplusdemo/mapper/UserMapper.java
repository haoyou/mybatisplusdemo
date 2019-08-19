package com.chy.mybatisplusdemo.mapper;

import com.chy.mybatisplusdemo.dto.UserDO;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    UserDO selectUserByID(Integer id);
    UserDO selectUserByTelphone(String phonenumber);
}
