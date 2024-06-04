package com.data.repository;

import java.util.ArrayList;
import java.util.List;

import com.data.Model.Alert;

public class AlertRepository {
	private static final List<Alert> alerts = new ArrayList<>();

    public static void save(Alert alert) {
        alerts.add(alert);
    }

    public static List<Alert> findAll() {
        return new ArrayList<>(alerts);
    }
}
