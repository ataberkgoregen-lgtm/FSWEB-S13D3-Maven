package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person() {
        this("None", "None", 0);
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName,0);
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if(age >= 13 && age < 19 ) {
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return String.format("%s %s %d %b", firstName, lastName, age, isTeen());
    }
}
