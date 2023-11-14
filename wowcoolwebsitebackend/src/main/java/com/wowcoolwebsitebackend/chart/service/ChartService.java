package com.wowcoolwebsitebackend.chart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wowcoolwebsitebackend.chart.classes.Chart;
import com.wowcoolwebsitebackend.chart.repository.ChartRepository;

@Service
public record ChartService (ChartRepository chartRepository) {

    public List<Chart> getAllCharts() {
        return chartRepository.findAll();
    }

    public Chart getChartById(Long id) {
        return chartRepository.findById(id).orElse(null);
    }

    public Chart saveChart(Chart chart) {
        return chartRepository.save(chart);
    }

    public void deleteChart(Long id) {
        chartRepository.deleteById(id);
    }
}