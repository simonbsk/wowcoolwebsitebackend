package com.wowcoolwebsitebackend.chart.classes;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ElementCollection
	private List<Integer> labels;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Dataset> datasets;

	public Data() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public List<Integer> getLabels() {
		return labels;
	}

	public void setLabels(final List<Integer> labels) {
		this.labels = labels;
	}

	public List<Dataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(final List<Dataset> datasets) {
		this.datasets = datasets;
	}
}
