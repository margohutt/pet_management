package ee.petmanagement.Petmanagement.repo;

import ee.petmanagement.Petmanagement.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PetRepo extends JpaRepository<Pet, Long> {
    void deletePetById(Long id);

    Optional<Pet> findPetById(Long id);
}
