package com.izotech.userservice.service;

import com.izotech.userservice.dto.ResponseDto;
import com.izotech.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
