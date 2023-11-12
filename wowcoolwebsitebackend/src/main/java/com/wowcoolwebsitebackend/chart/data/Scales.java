package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "scales_table")
public class Scales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "scales_id")
	private Long scalesId;

	@OneToMany(mappedBy = "scales")
	private ArrayList<YAxis> yAxes;
}