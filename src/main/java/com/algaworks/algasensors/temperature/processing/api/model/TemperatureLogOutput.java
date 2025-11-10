package com.algaworks.algasensors.temperature.processing.api.model;

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
public class TemperatureLogOutput {
    private UUID id;
    private TSID sensorId;
    OffsetDateTime registeredAt;
    private Double value;
}
