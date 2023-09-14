package com.example.demo.classes.chart;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.classes.chart.data.ChartData;

import jakarta.persistence.*;

@Entity
@Table(name = "chart")
public class Chart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chart_id")
	private long chartId;

	@Column(name = "chart_name")
	private String chartName;

	@Column(name = "x_axis_name")
	private String xAxisName;

	@Column(name = "y_axis_name")
	private String yAxisName;

	@OneToMany(mappedBy = "chart", fetch = FetchType.LAZY)
	private List<ChartData> chartData = new ArrayList<>();

	public Chart() {
	}

	public Chart(final long chartId, final String chartName, final String xAxisName, final String yAxisName, final List<ChartData> chartData) {
		this.chartId = chartId;
		this.chartName = chartName;
		this.xAxisName = xAxisName;
		this.yAxisName = yAxisName;
		this.chartData = chartData;
	}

	@Override
	public String toString() {
		return "Chart{" + "chartId=" + chartId + ", chartName='" + chartName + '\'' + ", xAxisName='" + xAxisName + '\'' + ", yAxisName='" + yAxisName + '\''
				+ ", chartData=" + chartData + '}';
	}

	public long getChartId() {
		return chartId;
	}

	public void setChartId(final long chartId) {
		this.chartId = chartId;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(final String chartName) {
		this.chartName = chartName;
	}

	public String getxAxisName() {
		return xAxisName;
	}

	public void setxAxisName(final String xAxisName) {
		this.xAxisName = xAxisName;
	}

	public String getyAxisName() {
		return yAxisName;
	}

	public void setyAxisName(final String yAxisName) {
		this.yAxisName = yAxisName;
	}

	public List<ChartData> getChartData() {
		return chartData;
	}

	public void setChartData(final List<ChartData> chartData) {
		this.chartData = chartData;
	}
}
