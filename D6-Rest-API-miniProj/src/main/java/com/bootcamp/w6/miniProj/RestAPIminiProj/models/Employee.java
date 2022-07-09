package com.bootcamp.w6.miniProj.RestAPIminiProj.models;

import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.EmployeeRole;
import com.bootcamp.w6.miniProj.RestAPIminiProj.enums.Stats;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
@Entity
@Data
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    @Enumerated(EnumType.STRING)
    private EmployeeRole level;
    @Column
    private String email;
    @Column
    private String community;
    @Column
    @Enumerated(EnumType.STRING)
    private Stats status;
}

