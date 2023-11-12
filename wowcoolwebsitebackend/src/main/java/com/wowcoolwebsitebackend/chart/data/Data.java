package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "data_table")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "data_id")
	private Long dataId;

	@ElementCollection
	@CollectionTable(name = "data_labels_table")
	private ArrayList<String> labels;

	//TODO fix the joins in database and seek the correct ones so the find proper connections
	@ManyToOne
	@JoinColumn(name = "chart_data_id")
	@JsonIgnore
	private ChartData chartData;

	@OneToMany(mappedBy = "data", cascade = CascadeType.ALL)
	private ArrayList<Dataset> datasets;

	// Other fields, constructors, getters, and setters...
}
