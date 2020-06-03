/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.ws.ui.models.responses;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@AllArgsConstructor
@Getter
@Setter
public class Notification implements Serializable{

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 5665531151503932301L;
 
 private String code;
 
 private String message;

}
