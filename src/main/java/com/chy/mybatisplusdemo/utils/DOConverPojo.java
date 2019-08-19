package com.chy.mybatisplusdemo.utils;

import com.chy.mybatisplusdemo.dto.UserDO;
import com.chy.mybatisplusdemo.pojo.User;
import org.springframework.beans.BeanUtils;

public class DOConverPojo {
    public static User convertFromDO(UserDO userDO){
        if (userDO == null){
            return null;
        }
        User user = new User();
        BeanUtils.copyProperties(userDO,user);
        user.setPassword("123456");
        return user;
    }

}
