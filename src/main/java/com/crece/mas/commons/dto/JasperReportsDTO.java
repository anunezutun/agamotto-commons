package com.crece.mas.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JasperReportsDTO implements Serializable {
    private transient Map<String, Object> parameters;
    private String fileName;
    private transient Object[] objects;
    private String plantilla;
}
