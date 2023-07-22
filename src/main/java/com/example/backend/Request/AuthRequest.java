package com.example.backend.Request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
//import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class AuthRequest {
    @NotBlank(message = "username cannot be blank")
    @Size(max = 20, message = "username cannot be more than 20 character long")
    @Pattern(regexp = "[a-zA-Z]*", message = "user name cant start with number or special characters")
    private String username;
    @NotBlank(message = "password cannot be blank")
    @Size(min = 8, message = "password cannot be less than 8 character long")
    @Pattern(regexp = "[a-zA-Z0-9]*", message = "Password cant have special characters")
    private String password;

}
