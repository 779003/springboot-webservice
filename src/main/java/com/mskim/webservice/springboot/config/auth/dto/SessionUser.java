package com.mskim.webservice.springboot.config.auth.dto;

import com.mskim.webservice.springboot.domain.user.User;
import java.io.Serializable;
import lombok.Getter;

@Getter
public class SessionUser implements Serializable {

    private final String name;
    private final String email;
    private final String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
