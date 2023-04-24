package com.getclayton.report.Task.Report.Service.model.entity;

import com.getclayton.report.Task.Report.Service.util.Enumaration;
import lombok.*;

import javax.persistence.*;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Set;

/*
 * @author okka
 * @created 24/04/2023 - 09:27
 */
@Entity
@Table(name = "TaskStepExecutionReport")
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskStepExecutionReport
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @NonNull
    private Long id;

    @Column(name = "taskExecutionId",unique=true)
    @NonNull
    private Long taskExecutionId;

    @Column(name = "stepName")
    @NonNull
    private String stepName;

    @Column(name = "startDateTime")
    @NonNull
    private Instant startDateTime;

    @Column(name = "endDateTime")
    @NonNull
    private Instant endDateTime;

    @Column(name = "executionTimeSeconds")
    @NonNull
    private Duration executionTimeSeconds;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    @NonNull
    private Enumaration.SatusType status;

    @Column(name = "errorMessage")
    @NonNull
    private String errorMessage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id",insertable=false, updatable=false)
    private TaskExecutionReportEntity taskExecutionReport;
}
