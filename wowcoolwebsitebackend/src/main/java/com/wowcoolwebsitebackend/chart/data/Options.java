package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "options_table")
public class Options {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "title_id")
	private Title title;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "legend_id")
	private Legend legend;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "scales_id")
	private Scales scales;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "options_id")
	private ChartData chartData;

	public Options() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(final Title title) {
		this.title = title;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(final Legend legend) {
		this.legend = legend;
	}

	public Scales getScales() {
		return scales;
	}

	public void setScales(final Scales scales) {
		this.scales = scales;
	}

	public ChartData getChartData() {
		return chartData;
	}

	public void setChartData(final ChartData chartData) {
		this.chartData = chartData;
	}
}
