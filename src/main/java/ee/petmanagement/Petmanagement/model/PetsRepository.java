package ee.petmanagement.Petmanagement.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetsRepository extends JpaRepository<Pet, Long> {
}
