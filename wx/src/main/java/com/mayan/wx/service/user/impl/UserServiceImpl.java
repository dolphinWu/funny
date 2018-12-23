package com.mayan.wx.service.user.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mayan.wx.Request.user.UserRequest;
import com.mayan.wx.mapper.user.UserAuthMapper;
import com.mayan.wx.mapper.user.UserMapper;
import com.mayan.wx.model.user.User;
import com.mayan.wx.model.user.UserAuth;
import com.mayan.wx.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAuthMapper userAuthMapper;

    @Override
    public PageInfo<User> findUserForPage(int pageSize, int pageNumber, UserRequest request) {
        PageHelper.startPage(pageNumber, pageSize, true);
        Map<String, Object> searchMap = new HashMap<>();
        List<User> userList = userMapper.findUserForPage(searchMap);
        if (!CollectionUtils.isEmpty(userList)) {
            List<Integer> userIdList = userList.stream().map(User::getId).collect(Collectors.toList());
            List<UserAuth> userAuths = userAuthMapper.selectUserAuthByUserIds(userIdList);
            if (!CollectionUtils.isEmpty(userAuths)) {
                Map<Integer, List<UserAuth>> listMap = userAuths.stream().collect(Collectors.groupingBy(UserAuth::getUserId, Collectors.toList()));
                userList.stream().forEach(user -> {
                    user.setUserAuthList(listMap.get(user.getId()));
                });
            }
        }

        PageInfo<User> userPage = new PageInfo<>(userList);
        return userPage;
    }
}
