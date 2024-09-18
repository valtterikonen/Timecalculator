package com.example.easybankproject.models;

import com.example.easybankproject.db.UserRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "user")
public class User {

    private UserRepository userRepository;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String streetAddress;

    public user getUser() {
        return this;
    }
}
