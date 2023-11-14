package com.wowcoolwebsitebackend.chart.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "chartdata")
public class ChartData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

	@Column(name = "type")
	private String type;

	@OneToOne(cascade = CascadeType.ALL)
	private Data data;

	@OneToOne(cascade = CascadeType.ALL)
	private Options options;

	public ChartData() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public Data getData() {
		return data;
	}

	public void setData(final Data data) {
		this.data = data;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(final Options options) {
		this.options = options;
	}
}
