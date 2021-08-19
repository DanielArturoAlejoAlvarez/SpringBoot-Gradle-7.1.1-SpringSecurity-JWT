package com.mediasoft.services.user.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(unique = true, length = 128, nullable = false)
    private String email;
    @Column(unique = true)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 512)
    private String avatar;
    private Boolean status;
    private Collection<Role> roles;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
}
