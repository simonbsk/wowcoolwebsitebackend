package com.wowcoolwebsitebackend.chart.data;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "chart_data_table")
public class ChartData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "chart_data_id")
	private Long chartDataId;

	@Column(name = "type")
	private String type;

	@OneToMany(mappedBy = "chartData", cascade = CascadeType.ALL)
	private ArrayList<Data> dataList;

	@OneToMany(mappedBy = "chartData", cascade = CascadeType.ALL)
	private ArrayList<Options> optionsList;

}
