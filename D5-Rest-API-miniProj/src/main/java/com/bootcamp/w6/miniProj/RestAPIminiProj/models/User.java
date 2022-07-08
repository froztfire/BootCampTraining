package com.bootcamp.w6.miniProj.RestAPIminiProj.models;

import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.Stats;
import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.UserRole;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Data
@Table(name = "auth_user")
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity{
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
