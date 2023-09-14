package com.example.demo.classes.chart.data;

import com.example.demo.classes.chart.Chart;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chart_data")
public class ChartData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chart_data_id")
	private long chartDataId;

	@Column(name = "variable_x")
	private long variableX;

	@Column(name = "variable_y")
	private long variableY;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chart_id")
	private Chart chart;

	public ChartData() {
	}

	public ChartData(final long chartDataId, final long variableX, final long variableY, final Chart chart) {
		this.chartDataId = chartDataId;
		this.variableX = variableX;
		this.variableY = variableY;
		this.chart = chart;
	}

	@Override
	public String toString() {
		return "ChartData{" + "chartDataId=" + chartDataId + ", variableX=" + variableX + ", variableY=" + variableY + ", chart=" + chart + '}';
	}

	public long getChartDataId() {
		return chartDataId;
	}

	public void setChartDataId(final long chartDataId) {
		this.chartDataId = chartDataId;
	}

	public long getVariableX() {
		return variableX;
	}

	public void setVariableX(final long variableX) {
		this.variableX = variableX;
	}

	public long getVariableY() {
		return variableY;
	}

	public void setVariableY(final long variableY) {
		this.variableY = variableY;
	}

	public Chart getChart() {
		return chart;
	}

	public void setChart(final Chart chart) {
		this.chart = chart;
	}
}
