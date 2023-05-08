package ee.petmanagement.Petmanagement;

import ee.petmanagement.Petmanagement.model.Pet;
import ee.petmanagement.Petmanagement.model.PetsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PetmanagementApplicationTests {
	@Autowired
	PetsRepository petsRepository;
}
