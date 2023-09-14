package com.example.demo.classes.chart;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public record ChartController(ChartService chartService) {

	@RequestMapping("/all")
	public List<Chart> getAllCharts() {
		return chartService.findAllCharts();
	}

	@RequestMapping("/{id}")
	public Chart getChartById(@PathVariable long id) {
		return chartService.findChartById(id);
	}

}
