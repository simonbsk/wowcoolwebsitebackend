package com.wowcoolwebsitebackend.chart.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.wowcoolwebsitebackend.chart.service.ChartService;
import com.wowcoolwebsitebackend.chart.classes.Chart;

@RestController
@RequestMapping("/api/charts")
public record ChartController (ChartService chartService) {

	@GetMapping("/all")
	public List<Chart> getAllCharts() {
		return chartService.getAllCharts();
	}


	@GetMapping("/{id}")
	public ResponseEntity<Chart> getChartById(@PathVariable Long id) {
		Chart chart = chartService.getChartById(id);
		if (chart != null) {
			return new ResponseEntity<>(chart, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Chart> addChart(@RequestBody Chart chart) {
		Chart savedChart = chartService.saveChart(chart);
		return new ResponseEntity<>(savedChart, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteChart(@PathVariable Long id) {
		chartService.deleteChart(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
