package com.getclayton.report.Task.Report.Service.controller;

import com.getclayton.report.Task.Report.Service.exception.NotFoundException;
import com.getclayton.report.Task.Report.Service.exception.TaskReportNotFoundException;
import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportDTO;
import com.getclayton.report.Task.Report.Service.model.dto.TaskExecutionReportResponseDTO;
import com.getclayton.report.Task.Report.Service.model.entity.TaskExecutionReportEntity;
import com.getclayton.report.Task.Report.Service.services.TaskExecutionReportService;
import com.getclayton.report.Task.Report.Service.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/*
 * @author okka
 * @created 24/04/2023 - 14:11
 */
@RestController
public class TaskExecutionReportController {
    @Autowired
    private TaskExecutionReportService service;

    @PostMapping(path = "/v1/api/taskexecutionreport")
    public ResponseEntity<TaskExecutionReportEntity> TaskExecutionReport(@Valid @RequestBody TaskExecutionReportDTO taskExecutionReportDTO) {
        return ResponseEntity.ok(service.saveTaskExecutionReport(taskExecutionReportDTO));
    }
    @GetMapping(path = "/v1/api/taskexecutionreport/{id}")
    public ResponseEntity<TaskExecutionReportDTO> getTaskExecutionReport(@PathVariable(name = "id", required = true) Long id) throws TaskReportNotFoundException {
        return ResponseEntity.ok(service.getReport(id));
    }

}
