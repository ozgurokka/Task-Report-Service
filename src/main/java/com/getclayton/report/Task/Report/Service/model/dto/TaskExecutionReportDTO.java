package com.getclayton.report.Task.Report.Service.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

/*
 * @author okka
 * @created 24/04/2023 - 10:26
 */
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskExecutionReportDTO {
    @NotBlank(message = "Task ID can not be empty !")
    private Long taskId;

    @NotBlank(message = "Task ID can not be empty !")
    private Instant startDateTime;

    @NotBlank(message = "Task ID can not be empty !")
    private Instant endDateTime;

    @NotBlank(message = "Task ID can not be empty !")
    private int executionTimeSeconds;

    @NotBlank(message = "Task ID can not be empty !")
    private String errorMessage;

    @NotBlank(message = "Task ID can not be empty !")
    private List<TaskStepExecutionReportDTO> taskStepExecutionReportList;
}
