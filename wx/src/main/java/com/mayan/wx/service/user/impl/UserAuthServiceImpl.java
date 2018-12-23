package com.mayan.wx.service.user.impl;

import com.mayan.wx.model.user.UserAuth;
import com.mayan.wx.service.user.UserAuthService;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Override
    public UserAuth findByUsername(String username) {
        return null;
    }
}
