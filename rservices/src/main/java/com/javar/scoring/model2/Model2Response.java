package com.javar.scoring.model2;

import javax.validation.constraints.NotNull;

import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.javar.scoring.models.ScoringResponse;

public class Model2Response extends ScoringResponse {

    @JsonProperty("inputData")
    @NotNull
    @Getter
    private Model2DataFrame inputData;

    @Override
    public Model2Response setId(long id) {
        super.setId(id);

        return this;
    }
}
