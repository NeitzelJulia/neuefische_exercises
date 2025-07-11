public class Main {

    public static void main(String[] args) {

        System.out.println(DaysOfWeek.MONDAY.getValue());
        System.out.println(DaysOfWeek.SATURDAY.getValue());

        PersonRepository personRepo = PersonRepository.demoRepository();
        System.out.println(personRepo.countGender(Gender.FEMALE));

    }

}
