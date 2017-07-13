package com.umasuo.gateway.user.config;

import lombok.Data;

/**
 * Ignore rule.
 */
@Data
public class IgnoreRule {

  private String host;

  private String path;

  private String method;
}
