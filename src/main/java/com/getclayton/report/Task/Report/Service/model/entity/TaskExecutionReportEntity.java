package com.getclayton.report.Task.Report.Service.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

/*
 * @author okka
 * @created 24/04/2023 - 08:41
 */
@Entity
@Table(name = "TaskExecutionReport")
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskExecutionReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reportId")
    private Long reportId;

    @Column(name = "taskId", unique=true)
    @NonNull
    private Long taskId;

    @Column(name = "startDateTime")
    @NonNull
    private Instant startDateTime;

    @Column(name = "endDateTime")
    @NonNull
    private Instant endDateTime;

    @Column(name = "executionTimeSeconds")
    @NonNull
    private int executionTimeSeconds;

    @Column(name = "errorMessage")
    @NonNull
    private String errorMessage;

    @OneToMany(mappedBy = "taskExecutionReport",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<TaskStepExecutionReportEntity> taskStepExecutionReportList;
}
