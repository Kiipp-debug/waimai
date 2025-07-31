package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.context.annotation.Bean;



public interface UserService {


    /**
     * 微信登录功能
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);

}
