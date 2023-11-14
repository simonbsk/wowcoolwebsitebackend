package com.wowcoolwebsitebackend.chart.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "legend")
class Legend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean display;
	public Legend() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(final boolean display) {
		this.display = display;
	}
}