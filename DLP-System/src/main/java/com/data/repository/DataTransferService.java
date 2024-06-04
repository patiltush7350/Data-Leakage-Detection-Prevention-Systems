package com.data.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.data.Model.Alert;
import com.data.Model.DataTransferlLog;

public class DataTransferService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataTransferService.class);

    private void sendAlert(DataTransferlLog log) {
        // Log alert
        LOGGER.warn("Alert: Potential data leak detected for user {} at {}",
                log.getUserId(), log.getTimestamp());
        
        // Send email alert to administrators
        sendEmailAlert(log);

        // Store alert in database or in-memory list
        storeAlert(log);
    }

    private void sendEmailAlert(DataTransferlLog log) {
        // Dummy email sending logic
        String adminEmail = "admin@example.com";
        String subject = "Potential Data Leak Alert";
        String body = "Alert: Potential data leak detected for user " + log.getUserId() + " at " + log.getTimestamp();

        // Use an email library like JavaMail to send the email
        // EmailUtil.sendEmail(adminEmail, subject, body);
    }

    private void storeAlert(DataTransferlLog log) {
        // Store the alert in a database or in-memory list for fetching later
        AlertRepository.save(new Alert(log.getUserId(), log.getTimestamp(), "Potential data leak detected"));
    }
}
