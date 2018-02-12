package com.javar.scoring.model2;

import javax.validation.constraints.NotNull;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.javar.scoring.models.ModelDataFrame;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Model2DataFrame extends ModelDataFrame {

    @NotNull
    @JsonProperty("X01")
    private int inputVariable01;

    @NotNull
    @JsonProperty("X02")
    private String inputVariable02;

    @NotNull
    @JsonProperty("X03")
    private int inputVariable03;

    @NotNull
    @JsonProperty("X04")
    private int inputVariable04;

    @NotNull
    @JsonProperty("X05")
    private double inputVariable05;

    @NotNull
    @JsonProperty("X06")
    private String inputVariable06;

    @NotNull
    @JsonProperty("X07")
    private String inputVariable07;

    @NotNull
    @JsonProperty("X08")
    private double inputVariable08;

    @NotNull
    @JsonProperty("X09")
    private int inputVariable09;

    @NotNull
    @JsonProperty("X10")
    private double inputVariable10;

    @NotNull
    @JsonProperty("X11")
    private int inputVariable11;

    @NotNull
    @JsonProperty("X12")
    private int inputVariable12;

    @NotNull
    @JsonProperty("X13")
    private int inputVariable13;

    @NotNull
    @JsonProperty("X14")
    private int inputVariable14;

    @NotNull
    @JsonProperty("X15")
    private int inputVariable15;

    @NotNull
    @JsonProperty("X16")
    private int inputVariable16;

    @NotNull
    @JsonProperty("X17")
    private int inputVariable17;
}
