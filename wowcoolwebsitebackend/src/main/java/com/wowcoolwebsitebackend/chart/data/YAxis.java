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

	@ManyToOne
	@JoinColumn(name = "ticks_id")
	private Ticks ticks;
}
