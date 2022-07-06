package com.bootcamp.w6.miniProj.RestAPIminiProj.models;

import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.Role;
import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.Stats;
import lombok.Data;
import javax.persistence.*;
@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    @Enumerated(EnumType.STRING)
    private Role level;
    @Column
    private String email;
    @Column
    private String community;
    @Column
    @Enumerated(EnumType.STRING)
    private Stats status;
}

