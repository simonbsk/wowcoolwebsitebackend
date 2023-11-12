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

	public Legend() {
	}

	public Legend(Long legendId) {
		this.legendId = legendId;
	}

	public Legend(Long legendId, boolean display) {
		this.legendId = legendId;
		this.display = display;
	}

	public Long getLegendId() {
		return legendId;
	}

	public void setLegendId(Long legendId) {
		this.legendId = legendId;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}
}