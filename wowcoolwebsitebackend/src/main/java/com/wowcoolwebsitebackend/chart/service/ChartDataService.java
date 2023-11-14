package com.wowcoolwebsitebackend.chart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wowcoolwebsitebackend.chart.classes.ChartData;
import com.wowcoolwebsitebackend.chart.repository.ChartDataRepository;

@Service
public record ChartDataService (ChartDataRepository chartDataRepository) {

	public List<ChartData> getAllChartData() {
		return chartDataRepository.findAll();
	}

	public ChartData getChartDataById(Long id) {
		return chartDataRepository.findById(id).orElse(null);
	}

	public ChartData saveChartData(ChartData chartData) {
		return chartDataRepository.save(chartData);
	}

	public void deleteChartData(Long id) {
		chartDataRepository.deleteById(id);
	}
}