package com.bootcamp.w6.miniProj.RestAPIminiProj.models;

import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.Stats;
import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.UserRole;
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
    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Column
    @Enumerated(EnumType.STRING)
    private Stats status;

}
