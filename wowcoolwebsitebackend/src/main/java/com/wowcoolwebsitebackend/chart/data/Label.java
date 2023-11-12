package com.wowcoolwebsitebackend.chart.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "data_labels_table")

public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "data_label_id")
    private Long dataLabelId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "data_id")
    private Data data;

    @Column(name = "labels")
    private String labels;

    public Label() {
    }

    public Label(Long dataLabelId) {
        this.dataLabelId = dataLabelId;
    }

    public Label(Long dataLabelId, Data data, String labels) {
        this.dataLabelId = dataLabelId;
        this.data = data;
        this.labels = labels;
    }

    public Long getDataLabelId() {
        return dataLabelId;
    }

    public void setDataLabelId(Long dataLabelId) {
        this.dataLabelId = dataLabelId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }
}
