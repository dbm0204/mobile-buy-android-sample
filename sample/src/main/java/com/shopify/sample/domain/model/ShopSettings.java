package com.shopify.sample.domain.model;

import androidx.annotation.NonNull;

import static com.shopify.sample.util.Util.checkNotNull;

public final class ShopSettings {
  @NonNull
  public final String name;
  @NonNull
  public final String countryCode;

  public ShopSettings(@NonNull final String name, @NonNull final String countryCode) {
    this.name = checkNotNull(name, "name can't be null");
    this.countryCode = checkNotNull(countryCode, "countryCode can't be null");
  }

  @NonNull
  public String getName() {
    return name;
  }

  @NonNull
  public String getCountryCode() {
    return countryCode;
  }

  @Override
  public String toString() {
    return "ShopSettings{" +
        "name='" + name + '\'' +
        ", countryCode='" + countryCode + '\'' +
        '}';
  }
}
