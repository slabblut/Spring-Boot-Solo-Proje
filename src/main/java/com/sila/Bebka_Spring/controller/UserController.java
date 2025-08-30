package com.sila.Bebka_Spring.controller;


import com.sila.Bebka_Spring.dto.UserDto;
import com.sila.Bebka_Spring.model.User;
import com.sila.Bebka_Spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(/*http://localhost:8081/api/v1/user*/"/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(/*http://localhost:8081/api/v1/user/create*/"/create")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUserFromDto(userDto);
    }
    @GetMapping("/all")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

}



