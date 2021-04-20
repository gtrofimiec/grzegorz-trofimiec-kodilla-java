package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateAdvStatistics {
    public Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {

        List<Statistics> userNames = new ArrayList<>();
        usersCount = userNames.size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(commentsCount!=0) {
            avgPostsPerUser= statistics.postsCount() / statistics.usersNames().size();
        } else {
            System.out.println("Error: Count of comments = 0!");
        }

        if(usersCount!=0) {
            avgCommentsPerUser = commentsCount / usersCount;
        } else {
            System.out.println("Error: Count of users = 0!");
        }

        if(postsCount!=0) {
            avgCommentsPerPost = commentsCount / postsCount;
        } else {
            System.out.println("Error: Count of posts = 0!");
        }
    }

    public void showStatistics() {
        System.out.println("test");
    }
}