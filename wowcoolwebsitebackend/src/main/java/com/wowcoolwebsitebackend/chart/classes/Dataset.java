package com.wowcoolwebsitebackend.chart.classes;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "dataset")
class Dataset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int pointRadius;
	private String pointBackgroundColor;

	@ElementCollection
	private List<String> borderColor;

	@ElementCollection
	private List<String> barColor;

	@ElementCollection
	private List<Integer> data;

	private boolean fill;

	public Dataset() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getPointRadius() {
		return pointRadius;
	}

	public void setPointRadius(final int pointRadius) {
		this.pointRadius = pointRadius;
	}

	public String getPointBackgroundColor() {
		return pointBackgroundColor;
	}

	public void setPointBackgroundColor(final String pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	public List<String> getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(final List<String> borderColor) {
		this.borderColor = borderColor;
	}

	public List<String> getBarColor() {
		return barColor;
	}

	public void setBarColor(final List<String> barColor) {
		this.barColor = barColor;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(final List<Integer> data) {
		this.data = data;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(final boolean fill) {
		this.fill = fill;
	}
}
