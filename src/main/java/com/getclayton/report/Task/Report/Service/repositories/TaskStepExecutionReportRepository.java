package com.getclayton.report.Task.Report.Service.repositories;

import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;
import com.getclayton.report.Task.Report.Service.model.entity.TaskStepExecutionReportEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/*
 * @author okka
 * @created 25/04/2023 - 13:59
 */
public interface TaskStepExecutionReportRepository extends PagingAndSortingRepository<TaskStepExecutionReportEntity,Long> {
}
