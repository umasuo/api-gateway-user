package com.umasuo.gateway.user.dto;

import lombok.Data;

/**
 * 用户权限状态，包含：是否登陆，所拥有的权限（scope）
 * Created by umasuo on 17/6/1.
 */
@Data
public class AuthStatus {

  private String userId;

  private boolean isLogin;

  // TODO: 17/6/21 后期添加scope等控制
}
