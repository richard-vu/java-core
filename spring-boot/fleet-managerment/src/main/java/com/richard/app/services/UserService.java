/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.services;

import java.util.List;

import com.richard.app.shared.dto.UserDto;
import com.richard.app.ws.ui.models.requests.UserDetailsRequestEditModel;
import com.richard.app.ws.ui.models.responses.Notification;
import com.richard.app.ws.ui.models.responses.UserDetailsReponseModel;

/**
 * @author richard
 *
 */
public interface UserService {
 Notification createUser(UserDto userDto);
 
 Notification createAllUser(List<UserDto> listUserDto);

 List<UserDetailsReponseModel> getAllUsers();
 
 UserDetailsReponseModel getUserById(Long id);
 
 Notification updateUserByUserId(String id, UserDetailsRequestEditModel userDetailsRequestEditModel);
 
 Notification deleleByUserId(String id);
 
 Notification deleleAllUser();
 
}
