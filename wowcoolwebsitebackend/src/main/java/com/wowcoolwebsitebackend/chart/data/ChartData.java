package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "chart_data_table")
public class ChartData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "chart_data_id")
	private Long chartDataId;

	@Column(name = "type")
	private String type;

	@Column(name = "data_id")
	@OneToMany(mappedBy = "chartData", cascade = CascadeType.ALL)
	private List<Data> dataList = new ArrayList<>();

	@OneToOne(mappedBy = "chartData", cascade = CascadeType.ALL)
	private Options options;

	public ChartData() {
	}

	public ChartData(Long chartDataId) {
		this.chartDataId = chartDataId;
	}

	public ChartData(Long chartDataId, String type, List<Data> dataList, Options options) {
		this.chartDataId = chartDataId;
		this.type = type;
		this.dataList = dataList;
		this.options = options;
	}

	public Long getChartDataId() {
		return chartDataId;
	}

	public void setChartDataId(Long chartDataId) {
		this.chartDataId = chartDataId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Data> getDataList() {
		return dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}
}
