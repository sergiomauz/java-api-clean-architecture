package com.szetapp.medicalclinic.application.infrastructure.persistence;

import com.szetapp.medicalclinic.domain.entities.Specialty;
import java.util.List;
import java.util.Optional;

public interface  SpecialtiesRepository {
    Optional<Specialty> Create(Specialty entity);
    Integer Delete(List<Integer> ids);
    Optional<Specialty> Update(Specialty entity);
    Optional<Specialty> GetById(Integer id);
}
