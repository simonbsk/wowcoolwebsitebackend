package com.wowcoolwebsitebackend.chart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.wowcoolwebsitebackend.chart.service.ChartDataService;
import com.wowcoolwebsitebackend.chart.classes.ChartData;

@RestController
@RequestMapping("/api/chartdata")
public class ChartDataController {

	@Autowired
	private ChartDataService chartDataService;

	@GetMapping("/all")
	public List<ChartData> getAllChartData() {
		return chartDataService.getAllChartData();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ChartData> getChartDataById(@PathVariable Long id) {
		ChartData chartData = chartDataService.getChartDataById(id);
		if (chartData != null) {
			return new ResponseEntity<>(chartData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<ChartData> addChartData(@RequestBody ChartData chartData) {
		ChartData savedChartData = chartDataService.saveChartData(chartData);
		return new ResponseEntity<>(savedChartData, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteChartData(@PathVariable Long id) {
		chartDataService.deleteChartData(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

