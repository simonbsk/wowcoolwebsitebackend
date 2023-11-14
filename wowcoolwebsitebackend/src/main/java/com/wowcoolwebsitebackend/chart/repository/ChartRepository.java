package com.wowcoolwebsitebackend.chart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wowcoolwebsitebackend.chart.classes.Chart;

@Repository
public interface ChartRepository extends JpaRepository<Chart, Long> {
}

