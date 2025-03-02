package com.rest.api.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErmConfigMastDto {
    private Long configId;
    private String configTitle;
    private String configType;
    private Map<String, Object> configAttributes;
    private String configDescription;
    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime modifiedOn;
    private String modifiedBy;
    private LocalDateTime deletedOn;
    private String deletedBy;
    private Boolean deleted = false;
    private Long compCode;
}
