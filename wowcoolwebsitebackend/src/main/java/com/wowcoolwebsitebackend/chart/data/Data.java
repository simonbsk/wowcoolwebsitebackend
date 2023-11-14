package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wowcoolwebsitebackend.chart.data.dataset.Dataset;

import jakarta.persistence.*;

@Entity
@Table(name = "data_table")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "data_id")
	private Long dataId;

	@OneToMany(mappedBy = "data", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Label> labels = new ArrayList<>();

	@Column(name = "dataset_id")
	@OneToMany(mappedBy = "data", cascade = CascadeType.ALL)
	private List<Dataset> datasets = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "chart_data_id")
	@JsonIgnore
	private ChartData chartData;

	public Data() {
	}

	public Data(Long dataId) {
		this.dataId = dataId;
	}

	public Data(Long dataId, List<Label> labels, List<Dataset> datasets, ChartData chartData) {
		this.dataId = dataId;
		this.labels = labels;
		this.datasets = datasets;
		this.chartData = chartData;
	}

	public Long getDataId() {
		return dataId;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public List<Dataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
	}

	public ChartData getChartData() {
		return chartData;
	}

	public void setChartData(ChartData chartData) {
		this.chartData = chartData;
	}
}
