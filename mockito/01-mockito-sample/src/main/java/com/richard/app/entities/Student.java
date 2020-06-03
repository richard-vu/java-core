/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class Student {
 private String fullName;
 private String userName;
 private String password;
 private boolean isEnrolled;
 private String tranScript;
}
