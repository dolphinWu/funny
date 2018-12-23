package com.mayan.wx.service.user;

import com.github.pagehelper.PageInfo;
import com.mayan.wx.Request.user.UserRequest;
import com.mayan.wx.model.user.User;

/**
 * @author wudaoping
 */
public interface UserService {

    PageInfo<User> findUserForPage(int pageSize, int pageNumber, UserRequest request);

}
