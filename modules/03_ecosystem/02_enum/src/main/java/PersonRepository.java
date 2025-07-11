import java.util.*;
import java.util.stream.Collectors;

public class PersonRepository {

    Map<String, Person> persons = new HashMap<>();

    public void addPerson(Person person) {
        persons.put(person.id(), person);
    }

    public List<Person> findAll() {
        return new ArrayList<>(persons.values());
    }

    public Optional<Person> findById(String id) {
        return Optional.ofNullable(persons.get(id));
    }

    public boolean deleteById(String id) {
        return persons.remove(id) != null;
    }

    public static PersonRepository demoRepository() {
        PersonRepository repo = new PersonRepository();
        repo.addPerson(new Person("01", "Alice", DaysOfWeek.MONDAY, Gender.FEMALE));
        repo.addPerson(new Person("02", "Bob",   DaysOfWeek.SATURDAY, Gender.MALE));
        repo.addPerson(new Person("03", "Clara", DaysOfWeek.WEDNESDAY, Gender.FEMALE));
        return repo;
    }

    public int countGender(Gender gender) {
        int counter = 0;
        for(Person person : persons.values()){
            if (person.gender() == gender) {
                counter++;
            }
        }
        return counter;
    }

    public List<Person> findByFavoriteDay(DaysOfWeek day) {
        return persons.values().stream()
                .filter(p -> p.favoriteDay() == day)
                .collect(Collectors.toList());
    }
}
