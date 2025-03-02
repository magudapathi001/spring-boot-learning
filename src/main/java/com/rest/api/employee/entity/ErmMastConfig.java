package com.rest.api.employee.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import org.hibernate.annotations.JdbcTypeCode;
import java.sql.Types;
import java.util.Map;

@Entity
@Table(name = "erm_mast_config")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErmMastConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "config_id")
    private Long configId;

    @Column(name = "config_title", length = 255)
    private String configTitle;

    @Column(name = "config_type", length = 255)
    private String configType;

    @Column(name = "config_attributes", columnDefinition = "jsonb")
    @JdbcTypeCode(Types.OTHER)
    private Map<String, Object> configAttributes;

    @Column(name = "config_description", length = 255)
    private String configDescription;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "created_by", length = 255)
    private String createdBy;

    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;

    @Column(name = "modified_by", length = 255)
    private String modifiedBy;

    @Column(name = "deleted_on")
    private LocalDateTime deletedOn;

    @Column(name = "deleted_by", length = 255)
    private String deletedBy;

    @Column(name = "deleted", nullable = false)
    private Boolean deleted = false;

    @Column(name = "compcode")
    private Long compCode;
}
