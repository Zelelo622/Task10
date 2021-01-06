package ru.vsu.num20;

public class Students {

    private String name;
    private int course;
    private int group;

    public Students(String name, int course, int group) {
        this.name = name;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return name + "," + course + "," + group;
    }
}
