package ee.petmanagement.Petmanagement.service;

import ee.petmanagement.Petmanagement.exception.PetNotFoundException;
import ee.petmanagement.Petmanagement.model.Pet;
import ee.petmanagement.Petmanagement.repo.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PetService {
    private final PetRepo petRepo;

    @Autowired
    public PetService(PetRepo petRepo) {
        this.petRepo = petRepo;
    }

    public Pet addPet(Pet pet) {
        pet.setPetCode(UUID.randomUUID().toString());
        return petRepo.save(pet);
    }

    public List<Pet> findAllPets(){
        return petRepo.findAll();
    }

    public Pet updatePet(Pet pet){
        return petRepo.save(pet);
    }

    public void deletePet(Long id){
        petRepo.deletePetById(id);
    }

    public Pet editPet(Pet pet){
        return petRepo.save(pet);
    }

    public Pet findPetById(Long id){
        return petRepo.findPetById(id).orElseThrow(() -> new PetNotFoundException("Pet by id " + id + " was not found"));
    }
}
