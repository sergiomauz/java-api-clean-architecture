package com.szetapp.medicalclinic.application.usecases.specialties.commands.createspecialty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSpecialtyVm {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;
}
