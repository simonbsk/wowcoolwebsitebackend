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

	@Column(name = "point_radius")
	private int pointRadius;

	@Column(name = "point_background_color")
	private String pointBackgroundColor;

	@ElementCollection
	@CollectionTable(name = "dataset_border_color_table")
	private ArrayList<String> borderColor;

	@ElementCollection
	@CollectionTable(name = "dataset_bar_color_table")
	private ArrayList<String> barColor;

	@ElementCollection
	@CollectionTable(name = "dataset_data_table")
	private ArrayList<String> data;

	@Column(name = "fill")
	private boolean fill;

}