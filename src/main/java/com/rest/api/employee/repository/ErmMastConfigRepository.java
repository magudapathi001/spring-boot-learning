package com.rest.api.employee.repository;

import com.rest.api.employee.dto.ErmConfigMastDto;
import com.rest.api.employee.entity.ErmMastConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErmMastConfigRepository extends JpaRepository<ErmMastConfig, Long> {

}
