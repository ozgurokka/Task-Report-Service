package com.getclayton.report.Task.Report.Service.services.impl;

/*
 * @author okka
 * @created 25/04/2023 - 13:58
 */

import com.getclayton.report.Task.Report.Service.repositories.TaskExecutionReportRepository;
import com.getclayton.report.Task.Report.Service.repositories.TaskStepExecutionReportRepository;
import com.getclayton.report.Task.Report.Service.services.TaskStepExecutionReportService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskStepExecutionReportServiceImpl implements TaskStepExecutionReportService {

    @Autowired
    TaskStepExecutionReportRepository stepRepository;

    @Autowired
    TaskExecutionReportRepository reportRepository;

    @Autowired
    private ModelMapper modelMapper;
}
