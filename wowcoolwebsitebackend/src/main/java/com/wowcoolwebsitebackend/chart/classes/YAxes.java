package com.wowcoolwebsitebackend.chart.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "yaxes")
class YAxes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Ticks ticks;

	public YAxes() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(final Ticks ticks) {
		this.ticks = ticks;
	}
}
