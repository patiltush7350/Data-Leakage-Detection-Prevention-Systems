package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Model.DataTransferlLog;
import com.data.repository.DataTransferLogRepository;

@Service
public class DataTransferLogService {
	

	@Autowired
	private DataTransferLogRepository dataTransferLogRepository;
	
	public List<DataTransferlLog> getAlLogs(){
		return dataTransferLogRepository.findAll();
	}
	
	public DataTransferlLog saveLog(DataTransferlLog log) {
		return dataTransferLogRepository.save(log);
	}
	
}
