package com.bootcamp.w6.miniProj.RestAPIminiProj.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false, columnDefinition = "TIMESTAMP(0) default CURRENT_TIMESTAMP")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime createdDate = LocalDateTime.now();
    @LastModifiedDate
    @Column(name = "updated_date", nullable = false, columnDefinition = "TIMESTAMP(0) default CURRENT_TIMESTAMP")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime updatedDate = LocalDateTime.now();
}


