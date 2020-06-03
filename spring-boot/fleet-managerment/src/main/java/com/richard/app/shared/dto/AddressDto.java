/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.shared.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class AddressDto {
 
 private long id;
 
 private String addressId;
 
 private String city;
 
 private String country;
 
 private String streetName;
 
 private String postalCode;
 
 private String type;
 
 private UserDto userDetails;
 
}
