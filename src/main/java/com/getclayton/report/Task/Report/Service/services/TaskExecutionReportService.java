package com.getclayton.report.Task.Report.Service.services;

import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportDTO;
import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportResponseDTO;
import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;

/**
 * Created by ozgurokka on 4/24/23 10:39 PM
 */
public interface TaskExecutionReportService {
    public TaskExecutionReportEntity saveTaskExecutionReport(TaskExecutionReportDTO dto);

    public TaskExecutionReportDTO getReport(Long id);
}
