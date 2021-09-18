package com.mgd.service.impl;

import com.mgd.entity.User;
import com.mgd.service.UserService;

/**
 * @Description:
 * @Author: 梅广东
 * @CreateTime: 2021/9/7
 * @Company:
 */
public class UserserviceImpl  implements UserService {
    @Override
    public User selectUserById(Integer id,String name) {

        User user=new User();
        user.setId(id);
        user.setName(name);

        return user;
    }
}
