package com.getclayton.report.Task.Report.Service.services.impl;

import com.getclayton.report.Task.Report.Service.exception.TaskReportNotFoundException;
import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportDTO;
import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportResponseDTO;
import com.getclayton.report.Task.Report.Service.model.dto.TaskStepExecutionReportDTO;
import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;
import com.getclayton.report.Task.Report.Service.model.entity.TaskStepExecutionReportEntity;
import com.getclayton.report.Task.Report.Service.repositories.TaskExecutionReportRepository;
import com.getclayton.report.Task.Report.Service.services.TaskExecutionReportService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TaskExecutionReportServiceImpl implements TaskExecutionReportService {
    @Autowired
    TaskExecutionReportRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TaskExecutionReportEntity saveTaskExecutionReport(TaskExecutionReportDTO dto) {
       /* TypeMap<TaskExecutionReportDTO,TaskExecutionReportEntity> propertyMapper = modelMapper.createTypeMap(TaskExecutionReportDTO.class, TaskExecutionReportEntity.class);
        propertyMapper.addMapping(TaskExecutionReportDTO::getTaskId, TaskExecutionReportEntity::setTaskId);*/

        TaskExecutionReportEntity entity = modelMapper.map(dto,TaskExecutionReportEntity.class);
        return repository.save(entity);
    }

    @Override
    public TaskExecutionReportDTO getReport(Long id) {
        Optional<TaskExecutionReportEntity> entity = repository.findById(id);
        if(!entity.isPresent()){
            throw new TaskReportNotFoundException(id+"");
        }
        return modelMapper.map(entity.get(),TaskExecutionReportDTO.class);
    }

}
