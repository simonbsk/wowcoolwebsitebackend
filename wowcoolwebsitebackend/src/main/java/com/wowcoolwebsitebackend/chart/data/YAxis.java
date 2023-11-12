package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "yaxis_table")
public class YAxis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "yaxis_id")
	private Long yaxisId;

	//TODO add relation scales_id between yaxis_table and scales_table
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "scales_id")
	private Scales scales;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ticks_id")
	private Ticks ticks;

	public YAxis() {
	}

	public Long getYaxisId() {
		return yaxisId;
	}

	public void setYaxisId(Long yaxisId) {
		this.yaxisId = yaxisId;
	}

	public Scales getScales() {
		return scales;
	}

	public void setScales(Scales scales) {
		this.scales = scales;
	}

	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(Ticks ticks) {
		this.ticks = ticks;
	}
}
