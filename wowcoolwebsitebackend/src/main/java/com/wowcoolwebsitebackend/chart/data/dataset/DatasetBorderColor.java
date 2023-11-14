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
@Table(name = "dataset_border_color_table")
public class DatasetBorderColor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "border_color_id")
	private long borderColorId;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "dataset_id")
	private Dataset dataset;

	@Column(name = "border_color")
	private String borderColor;

	public DatasetBorderColor() {
	}

	public long getBorderColorId() {
		return borderColorId;
	}

	public void setBorderColorId(final long borderColorId) {
		this.borderColorId = borderColorId;
	}

	public Dataset getDataset() {
		return dataset;
	}

	public void setDataset(final Dataset dataset) {
		this.dataset = dataset;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(final String borderColor) {
		this.borderColor = borderColor;
	}
}
