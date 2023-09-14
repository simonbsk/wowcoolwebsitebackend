package com.wowcoolwebsitebackend.chart;

import java.util.List;

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