package com.szetapp.medicalclinic.presentation.interfaces;

import com.szetapp.medicalclinic.application.usecases.specialties.commands.createspecialty.*;

public interface  SpecialtyService {
    CreateSpecialtyVm createSpecialty(CreateSpecialtyCommand command);
}
