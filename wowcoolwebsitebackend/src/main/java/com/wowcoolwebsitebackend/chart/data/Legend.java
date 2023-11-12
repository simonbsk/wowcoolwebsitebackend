package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "legend_table")
public class Legend implements Displayable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "legend_id")
	private Long legendId;

	@Column(name = "display")
	private boolean display;

	@Override
	public boolean isDisplay() {
		return display;
	}
}