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
	private ArrayList<YAxis> yAxis;

	public Scales() {
	}

	public Scales(Long scalesId) {
		this.scalesId = scalesId;
	}

	public Scales(Long scalesId, ArrayList<YAxis> yAxis) {
		this.scalesId = scalesId;
		this.yAxis = yAxis;
	}

	public Long getScalesId() {
		return scalesId;
	}

	public void setScalesId(Long scalesId) {
		this.scalesId = scalesId;
	}

	public ArrayList<YAxis> getyAxis() {
		return yAxis;
	}

	public void setyAxis(ArrayList<YAxis> yAxis) {
		this.yAxis = yAxis;
	}
}