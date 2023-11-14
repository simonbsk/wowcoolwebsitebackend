package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "legend_table")
public class Legend implements Displayable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private Long id;

	@Column(name = "display")
	private boolean display;

	@Override
	public boolean isDisplay() {
		return display;
	}

	public Legend() {
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setDisplay(final boolean display) {
		this.display = display;
	}
}