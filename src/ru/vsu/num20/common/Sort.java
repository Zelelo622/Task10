package ru.vsu.num20.common;

import ru.vsu.num20.Students;

import java.util.ArrayList;

public class Sort {

    public static ArrayList<Students> sortList(ArrayList<String> studentsStrings, int choiceOption) {
        ArrayList<Students> students = new ArrayList<>();
        studentsStrings.remove(0);
        for (String index : studentsStrings) {
            String[] row = index.split(",");
            String name = row[0];
            int course = Integer.parseInt(row[1]);
            int group = Integer.parseInt(row[2]);
            students.add(new Students(name, course, group));
        }
        if (choiceOption == 1) {
            students.sort(new NameComparator());
        }
        if (choiceOption == 2) {
            students.sort(new CourseComparator());
        }
        if (choiceOption == 3) {
            students.sort(new GroupComparator());
        }
        return students;
    }
}
