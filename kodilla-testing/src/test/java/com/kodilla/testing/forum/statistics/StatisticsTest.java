package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Statistics test")
public class StatisticsTest {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Posts tests")
    class PostsTests {

        @DisplayName("Test: the number of posts = 0")
        @Test
        void AvgCommentsPerPostWithNullPostsCondition() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            when(statisticsMock.commentsCount()).thenReturn(10);
            when(statisticsMock.postsCount()).thenReturn(0);

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0,forumStats.getAvgCommentsPerPost());
            forumStats.showStatistics();
        }

        @DisplayName("Test: the number of posts = 1000")
        @Test
        void AvgPostsPerUserWith1000PostsCondition() {
            //Given
            Statistics statisticsMock = Mockito.mock(Statistics.class);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            List<String> mockUsersNames = new ArrayList<>();

            for (int i = 1; i <= 100; i++) {
                mockUsersNames.add("Name" + i);
            }

            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(mockUsersNames);

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(10,forumStats.getAvgPostsPerUser(), 0.01);
            forumStats.showStatistics();
        }
    }

    @Nested
    @DisplayName("Comments tests")
    class CommentsTests {

        @DisplayName("Test: the number of comments = 0")
        @Test
        void AvgCommentsPerUserWithNullCommentsCondition() {
            //Given
            Statistics statisticsMock = Mockito.mock(Statistics.class);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            List<String> mockUsersNames = new ArrayList<>();

            for (int i = 1; i <= 100; i++) {
                mockUsersNames.add("Name" + i);
            }

            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(mockUsersNames);

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0,forumStats.getAvgCommentsPerUser(), 0.01);
            forumStats.showStatistics();
        }

        @DisplayName("Test: the number of comments is less than the number of posts")
        @Test
        void commentsCountLessThanPostsCondition() {
            //Given
            Statistics statisticsMock = Mockito.mock(Statistics.class);
            when(statisticsMock.commentsCount()).thenReturn(10);
            when(statisticsMock.postsCount()).thenReturn(11);

            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0.91,forumStats.getAvgCommentsPerPost(),0.01);
            forumStats.showStatistics();
        }

        @DisplayName("Test: the number of comments is greater than the number of posts")
        @Test
        void commentsCountGreaterThanPostsCondition() {
            //Given
            Statistics statisticsMock = Mockito.mock(Statistics.class);
            when(statisticsMock.commentsCount()).thenReturn(10);
            when(statisticsMock.postsCount()).thenReturn(9);

            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(1.11,forumStats.getAvgCommentsPerPost(), 0.01);
            forumStats.showStatistics();
        }
    }

    @Nested
    @DisplayName("Users tests")
    class UsersTests {
        @DisplayName("When users count = 0")
        @Test
        void AvgPostsPerUserWithNullUsersCondition() {
            //Given
            Statistics statisticsMock = Mockito.mock(Statistics.class);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            List<String> mockUsersNames = new ArrayList<>();

            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.usersNames()).thenReturn(mockUsersNames);

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0,forumStats.getAvgPostsPerUser(), 0.01);
            forumStats.showStatistics();
        }

        @DisplayName("When users count = 100")
        @Test
        void AvgPostsPerUserWith1000UsersCondition() {
            //Given
            Statistics statisticsMock = Mockito.mock(Statistics.class);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics();

            List<String> mockUsersNames = new ArrayList<>();

            for (int i = 1; i <= 1000; i++) {
                mockUsersNames.add("Name" + i);
            }

            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(mockUsersNames);

            //When
            forumStats.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0.10,forumStats.getAvgPostsPerUser(), 0.01);
            forumStats.showStatistics();
        }
    }
}
