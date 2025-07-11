import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    private PersonRepository repo;

    @BeforeEach
    void setUp() {
        repo = new PersonRepository();
        // Demo-Daten
        repo.addPerson(new Person("01", "Alice", DaysOfWeek.MONDAY,    Gender.FEMALE));
        repo.addPerson(new Person("02", "Bob",   DaysOfWeek.SATURDAY,  Gender.MALE));
        repo.addPerson(new Person("03", "Clara", DaysOfWeek.WEDNESDAY,Gender.FEMALE));
    }

    @Test
    void testFindAll() {
        List<Person> all = repo.findAll();
        assertEquals(3, all.size(), "Es sollten genau 3 Personen vorhanden sein");
        // sicherstellen, dass alle IDs drin sind
        assertTrue(all.stream().anyMatch(p -> p.id().equals("01")));
        assertTrue(all.stream().anyMatch(p -> p.id().equals("02")));
        assertTrue(all.stream().anyMatch(p -> p.id().equals("03")));
    }

    @Test
    void testFindById_exists() {
        Optional<Person> opt = repo.findById("02");
        assertTrue(opt.isPresent(), "Person mit ID 02 sollte vorhanden sein");
        Person person = opt.get();
        assertEquals("Bob", person.name());
    }

    @Test
    void testFindByIdOptional_notExists() {
        Optional<Person> opt = repo.findById("99");
        assertFalse(opt.isPresent(), "Nicht existierende ID sollte Optional.empty() zurückliefern");
    }

    @Test
    void testDeleteById_success() {
        boolean deleted = repo.deleteById("02");
        assertTrue(deleted, "Löschen einer existierenden ID muss true liefern");

        Optional<Person> opt = repo.findById("02");
        assertFalse(opt.isPresent(), "Nach dem Löschen darf die Person nicht mehr gefunden werden");

        assertEquals(2, repo.findAll().size(), "Anzahl der Personen muss um 1 kleiner sein");
    }

    @Test
    void testDeleteById_failure() {
        assertFalse(repo.deleteById("99"), "Löschen einer nicht existierenden ID muss false liefern");
    }

    @Test
    void testCountGender() {
        assertEquals(2, repo.countGender(Gender.FEMALE), "Es sollte 2 Female geben");
        assertEquals(1, repo.countGender(Gender.MALE),   "Es sollte 1 Male geben");
        assertEquals(0, repo.countGender(Gender.DIVERSE), "Es sollte 0 Diverse geben");
    }

    @Test
    void testFindByFavoriteDay() {
        List<Person> mondayFans   = repo.findByFavoriteDay(DaysOfWeek.MONDAY);
        List<Person> saturdayFans = repo.findByFavoriteDay(DaysOfWeek.SATURDAY);
        List<Person> sundayFans   = repo.findByFavoriteDay(DaysOfWeek.SUNDAY);

        assertEquals(1, mondayFans.size());
        assertEquals("Alice", mondayFans.get(0).name());

        assertEquals(1, saturdayFans.size());
        assertEquals("Bob", saturdayFans.get(0).name());

        assertTrue(sundayFans.isEmpty(), "Für Sonntag gibt’s keine Fans in den Demo-Daten");
    }

    @Test
    void testDemoRepository() {
        PersonRepository demo = PersonRepository.demoRepository();
        assertEquals(3, demo.findAll().size(), "demoRepository sollte 3 Einträge enthalten");
        assertNotNull(demo.findById("01"));
        assertNotNull(demo.findById("02"));
        assertNotNull(demo.findById("03"));
    }
}
