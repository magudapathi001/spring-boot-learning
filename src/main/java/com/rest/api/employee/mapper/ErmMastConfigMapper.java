package com.rest.api.employee.mapper;

import com.rest.api.employee.dto.ErmConfigMastDto;
import com.rest.api.employee.entity.ErmMastConfig;

public class ErmMastConfigMapper {
    public static ErmConfigMastDto toErmConfigMastDio(ErmMastConfig ermMastConfig){
        return new ErmConfigMastDto(
                ermMastConfig.getConfigId(),
                ermMastConfig.getConfigTitle(),
                ermMastConfig.getConfigType(),
                ermMastConfig.getConfigAttributes(),
                ermMastConfig.getConfigDescription(),
                ermMastConfig.getCreatedOn(),
                ermMastConfig.getCreatedBy(),
                ermMastConfig.getModifiedOn(),
                ermMastConfig.getModifiedBy(),
                ermMastConfig.getDeletedOn(),
                ermMastConfig.getDeletedBy(),
                ermMastConfig.getDeleted(),
                ermMastConfig.getCompCode()
        );
    }

    public static ErmMastConfig toErmConfigMast(ErmConfigMastDto ermConfigMastDto){
        return new ErmMastConfig(
                ermConfigMastDto.getConfigId(),
                ermConfigMastDto.getConfigTitle(),
                ermConfigMastDto.getConfigType(),
                ermConfigMastDto.getConfigAttributes(),
                ermConfigMastDto.getConfigDescription(),
                ermConfigMastDto.getCreatedOn(),
                ermConfigMastDto.getCreatedBy(),
                ermConfigMastDto.getModifiedOn(),
                ermConfigMastDto.getModifiedBy(),
                ermConfigMastDto.getDeletedOn(),
                ermConfigMastDto.getDeletedBy(),
                ermConfigMastDto.getDeleted(),
                ermConfigMastDto.getCompCode()
        );
    }
}
