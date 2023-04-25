package com.getclayton.report.Task.Report.Service.controller;

import com.getclayton.report.Task.Report.Service.services.TaskExecutionReportService;
import com.getclayton.report.Task.Report.Service.services.TaskStepExecutionReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author okka
 * @created 25/04/2023 - 14:01
 */

@RestController
public class TaskStepExecutionReportController {
    @Autowired
    private TaskStepExecutionReportService service;
    @GetMapping("/v1/api/taskexecutionreport/{taskId}/steps")
    public ResponseEntity<List<Comment>> getAllCommentsByTutorialId(@PathVariable(value = "tutorialId") Long tutorialId) {
        if (!tutorialRepository.existsById(tutorialId)) {
            throw new ResourceNotFoundException("Not found Tutorial with id = " + tutorialId);
        }

        List<Comment> comments = commentRepository.findByTutorialId(tutorialId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}
