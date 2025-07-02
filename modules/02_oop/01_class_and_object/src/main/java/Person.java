public class Person {
    private String name;
    private int age;
    public static enum Gender { MALE, FEMALE, DIVERSE }
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hallo, ich bin " + this.name + " und " + this.age + " Jahre alt");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
