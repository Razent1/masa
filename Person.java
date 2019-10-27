public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private boolean gender;
     
    public Person(int id, String firstName, String lastName, 
            int birthYear, boolean gender) {
        setId(id);
        this.firstName = firstName;
        setLastName(lastName);
        setBirthYear(birthYear);
        this.gender = gender;
    }
 
    public void setId(int id) {
        if (id >= 100_000_000 && id <= 999_999_999) {
            this.id = id;
        } else {
            System.out.println(id + " is wrong id");
            this.id = -1;
        }
    }
 
   public int getId() {
        return id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        if (lastName == null) {
            this.lastName = "Anonimus";
        } else {
            this.lastName = lastName;
        }
    }
 
    public int getBirthYear() {
        return birthYear;
    }
 
    public void setBirthYear(int birthYear) {
        if (birthYear >= 1900 && birthYear <= 2019) {
            this.birthYear = birthYear;
        } else {
            System.out.println(birthYear + " is wrong birth year");
            this.birthYear = -1;
        }
    }
 
    public boolean isGender() {
        return gender;
    }
 
    public void setGender(boolean gender) {
        this.gender = gender;
    }
 
    public boolean checkArmy() {
        int age = getAge();
        return gender && (age >= 18 && age < 45);
    }
 
    public void display() {
        String info = "ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", birth year: "
                + birthYear + ", gender: " + (gender ? "male" : "female");
        System.out.println(info);
    }
 
    public int getAge() {
        return 2019 - birthYear;
    }
 
}