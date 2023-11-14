package com.wowcoolwebsitebackend.chart.classes;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "scales")
class Scales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL)
	private List<YAxes> yAxes;
	public Scales() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public List<YAxes> getyAxes() {
		return yAxes;
	}

	public void setyAxes(final List<YAxes> yAxes) {
		this.yAxes = yAxes;
	}
}