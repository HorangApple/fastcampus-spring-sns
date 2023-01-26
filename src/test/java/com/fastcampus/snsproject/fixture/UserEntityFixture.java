package com.fastcampus.snsproject.fixture;

import com.fastcampus.snsproject.model.entity.UserEntity;

public class UserEntityFixture {

    // 테스트를 위한 가짜 UserEntity
    public static UserEntity get(String userName, String password) {
        UserEntity result = new UserEntity();
        result.setUserName(userName);
        result.setPassword(password);
        return result;
    }
}
