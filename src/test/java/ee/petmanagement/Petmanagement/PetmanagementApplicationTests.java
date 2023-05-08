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

	@Test
	void contextLoads() {
		long before = petsRepository.count();
		petsRepository.save(new Pet("Kass", 1, "Kass", "Must", "Eesti"));
		petsRepository.findAll().forEach(System.out::println);
		Assertions.assertEquals(before + 1, petsRepository.count());
	}

}
