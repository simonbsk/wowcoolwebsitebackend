package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "ticks_table")
public class Ticks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "ticks_id")
	private Long ticksId;

	@Column(name = "min")
	private int min;

	@Column(name = "max")
	private int max;

	public Ticks() {
	}

	public Ticks(Long ticksId) {
		this.ticksId = ticksId;
	}

	public Ticks(Long ticksId, int min, int max) {
		this.ticksId = ticksId;
		this.min = min;
		this.max = max;
	}

	public Long getTicksId() {
		return ticksId;
	}

	public void setTicksId(Long ticksId) {
		this.ticksId = ticksId;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}