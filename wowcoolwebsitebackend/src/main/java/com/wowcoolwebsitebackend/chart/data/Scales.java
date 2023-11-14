package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "scales_table")
public class Scales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private Long id;

	@OneToMany(mappedBy = "scales")
	private List<YAxis> yAxis = new ArrayList<>();

	public Scales() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public List<YAxis> getyAxis() {
		return yAxis;
	}

	public void setyAxis(final List<YAxis> yAxis) {
		this.yAxis = yAxis;
	}
}