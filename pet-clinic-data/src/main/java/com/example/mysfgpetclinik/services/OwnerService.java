package com.example.mysfgpetclinik.services;

import com.example.mysfgpetclinik.model.Owner;
import java.util.List;
import java.util.Set;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
