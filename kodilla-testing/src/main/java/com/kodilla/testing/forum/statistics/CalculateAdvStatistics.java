package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateAdvStatistics implements Statistics {
    Statistics statistics;
    public int usersCount;
    public int postsCount;
    public int commentsCount;
    public double avgPostsPerUser;
    public double avgCommentsPerUser;
    public double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(usersCount!=0) {
            avgPostsPerUser = (double) postsCount / (double) usersCount;
            avgCommentsPerUser = (double)commentsCount / (double)usersCount;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }

        if(postsCount!=0) {
            avgCommentsPerPost = (double)commentsCount / (double)postsCount;
        } else {
            avgCommentsPerPost=0;
        }

        showStatistics();
    }
    public List<String> usersNames() {
        List<String> usersNames;
        usersNames = statistics.usersNames();
        return usersNames;
    }

    public int postsCount() {
        postsCount = statistics.postsCount();
        return postsCount;
    }

    public int commentsCount() {
        commentsCount = statistics.commentsCount();;
        return commentsCount;
    }
    public int getUsersCount() {
        usersCount = statistics.usersNames().size();
        return  usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Posts count: "+ postsCount + ", comments count: "
                + commentsCount + ", users count: " + usersCount);
    }

    public Statistics getStatistics() {
        return statistics;
    }
}