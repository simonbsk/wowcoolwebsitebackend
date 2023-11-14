package com.wowcoolwebsitebackend.chart.data.dataset;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wowcoolwebsitebackend.chart.data.Data;

import jakarta.persistence.*;


@Entity
@Table(name = "dataset_table")
public class Dataset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "dataset_id")
	private Long datasetId;

	//TODO fix data_id relation bewtween dataset_table and data_table
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "data_id")
	private Data data;

	@Column(name = "point_radius")
	private int pointRadius;

	@Column(name = "point_background_color")
	private String pointBackgroundColor;

	//TODO fix dataset_id relation in DB
	@OneToMany(mappedBy = "dataset", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DatasetBorderColor> dataSetBorderColor = new ArrayList<>();

	//TODO fix dataset_id relation in DB
	@OneToMany(mappedBy = "dataset", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DatasetBarColor> dataSetBarColor = new ArrayList<>();

	//TODO fix dataset_id relation in DB
	@OneToMany(mappedBy = "dataset", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DatasetData> datasetData = new ArrayList<>();

	@Column(name = "fill")
	private boolean fill;

	public Dataset() {
	}

	public Dataset(Long datasetId) {
		this.datasetId = datasetId;
	}

	public Dataset(final Long datasetId, final Data data, final int pointRadius, final String pointBackgroundColor,
			final List<DatasetBorderColor> dataSetBorderColor, final List<DatasetBarColor> dataSetBarColor, final List<DatasetData> datasetData,
			final boolean fill) {
		this.datasetId = datasetId;
		this.data = data;
		this.pointRadius = pointRadius;
		this.pointBackgroundColor = pointBackgroundColor;
		this.dataSetBorderColor = dataSetBorderColor;
		this.dataSetBarColor = dataSetBarColor;
		this.datasetData = datasetData;
		this.fill = fill;
	}

	public Long getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(Long datasetId) {
		this.datasetId = datasetId;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public int getPointRadius() {
		return pointRadius;
	}

	public void setPointRadius(int pointRadius) {
		this.pointRadius = pointRadius;
	}

	public String getPointBackgroundColor() {
		return pointBackgroundColor;
	}

	public void setPointBackgroundColor(String pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	public List<DatasetBorderColor> getDataSetBorderColor() {
		return dataSetBorderColor;
	}

	public void setDataSetBorderColor(final List<DatasetBorderColor> dataSetBorderColor) {
		this.dataSetBorderColor = dataSetBorderColor;
	}

	public List<DatasetBarColor> getDataSetBarColor() {
		return dataSetBarColor;
	}

	public void setDataSetBarColor(final List<DatasetBarColor> dataSetBarColor) {
		this.dataSetBarColor = dataSetBarColor;
	}

	public List<DatasetData> getDatasetData() {
		return datasetData;
	}

	public void setDatasetData(final List<DatasetData> datasetData) {
		this.datasetData = datasetData;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}
}
