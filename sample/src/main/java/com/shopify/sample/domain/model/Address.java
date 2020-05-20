/*
 *   The MIT License (MIT)
 *
 *   Copyright (c) 2015 Shopify Inc.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package com.shopify.sample.domain.model;

import androidx.annotation.Nullable;

/**
 * Convenient class that represents a Shopify-compliant address.
 */
public final class Address {
  private static final int FIRST_NAME_PART = 0;
  private static final int LAST_NAME_PART = 1;

  @Nullable public final String address1;
  @Nullable public final String address2;
  @Nullable public final String city;
  @Nullable public final String country;
  @Nullable public final String firstName;
  @Nullable public final String lastName;
  @Nullable public final String phone;
  @Nullable public final String province;
  @Nullable public final String zip;

  public Address(@Nullable final String address1,
                 @Nullable final String address2,
                 @Nullable final String city,
                 @Nullable final String country,
                 @Nullable final String firstName,
                 @Nullable final String lastName,
                 @Nullable final String phone,
                 @Nullable final String province,
                 @Nullable final String zip) {
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.country = country;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.province = province;
    this.zip = zip;
  }
  /** DESC:         Getter Function for First-Name Part
   * Return-Type:  int
   * Params:       None
   */
  public static int getFirstNamePart() {
    return FIRST_NAME_PART;
  }
  /* Desc:        Getter Function for Last-Name Part
   * Return-Type: int
   * Params:      None
   */
  public static int getLastNamePart() {
    return LAST_NAME_PART;
  }
  /**
   * Desc:          Getter Function for address1
   * Return-Type:   String
   * Params:        None
   */
  @Nullable
  public String getAddress1() {
    return address1;
  }
  /**
   * Desc: Getter Function for address2
   * Return-Type: String
   * Params:      None
   **/
  @Nullable
  public String getAddress2() {
    return address2;
  }
  /**
   * Desc:        Getter Function for City
   * Return-Type: String
   * Params:      None
   */
  @Nullable
  public String getCity() {
    return city;
  }

  /**
   *Desc: Getter Function for Country
   * Return Type: String
   * Params: None
   * @return
   */
  @Nullable
  public String getCountry() {
    return country;
  }

  @Nullable
  public String getFirstName() {
    return firstName;
  }

  @Nullable
  public String getLastName() {
    return lastName;
  }

  @Nullable
  public String getPhone() {
    return phone;
  }

  @Nullable
  public String getProvince() {
    return province;
  }

  @Nullable
  public String getZip() {
    return zip;
  }

  @Override
  public String toString() {
    return "PayAddress{" +
      "address1='" + address1 + '\'' +
      ", address2='" + address2 + '\'' +
      ", city='" + city + '\'' +
      ", country='" + country + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", phone='" + phone + '\'' +
      ", province='" + province + '\'' +
      ", zip='" + zip + '\'' +
      '}';
  }
}
