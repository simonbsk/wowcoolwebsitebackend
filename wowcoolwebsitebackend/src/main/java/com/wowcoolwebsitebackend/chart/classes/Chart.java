package com.wowcoolwebsitebackend.chart.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "chart")
public class Chart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "chart_name")
	private String chartName;
	@OneToOne
	@JoinColumn(name = "chart_data_id")
	private ChartData chartData;

	public Chart() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(final String chartName) {
		this.chartName = chartName;
	}

	public ChartData getChartData() {
		return chartData;
	}

	public void setChartData(final ChartData chartData) {
		this.chartData = chartData;
	}
}
