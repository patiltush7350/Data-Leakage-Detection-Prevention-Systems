package com.data.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.Model.DataTransferlLog;
import com.data.service.DataTransferLogService;

@RestController
@RequestMapping("/monitor")
public class DataMonitorController {

	@Autowired
    private DataTransferLogService dataTransferLogService;

    @GetMapping("/logs")
    public List<DataTransferlLog> getAllLogs() {
        return dataTransferLogService.getAlLogs();
    }
}