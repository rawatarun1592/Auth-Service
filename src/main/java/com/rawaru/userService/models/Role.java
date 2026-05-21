package com.rawaru.userService.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonDeserialize(as = Role.class)
public class Role {
    private String role;
}
