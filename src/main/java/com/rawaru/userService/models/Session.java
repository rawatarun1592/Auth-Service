package com.rawaru.userService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "sessions")
@Getter
@Setter
public class Session extends BaseModel {

    private String token;

    private Date expiringAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.ORDINAL)
    private SessionStatus sessionStatus;
}

//@Getter
//@Setter
//public class Session extends BaseModel {
//    private String token;
//    private Date expiringAt;
//    @ManyToOne
//    private User user;
//    @Enumerated(EnumType.ORDINAL)
//    private SessionStatus sessionStatus;
//}
