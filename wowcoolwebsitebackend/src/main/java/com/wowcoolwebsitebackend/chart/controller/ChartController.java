package com.wowcoolwebsitebackend.chart.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wowcoolwebsitebackend.chart.service.ChartService;
import com.wowcoolwebsitebackend.chart.classes.Chart;

@RestController
@RequestMapping("/api/charts")
public record ChartController (ChartService chartService) {

	@GetMapping("/all")
	public List<Chart> getAllCharts() {
		List<Chart> chartList = chartService.getAllCharts();
		if (chartList.isEmpty()) {
			System.out.println("-----------------Liste ist leer----------");
		}
		return chartList;
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
