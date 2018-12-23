package com.mayan.wx.service.user;

import com.mayan.wx.model.user.UserAuth;

public interface UserAuthService {

    UserAuth findByUsername(String username);
}
