package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateAdvStatistics {
    private Statistics statistics;

    public CalculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int usersCount() {
        List<String> usersNames = new ArrayList<>();

        for (String name : statistics.usersNames()) {
            usersNames.add(name);
        }

        int usersCount = usersNames.size();
        return usersCount;
    }

    public int postsCount() {
        int postsCount = statistics.postsCount();
        return postsCount;
    }

    public int commentsCount() {
        int commentsCount = statistics.commentsCount();
        return commentsCount;
    }

    public double avgPostsCountPerUser() {
        List<String> usersNames = new ArrayList<>();

        for (String name : statistics.usersNames()) {
            usersNames.add(name);
        }
        int usersCount = usersNames.size();
        int postsCount = statistics.postsCount();

        double avgPostsCountPerUser = usersCount / postsCount;
        return avgPostsCountPerUser;
    }

    public double avgCommentsCountPerUser() {
        List<String> usersNames = new ArrayList<>();

        for (String name : statistics.usersNames()) {
            usersNames.add(name);
        }
        int usersCount = usersNames.size();
        int commentsCount = statistics.commentsCount();

        double avgCommentsCountPerUser = usersCount / commentsCount;
        return avgCommentsCountPerUser;
    }

    public double avgCommentsCountPerPost() {
        int commentsCount = statistics.commentsCount();
        int postsCount = statistics.postsCount();

        double avgCommentsCountPerPost = commentsCount / postsCount;
        return avgCommentsCountPerPost;
    }

    public void showStatistics() {
        System.out.println("test");
    }
}