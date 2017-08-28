package com.umasuo.gateway.user.config;

import lombok.Data;

/**
 * Ignore rule.
 */
@Data
public class IgnoreRule {

  /**
   * Host of request.
   */
  private String host;

  /**
   * Path of request.
   */
  private String path;

  /**
   * Method of request.
   */
  private String method;
}
