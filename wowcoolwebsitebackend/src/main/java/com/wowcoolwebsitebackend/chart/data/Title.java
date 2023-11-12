package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "title_table")
public class Title implements Displayable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "title_id")
	private Long titleId;

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

	public Title(Long titleId) {
		this.titleId = titleId;
	}

	public Title(Long titleId, boolean display, String text) {
		this.titleId = titleId;
		this.display = display;
		this.text = text;
	}

	public Long getTitleId() {
		return titleId;
	}

	public void setTitleId(Long titleId) {
		this.titleId = titleId;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}