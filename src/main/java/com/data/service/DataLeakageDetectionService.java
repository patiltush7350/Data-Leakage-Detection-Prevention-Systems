package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Model.DataTransferlLog;
import com.data.repository.DataTransferLogRepository;

@Service
public class DataLeakageDetectionService {
	@Autowired
	private DataTransferLogRepository logRepository;

	public void detectLeakage() {
		List<DataTransferlLog> logs = logRepository.findAll();

		for (DataTransferlLog log : logs) {
			if (isAnomalous(log)) {
				sendAlert(log);
			}
		}
	}

	private boolean isAnomalous(DataTransferlLog log) {
		// Example rule: Data size exceeds 100MB
		return log.getDataSize() > 100 * 1024 * 1024;
	}

	private void sendAlert(DataTransferlLog log) {
		// Send alert to administrators
		System.out.println(
				"Alert: Potential data leak detected for user " + log.getUserId() + " at " + log.getTimestamp());
	}
}
