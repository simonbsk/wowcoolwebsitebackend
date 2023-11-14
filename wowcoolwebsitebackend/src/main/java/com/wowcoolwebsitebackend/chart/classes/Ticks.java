package com.wowcoolwebsitebackend.chart.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "ticks")
public class Ticks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int min;
	private int max;

	public Ticks() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getMin() {
		return min;
	}

	public void setMin(final int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(final int max) {
		this.max = max;
	}
}