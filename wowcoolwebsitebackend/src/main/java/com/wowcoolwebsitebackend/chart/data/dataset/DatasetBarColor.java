package com.wowcoolwebsitebackend.chart.data.dataset;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dataset_bar_color_table")
public class DatasetBarColor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "bar_color_id")
	private long barColorId;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "dataset_id")
	private Dataset dataset;

	@Column(name = "bar_color")
	private String barColor;

	public DatasetBarColor() {
	}

	public long getBarColorId() {
		return barColorId;
	}

	public void setBarColorId(final long barColorId) {
		this.barColorId = barColorId;
	}

	public Dataset getDataset() {
		return dataset;
	}

	public void setDataset(final Dataset dataset) {
		this.dataset = dataset;
	}

	public String getBarColor() {
		return barColor;
	}

	public void setBarColor(final String barColor) {
		this.barColor = barColor;
	}
}
