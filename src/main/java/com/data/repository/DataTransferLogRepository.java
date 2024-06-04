package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.Model.DataTransferlLog;

public interface DataTransferLogRepository extends JpaRepository<DataTransferlLog, Long> {

}
