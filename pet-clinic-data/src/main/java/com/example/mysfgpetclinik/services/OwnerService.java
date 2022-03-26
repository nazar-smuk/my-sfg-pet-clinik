package com.example.mysfgpetclinik.services;

import com.example.mysfgpetclinik.model.Owner;
import java.util.List;
import java.util.Set;


public interface OwnerService{

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    List<Owner> findAllByLastNameLike(String lastName);
 }
