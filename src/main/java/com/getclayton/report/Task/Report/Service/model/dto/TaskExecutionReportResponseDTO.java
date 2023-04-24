package com.getclayton.report.Task.Report.Service.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskExecutionReportResponseDTO {
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

    private List<TaskStepExecutionReportDTO> taskStepExecutionReportDTOList;
}
