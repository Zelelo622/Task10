package ru.vsu.num20.common;

import ru.vsu.num20.Students;

import java.util.Comparator;

public class GroupComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getGroup() - o2.getGroup();
    }
}
