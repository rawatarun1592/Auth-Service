package com.rawaru.userService.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "roles")
@Getter
@Setter
@JsonDeserialize(as = Role.class)
public class Role extends BaseModel {

    private String role;
}
//@Getter
//@Setter
//@JsonDeserialize(as = Role.class)
//public class Role {
//    private String role;
//}
