package com.rest.api.employee.service.impl;

import com.rest.api.employee.dto.ErmConfigMastDto;
import com.rest.api.employee.entity.ErmMastConfig;
import com.rest.api.employee.mapper.ErmMastConfigMapper;
import com.rest.api.employee.repository.ErmMastConfigRepository;
import com.rest.api.employee.service.ErmMastConfigService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ErmMastConfigImpl implements ErmMastConfigService {

    private ErmMastConfigRepository ermMastConfigRepository;

    @Override
    public ErmConfigMastDto createConfig(ErmConfigMastDto ermConfigMastDto) {
        ErmMastConfig ermConfigMasts = ErmMastConfigMapper.toErmConfigMast(ermConfigMastDto);
        ErmMastConfig erm_data = ermMastConfigRepository.save(ermConfigMasts);
        return ErmMastConfigMapper.toErmConfigMastDio(erm_data);
    }

    @Override
    public List<ErmConfigMastDto> GetAllConfigs() {
        List<ErmMastConfig> configs = ermMastConfigRepository.findAll();
        return configs.stream().map(ErmMastConfigMapper::toErmConfigMastDio).collect(Collectors.toList());

    }
}
