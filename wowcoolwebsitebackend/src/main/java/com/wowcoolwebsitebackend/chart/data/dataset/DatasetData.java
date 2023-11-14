package com.wowcoolwebsitebackend.chart.data.dataset;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "dataset_data_table")
public class DatasetData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "dataset_data_id")
	private long datasetDataId;

	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name = "dataset_id")
	private Dataset dataset;

	@Column(name = "data")
	private String data;

	public DatasetData() {
	}

	public long getDatasetDataId() {
		return datasetDataId;
	}

	public void setDatasetDataId(final long datasetDataId) {
		this.datasetDataId = datasetDataId;
	}

	public Dataset getDataset() {
		return dataset;
	}

	public void setDataset(final Dataset dataset) {
		this.dataset = dataset;
	}

	public String getData() {
		return data;
	}

	public void setData(final String data) {
		this.data = data;
	}
}
