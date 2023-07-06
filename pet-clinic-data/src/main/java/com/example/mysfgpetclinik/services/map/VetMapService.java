package com.example.mysfgpetclinik.services.map;

import com.example.mysfgpetclinik.model.Speciality;
import com.example.mysfgpetclinik.model.Vet;
import com.example.mysfgpetclinik.services.SpecialtyService;
import com.example.mysfgpetclinik.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialtyService specialtyService;

  public VetMapService(SpecialtyService specialtyService) {
    this.specialtyService = specialtyService;
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet vet) {
    if (vet.getSpecialities().size() > 0) {
      vet.getSpecialities().forEach(speciality -> {
        if (speciality.getId() == null) {
          Speciality savedSpecialty = specialtyService.save(speciality);
          speciality.setId(savedSpecialty.getId());
        }
      });
    }

    return super.save(vet);
  }

  @Override
  public void delete(Vet vet) {
    super.delete(vet);

  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);

  }
}
