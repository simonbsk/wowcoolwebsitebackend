package com.wowcoolwebsitebackend.chart.classes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "options")
public class Options {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Title title;

	@OneToOne(cascade = CascadeType.ALL)
	private Legend legend;

	@OneToOne(cascade = CascadeType.ALL)
	private Scales scales;

	public Options() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(final Title title) {
		this.title = title;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(final Legend legend) {
		this.legend = legend;
	}

	public Scales getScales() {
		return scales;
	}

	public void setScales(final Scales scales) {
		this.scales = scales;
	}
}
