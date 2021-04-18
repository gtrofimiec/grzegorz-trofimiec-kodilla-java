package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Statistics test")
public class StatisticsTest {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

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
        void AvgWithNullPostsCondition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            //when(statisticsMock.postsCount()).thenReturn(0);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int postsCount = 0;
            double usersCount = forumStats.usersCount();
            double avgPostsPerUser = postsCount / usersCount;


            //Then
            Assertions.assertEquals(0, avgPostsPerUser);
        }

        @DisplayName("Test: the number of posts = 1000")
        @Test
        void postCountTest1000Condition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.postsCount()).thenReturn(1000);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int postsCountTest = forumStats.postsCount();

            //Then
            Assertions.assertEquals(1000, postsCountTest);
        }
    }

    @Nested
    @DisplayName("Comments tests")
    class CommentsTests {

        @DisplayName("Test: the number of comments = 0")
        @Test
        void AdvWithNullCommentsCondition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.commentsCount()).thenReturn(0);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int commentsCountTest = forumStats.postsCount();

            //Then
            Assertions.assertEquals(0, commentsCountTest);
        }

        @DisplayName("Test: the number of comments is less than the number of posts")
        @Test
        void commentsCountLessThanPostsCondition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.postsCount()).thenReturn(1000);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int commentsCountTest = statisticsMock.commentsCount();
            int postsCountTest = forumStats.postsCount();

            //Then
            Assertions.assertTrue(commentsCountTest < postsCountTest);
        }

        @DisplayName("Test: the number of comments is greater than the number of posts")
        @Test
        void commentsCountGreaterThanPostsCondition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.commentsCount()).thenReturn(1000);
            when(statisticsMock.postsCount()).thenReturn(100);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int commentsCountTest = statisticsMock.commentsCount();
            int postsCountTest = forumStats.postsCount();

            //Then
            Assertions.assertTrue(commentsCountTest > postsCountTest);
        }
    }

    @Nested
    @DisplayName("Users tests")
    class UsersTests {
        @DisplayName("When users count = 0")
        @Test
        void userCountTestNullUsersCondition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(usersList);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int usersCount = forumStats.usersCount();

            //Then
            Assertions.assertEquals(0, usersCount);
        }

        @DisplayName("When users count = 100")
        @Test
        void userCountTest100UsersCondition() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
            for (int i = 0; i <= 99; i++) {
                usersList.add("user" + i);
            }
            when(statisticsMock.usersNames()).thenReturn(usersList);
            CalculateAdvStatistics forumStats = new CalculateAdvStatistics(statisticsMock);

            //When
            int usersCount = forumStats.usersCount();

            //Then
            Assertions.assertEquals(100, usersCount);
        }
    }
}
