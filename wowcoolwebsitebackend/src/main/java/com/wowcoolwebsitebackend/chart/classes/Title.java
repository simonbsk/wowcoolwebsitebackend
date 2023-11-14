package com.wowcoolwebsitebackend.chart.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "title")
class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean display;
	private String text;

	public Title() {
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

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}
}