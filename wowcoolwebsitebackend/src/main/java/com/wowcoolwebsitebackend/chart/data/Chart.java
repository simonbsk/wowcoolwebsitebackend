package com.wowcoolwebsitebackend.chart.data;

import jakarta.persistence.*;

@Entity
@Table(name = "chart_table")
public class Chart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chart_id")
	private Long chartId;

	@Column(name = "chart_name")
	private String chartName;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "chart_data_id")
	private ChartData chartData;

	public Chart() {
	}

	public Chart(Long chartId) {
		this.chartId = chartId;
	}

	public Chart(Long chartId, String chartName, ChartData chartData) {
		this.chartId = chartId;
		this.chartName = chartName;
		this.chartData = chartData;
	}

	public Long getChartId() {
		return chartId;
	}

	public void setChartId(Long chartId) {
		this.chartId = chartId;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public ChartData getChartData() {
		return chartData;
	}

	public void setChartData(ChartData chartData) {
		this.chartData = chartData;
	}
}
