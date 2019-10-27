public class PersonApppl {
 
    public static void main(String[] args) {
        Person vasya = new Person(10, "Vasya", "Petrov", 2002, true );
        Person peter = new Person(100_000_001, "Peter", null, 1897, true);
        System.out.println(vasya.getFirstName());
        peter.display();
        vasya.display();
        System.out.println(vasya.checkArmy());
        System.out.println(peter.checkArmy());
        System.out.println(peter.getId());
        vasya.setId(100_000_000);
        peter.setBirthYear(1997);
        vasya.display();
        peter.display();
 
    }
 
}