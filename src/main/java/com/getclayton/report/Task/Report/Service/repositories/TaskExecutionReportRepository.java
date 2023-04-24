package com.getclayton.report.Task.Report.Service.repositories;

import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ozgurokka on 4/24/23 10:39 PM
 */

@Repository
public interface TaskExecutionReportRepository extends PagingAndSortingRepository<TaskExecutionReportEntity,Long> {
}
