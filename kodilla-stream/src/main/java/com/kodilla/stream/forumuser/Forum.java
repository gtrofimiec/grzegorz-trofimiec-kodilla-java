package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum () {
        theUsersList.add(new ForumUser(0, "John", 'M',
                1976, 3, 10, 3));
        theUsersList.add(new ForumUser(1, "Debora", 'F',
                1980, 3, 2, 8));
        theUsersList.add(new ForumUser(2, "Mitchel", 'M',
                1985, 1, 25, 12));
        theUsersList.add(new ForumUser(3, "Jenny", 'F',
                1990, 7, 11, 0));
        theUsersList.add(new ForumUser(4, "Frank", 'M',
                1995, 10, 8, 9));
        theUsersList.add(new ForumUser(5, "Julia", 'F',
                2002, 8, 16, 4));
        theUsersList.add(new ForumUser(6, "Jimmy", 'M',
                2005, 12, 24, 1));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUsersList);
    }
}
