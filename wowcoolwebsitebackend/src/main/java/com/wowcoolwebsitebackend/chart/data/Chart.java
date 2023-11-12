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
	private ChartData chartData;
}
