package com.getclayton.report.Task.Report.Service.controller;

import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportDTO;
import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;
import com.getclayton.report.Task.Report.Service.util.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/*
 * @author okka
 * @created 24/04/2023 - 14:11
 */
@RestController
public class TaskExecutionReportController {
    private Mapper mapper;


    @PostMapping(path = "/v1/api/taskexecutionreport")
    public ResponseEntity<TaskExecutionReportEntity> persistBook(@Valid @RequestBody TaskExecutionReportDTO taskExecutionReportDTO) {
        // convert entity
        TaskExecutionReportEntity taskExecutionReportEntity = mapper.toTaskExecutionReportEntity(taskExecutionReportDTO);
        //return result
        return ResponseEntity.ok(taskExecutionReportEntity);

    }
}
