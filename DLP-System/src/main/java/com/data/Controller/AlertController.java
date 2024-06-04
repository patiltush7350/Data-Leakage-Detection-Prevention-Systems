package com.data.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.Model.Alert;
import com.data.repository.AlertRepository;

@RestController
public class AlertController {
	 @GetMapping("/alerts")
	    public List<Alert> getAlerts() {
	        return AlertRepository.findAll();
	    }
}
