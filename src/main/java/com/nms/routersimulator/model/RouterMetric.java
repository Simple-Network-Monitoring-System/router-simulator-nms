package com.nms.routersimulator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RouterMetric {

    private String deviceId;

    private Double temperature;

    private Long numPackets;

    private String health;

    private LocalDateTime timestamp;

}

