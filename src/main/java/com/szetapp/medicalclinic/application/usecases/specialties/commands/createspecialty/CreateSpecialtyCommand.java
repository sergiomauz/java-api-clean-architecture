package com.szetapp.medicalclinic.application.usecases.specialties.commands.createspecialty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
public class CreateSpecialtyCommand {
    private String name;
    private String description;

    public CreateSpecialtyCommand(CreateSpecialtyDto createSpecialtyDto) {
        this.name = createSpecialtyDto.getName();
        this.description = createSpecialtyDto.getDescription();
    }
}
