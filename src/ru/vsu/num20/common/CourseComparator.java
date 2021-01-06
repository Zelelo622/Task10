package ru.vsu.num20.common;

import ru.vsu.num20.Students;

import java.util.Comparator;

public class CourseComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getCourse() - o2.getCourse();
    }
}