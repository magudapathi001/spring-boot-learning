package com.rest.api.employee.controller;

import com.rest.api.employee.dto.ErmConfigMastDto;
import com.rest.api.employee.service.ErmMastConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/config")
public class ErmMastConfigController {

    @Autowired
    private ErmMastConfigService ermMastConfigService;

    @PostMapping
    public ResponseEntity<ErmConfigMastDto>createConfig(@RequestBody ErmConfigMastDto erm_data) {
        ErmConfigMastDto created_data = ermMastConfigService.createConfig(erm_data);
        return new ResponseEntity<>(created_data, HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<ErmConfigMastDto>> GetAllConfigs() {
        List<ErmConfigMastDto> all_data = ermMastConfigService.GetAllConfigs();
        return new ResponseEntity<>(all_data, HttpStatus.OK);
    }
}
