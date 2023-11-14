package com.wowcoolwebsitebackend.chart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wowcoolwebsitebackend.chart.classes.ChartData;

@Repository
public interface ChartDataRepository extends JpaRepository<ChartData, Long> {
}

