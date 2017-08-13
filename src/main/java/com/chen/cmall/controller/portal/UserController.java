package com.chen.cmall.controller.portal;

import com.chen.cmall.common.ServerResponse;
import com.chen.cmall.domain.User;
import com.chen.cmall.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {
    @Autowired
    UserRespository userRespository;

    public ServerResponse<User> login(String username, String password) {


        return null;
    }

}
