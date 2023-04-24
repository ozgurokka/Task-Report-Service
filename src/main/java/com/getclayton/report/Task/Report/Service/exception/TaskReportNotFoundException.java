package com.getclayton.report.Task.Report.Service.exception;

public class TaskReportNotFoundException  extends RuntimeException{
    public TaskReportNotFoundException(String id){
        super(" Report Id: '" + id + "' not found !");
    }
}

