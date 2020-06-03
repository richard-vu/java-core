/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.io.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class ProductEntity implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 1L;

 private String id;
 
 private String name;
}
