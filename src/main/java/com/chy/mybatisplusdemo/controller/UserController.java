package com.chy.mybatisplusdemo.controller;

import com.chy.mybatisplusdemo.errors.BusinessException;
import com.chy.mybatisplusdemo.errors.EnumList;
import com.chy.mybatisplusdemo.pojo.User;
import com.chy.mybatisplusdemo.response.ComnReturnType;
import com.chy.mybatisplusdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 通过主键ID获取用户
     * */
    @RequestMapping("/getuser")
    @ResponseBody
    public ComnReturnType getUserByID(Integer id) throws BusinessException {
        if (id == null){
            throw new BusinessException(EnumList.PARAMETER_INVALID,"ID不能为空");
        }
        User user = userService.getUser(id);
        //对密码做临时处理 本应该从数据库中查询
        user.setPassword("123456");
        return ComnReturnType.create(user);
    }
}
