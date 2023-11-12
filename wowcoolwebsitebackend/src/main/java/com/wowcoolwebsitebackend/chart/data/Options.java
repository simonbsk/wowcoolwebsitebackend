package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "options_table")
public class Options {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "options_id")
	private Long optionsId;

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

	public Options(Long optionsId) {
		this.optionsId = optionsId;
	}

	public Options(Long optionsId, Title title, Legend legend, Scales scales, ChartData chartData) {
		this.optionsId = optionsId;
		this.title = title;
		this.legend = legend;
		this.scales = scales;
		this.chartData = chartData;
	}

	public Long getOptionsId() {
		return optionsId;
	}

	public void setOptionsId(Long optionsId) {
		this.optionsId = optionsId;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public Scales getScales() {
		return scales;
	}

	public void setScales(Scales scales) {
		this.scales = scales;
	}

	public ChartData getChartData() {
		return chartData;
	}

	public void setChartData(ChartData chartData) {
		this.chartData = chartData;
	}
}
