package com.szetapp.medicalclinic.presentation.api.controllers;

import com.szetapp.medicalclinic.application.usecases.specialties.commands.createspecialty.*;
import com.szetapp.medicalclinic.presentation.interfaces.SpecialtyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpecialtiesController {

    private final SpecialtyService specialtyService;

    public SpecialtiesController(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @PostMapping("/specialties")
    public ResponseEntity<CreateSpecialtyVm> createSpecialty(@RequestBody CreateSpecialtyDto dto) {
        var command = new CreateSpecialtyCommand(dto);
        var vm = specialtyService.createSpecialty(command);

        return ResponseEntity.ok(vm);
    }
}
