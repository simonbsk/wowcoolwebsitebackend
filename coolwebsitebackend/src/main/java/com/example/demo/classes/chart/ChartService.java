package com.example.demo.classes.chart;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public record ChartService (ChartRepository chartRepository) {

	public List<Chart> findAllCharts() {
		return chartRepository.findAll();
	}

	public Chart findChartById(Long id) {
		return chartRepository.findById(id).orElseThrow();
	}

}
