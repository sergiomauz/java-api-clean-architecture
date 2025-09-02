package com.szetapp.medicalclinic.application.services;

import com.szetapp.medicalclinic.application.usecases.specialties.commands.createspecialty.*;
import com.szetapp.medicalclinic.presentation.interfaces.SpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {
    public SpecialtyServiceImpl() {

    }

    public CreateSpecialtyVm createSpecialty(CreateSpecialtyCommand command) {
        var useCase = new CreateSpecialtyUseCase(command);

        return useCase.execute();
    }
}
