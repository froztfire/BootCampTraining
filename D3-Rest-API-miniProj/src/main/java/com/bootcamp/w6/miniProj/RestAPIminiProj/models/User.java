package com.bootcamp.w6.miniProj.RestAPIminiProj.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "auth_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}
