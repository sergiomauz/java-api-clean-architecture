package com.szetapp.medicalclinic.application.usecases.specialties.commands.createspecialty;

public class CreateSpecialtyUseCase {
    private final CreateSpecialtyCommand command;

    public CreateSpecialtyUseCase(CreateSpecialtyCommand command) {
        this.command = command;
    }

    public CreateSpecialtyVm execute(){
        return new CreateSpecialtyVm(command.getName(), command.getDescription());
    }
}
