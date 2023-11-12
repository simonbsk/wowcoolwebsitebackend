package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	//TODO FIX ALL 3 TABLES AND MAKE THEM ONE TO MANY / MANY TO ONE INSTEAD OF ELELMENTCOLLECTION + google @ElementCollection annotation and how to use properly
	@ElementCollection
	@CollectionTable(name = "dataset_border_color_table")
	private ArrayList<String> dataSetBorderColor;

	@ElementCollection
	@CollectionTable(name = "dataset_bar_color_table")
	private ArrayList<String> dataSetBarColor;

	@ElementCollection
	@CollectionTable(name = "dataset_data_table")
	private ArrayList<String> datasetData;

	@Column(name = "fill")
	private boolean fill;

	public Dataset() {
	}

	public Dataset(Long datasetId) {
		this.datasetId = datasetId;
	}

	public Dataset(Long datasetId, Data data, int pointRadius, String pointBackgroundColor, ArrayList<String> dataSetBorderColor, ArrayList<String> dataSetBarColor, ArrayList<String> datasetData, boolean fill) {
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

	public ArrayList<String> getDataSetBorderColor() {
		return dataSetBorderColor;
	}

	public void setDataSetBorderColor(ArrayList<String> dataSetBorderColor) {
		this.dataSetBorderColor = dataSetBorderColor;
	}

	public ArrayList<String> getDataSetBarColor() {
		return dataSetBarColor;
	}

	public void setDataSetBarColor(ArrayList<String> dataSetBarColor) {
		this.dataSetBarColor = dataSetBarColor;
	}

	public ArrayList<String> getDatasetData() {
		return datasetData;
	}

	public void setDatasetData(ArrayList<String> datasetData) {
		this.datasetData = datasetData;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}
}
