package com.epam.business.api.model;

import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private Page page;
    private List<User> content;
}