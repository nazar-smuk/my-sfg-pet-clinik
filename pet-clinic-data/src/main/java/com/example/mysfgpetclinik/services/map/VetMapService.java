package com.example.mysfgpetclinik.services.map;

import com.example.mysfgpetclinik.model.Vet;
import com.example.mysfgpetclinik.services.CrudService;
import com.example.mysfgpetclinik.services.VetService;
import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

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
