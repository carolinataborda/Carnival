package com.carnival.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Page {
  Carnival("Carnival", "https:carnival.com");

  private final String key;
  private final String value;
  private static Map<String, String> url;

  Page(String key, String value) {
    this.key = key;
    this.value = value;
  }

  static {
    Map<String, String> pages = new HashMap<>();
    for (Page uri : Page.values()) {
      pages.put(uri.key, uri.value);
    }
    url = Collections.unmodifiableMap(pages);
  }

  public static String getUrl(String page) {
    if (url.containsKey(page)) {
      return url.get(page);
    }
    return null;
  }
}
