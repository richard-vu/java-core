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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Entity(name="addresses")
@Setter
@Getter
public class AddressEntity implements Serializable {

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 8180882456271958445L;

 @Id
 @GeneratedValue
 private long id;
 
 @Column(length=30, nullable=true)
 private String addressId;
 
 @Column(length=15, nullable=false)
 private String city;
 
 @Column(length=15, nullable=false)
 private String country;
 
 @Column(length=100, nullable=false)
 private String streetName;
 
 @Column(length=7, nullable=false)
 private String postalCode;
 
 @Column(length=10, nullable=false)
 private String type;
 
 @ManyToOne
 @JoinColumn(name="users_id")
 private UserEntity userDetails;
 
}
