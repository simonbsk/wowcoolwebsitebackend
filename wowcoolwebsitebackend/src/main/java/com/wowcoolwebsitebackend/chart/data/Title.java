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
}