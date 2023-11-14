package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "yaxis_table")
public class YAxis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "scales_id")
	private Scales scales;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ticks_id")
	private Ticks ticks;

	public YAxis() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Scales getScales() {
		return scales;
	}

	public void setScales(final Scales scales) {
		this.scales = scales;
	}

	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(final Ticks ticks) {
		this.ticks = ticks;
	}
}
