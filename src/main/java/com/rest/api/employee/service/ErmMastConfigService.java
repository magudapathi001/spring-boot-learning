package com.rest.api.employee.service;

import com.rest.api.employee.dto.ErmConfigMastDto;

import java.util.List;


public interface ErmMastConfigService {
    ErmConfigMastDto createConfig(ErmConfigMastDto ermConfigMastDto);

    List<ErmConfigMastDto> GetAllConfigs();
}
