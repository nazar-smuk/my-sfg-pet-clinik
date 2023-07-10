package com.example.mysfgpetclinik.repositories;

import com.example.mysfgpetclinik.model.Owner;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String lastName);
}
