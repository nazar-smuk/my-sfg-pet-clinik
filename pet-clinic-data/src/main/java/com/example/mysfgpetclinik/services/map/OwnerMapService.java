package com.example.mysfgpetclinik.services.map;

import com.example.mysfgpetclinik.model.Owner;
import com.example.mysfgpetclinik.model.Pet;
import com.example.mysfgpetclinik.services.OwnerService;
import com.example.mysfgpetclinik.services.PetService;
import com.example.mysfgpetclinik.services.PetTypeService;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

  public OwnerMapService(PetTypeService petTypeService, PetService petService) {
    this.petTypeService = petTypeService;
    this.petService = petService;
  }

  @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object != null){
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(object);

        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return null;
    }
}
