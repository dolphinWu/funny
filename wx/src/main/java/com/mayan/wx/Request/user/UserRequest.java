package com.mayan.wx.Request.user;

import lombok.Data;

import java.util.Date;

@Data
public class UserRequest {

    private Integer id;

    private String nickName;

    private String headPortrait;

    private String createUser;

    private Date createDate;

    private String lastModifyUser;

    private Date lastModifyDate;
}
