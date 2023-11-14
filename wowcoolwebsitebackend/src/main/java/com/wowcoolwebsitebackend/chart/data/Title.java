package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "title_table")
public class Title implements Displayable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private Long id;

	@Column(name = "display")
	private boolean display;

	@Column(name = "text")
	private String text;

	@Override
	public boolean isDisplay() {
		return display;
	}

	public Title() {
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

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}
}