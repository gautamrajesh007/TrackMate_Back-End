package org.backend.trackmate.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.Set;

@Data
@EnableWebSecurity
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", nullable = false, unique = true)
    @Length(min = 5, message = "*Your user name must have at least 5 characters")
    @NotEmpty(message = "*Please provide a user name")
    private String userName;

    @Column(name = "first_name")
    @Length(min = 5, message = "*Your first name must have at least 5 characters")
    @NotEmpty(message = "*Please provide your first name")
    private String firstName;

    @Column(name = "last_name")
    @Length(min = 5, message = "*Your last name must have at least 5 characters")
    @NotEmpty(message = "*Please provide your last name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please provide your email")
    private String email;

    @Column(name = "phone_no", nullable = false, unique = true)
    @NotEmpty(message = "*Please provide your contact number")
    private Integer phone_no;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Column(name = "password", nullable = false, unique = true)
    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
    private String password;

    @Column(name = "active")
    private boolean active;

}
