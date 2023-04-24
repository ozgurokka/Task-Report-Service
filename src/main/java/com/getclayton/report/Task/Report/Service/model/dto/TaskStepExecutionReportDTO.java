package com.getclayton.report.Task.Report.Service.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.time.Duration;
import java.time.Instant;

/*
 * @author okka
 * @created 24/04/2023 - 13:55
 */
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskStepExecutionReportDTO {
    @NotBlank(message = "Task ID can not be empty !")
    private Long taskExecutionId;

    @NotBlank(message = "Task ID can not be empty !")
    private String stepName;

    @NotBlank(message = "Task ID can not be empty !")
    private Instant startDateTime;

    @NotBlank(message = "Task ID can not be empty !")
    private Instant endDateTime;

    @NotBlank(message = "Task ID can not be empty !")
    private Duration executionTimeSeconds;

    @NotBlank(message = "Task ID can not be empty !")
    private String errorMessage;
}
