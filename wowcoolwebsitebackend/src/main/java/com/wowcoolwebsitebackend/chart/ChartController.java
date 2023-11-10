package com.wowcoolwebsitebackend.chart;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public record ChartController(ChartService chartService) {

	@GetMapping("")
	public String get200() {
		return "200 http response right?";
	}

	@GetMapping("/all")
	public List<Chart> getAllCharts() {
		return chartService.findAllCharts();
	}

	@GetMapping("/{id}")
	public Chart getChartById(@PathVariable long id) {
		return chartService.findChartById(id);
	}

}
