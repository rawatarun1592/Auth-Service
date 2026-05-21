package com.rawaru.userService.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "users")
@Getter
@Setter
@JsonDeserialize(as = User.class)
public class User extends BaseModel {

    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @JsonIgnore
    private Set<Role> roles = new HashSet<>();
}


//@Getter
//@Setter
//@JsonDeserialize(as = User.class)
//public class User {
//    private String email;
//    private String password;
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JsonIgnore
//    private Set<Role> roles = new HashSet<>();
//}
