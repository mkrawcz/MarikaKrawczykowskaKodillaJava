package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "JohnSmith", 'M', LocalDate.parse("1995-11-15"), 5));
        userList.add(new ForumUser(2, "DorothyNewman", 'W', LocalDate.parse("1985-05-25"), 14 ));
        userList.add(new ForumUser(3, "JohnWolkowitz", 'M', LocalDate.parse("1954-12-24"), 0));
        userList.add(new ForumUser(4, "LucyRiley", 'W', LocalDate.parse("1978-09-12"), 115));
        userList.add(new ForumUser(5, "OwenRogers", 'M', LocalDate.parse("1996-11-12"), 4));
        userList.add(new ForumUser(6, "MatildeLudtke", 'W', LocalDate.parse("1967-06-03"),8));
        userList.add(new ForumUser(7, "SteffenLudtke", 'M', LocalDate.parse("1992-03-05" ), 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
