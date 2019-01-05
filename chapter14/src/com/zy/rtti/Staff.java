package com.zy.rtti;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));
    }
    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }
    public Staff(String... titles) {
        add(titles);
    }
    public boolean positionValiable(String title) {
        for (Position position : this) {
            if (position.getTittle().equals(title)
            && position.getPerson() == Person.NULL) {
                return true;
            }
        }
        return false;
    }
    public void fillPosition(String title, Person person) {
        for (Position position : this) {
            if (position.getTittle().equals(title)
            && position.getPerson() == Person.NULL) {
                position.setPerson(person);
                return;
            }
        }
        throw new RuntimeException("Positon " + title + "not avaliable");
    }
    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO", "Marketing Manager", "Product Manager",
                "Project Lead", "Software Engineer", "Software Engineer", "Software Engineer", "Software Engineer",
                "Test Engineer", "Technical Writer");
        staff.fillPosition("President", new Person("Me", "Last", "The Top, lonely At"));
        staff.fillPosition("Project Lead", new Person("Janet", "Planner", "The Burbs"));
        if (staff.positionValiable("Software Engineer")) {
            staff.fillPosition("Software Engineer", new Person("Bob", "Coder", "Bright Light City"));
        }
        System.out.println(staff);
    }
}
