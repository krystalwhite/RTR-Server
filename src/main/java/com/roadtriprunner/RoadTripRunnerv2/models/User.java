package com.roadtriprunner.RoadTripRunnerv2.models;

import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
public class User extends AbstractEntity {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotBlank(message="Please enter your name.")
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank(message="Please enter a username.")
    @Size(min=5, max=25, message="Password must be between 5 and 25 characters.")
    private String username;

    private String pwHash;

    public User(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public User(String username, String password) {
        this.username = username;
        this.pwHash = password;
    }

    public User(){}

    public boolean isPasswordMatching(String password) {
        return encoder.matches(password, pwHash);
    }
}
