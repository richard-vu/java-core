/**
 * Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 */
package com.richard.app.securities;

import com.richard.app.shared.dto.StudentDto;
import com.richard.app.ws.ui.models.responses.StudentAddSuccess;

/**
 * @author richard
 *
 */
public interface StudentService {
 StudentAddSuccess addStudent(StudentDto studentDto);
}
