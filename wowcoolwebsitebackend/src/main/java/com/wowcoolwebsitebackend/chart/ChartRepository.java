package com.wowcoolwebsitebackend.chart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wowcoolwebsitebackend.chart.data.Chart;

@Repository
public interface ChartRepository extends JpaRepository<Chart, Long> {
}
