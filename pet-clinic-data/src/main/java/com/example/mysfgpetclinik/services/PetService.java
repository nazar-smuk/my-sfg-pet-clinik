package com.example.mysfgpetclinik.services;

import com.example.mysfgpetclinik.model.Owner;
import com.example.mysfgpetclinik.model.Pet;
import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
