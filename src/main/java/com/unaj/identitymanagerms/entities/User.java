package com.unaj.identitymanagerms.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String username;

    @NotBlank
    private String password;

    private Boolean enabled;

    @Transient
    private boolean admin;

    @JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id") },
            inverseJoinColumns = {@JoinColumn(name = "role_id") },
            uniqueConstraints = {@UniqueConstraint(columnNames = { "user_id", "role_id" }) })
    private List<Role> roles;

    @Email
    @NotBlank
    @Column(unique = true)
    private String email;

    public Boolean isEnabled() {
        return enabled;
    }

    public boolean isAdmin() {
        return admin;
    }


}

