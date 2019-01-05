package com.zy.rtti;

public class Position {
    private String tittle;
    private Person person;
    public Position(String jobTitle, Person employee) {
        tittle = jobTitle;
        person = employee;

        if (person == null) {
            person = Person.NULL;
        }
    }
    public Position(String jobTitle) {
        tittle = jobTitle;
        person = Person.NULL;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTitle(String newTitle) {
        tittle = newTitle;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null) {
            person = Person.NULL;
        }
    }
    public String toString() {
        return "Position: " + tittle + " " + person + "\n";
    }
}
