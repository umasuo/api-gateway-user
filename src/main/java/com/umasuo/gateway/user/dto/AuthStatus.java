package com.umasuo.gateway.user.dto;

import lombok.Data;

/**
 * Check user's auth status.
 */
@Data
public class AuthStatus {

  /**
   * User Id.
   */
  private String userId;

  /**
   * Is login.
   */
  private boolean isLogin;

  // TODO: 17/6/21 后期添加scope等控制
}
