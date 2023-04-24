package com.getclayton.report.Task.Report.Service.services.impl;

import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportDTO;
import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;
import com.getclayton.report.Task.Report.Service.repositories.TaskExecutionReportRepository;
import com.getclayton.report.Task.Report.Service.services.TaskExecutionReportService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskExecutionReportServiceImpl implements TaskExecutionReportService {
    @Autowired
    TaskExecutionReportRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TaskExecutionReportEntity saveTaskExecutionReport(TaskExecutionReportDTO dto) {
        TaskExecutionReportEntity entity = modelMapper.map(dto,TaskExecutionReportEntity.class);
        return repository.save(entity);
    }
}
