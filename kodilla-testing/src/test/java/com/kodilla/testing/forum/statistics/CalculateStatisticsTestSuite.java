package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private static int testCounter = 1;

    @Before
    public void before() {
        System.out.println("Start test " + testCounter);
    }

    @After
    public void after() {
        System.out.println("End test " + testCounter + "\n");
        testCounter++;
    }

    @Test
    public void testPostsNumber0() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        Statistics statisticsMock = prepareStatisticsMock(usersNames, 0, 500);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double averageNumbersOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        int numberOfPostsEqualsNull = calculateStatistics.getNumberOfPosts();

        //THEN
        Assert.assertEquals(0, numberOfPostsEqualsNull);
        Assert.assertEquals(0, averageNumbersOfCommentsForPost,0);
        Assert.assertEquals(5.0, averageNumberOfCommentsForUser, 0);
        Assert.assertEquals(0, averageNumberOfPostsForUser, 0);
        System.out.println("Test post number = 0");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testNumberOfPosts1000() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        Statistics statisticsMock = prepareStatisticsMock(usersNames, 1000, 500);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double averageNumbersOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();

        //THEN
        Assert.assertEquals(0.5, averageNumbersOfCommentsForPost, 0);
        Assert.assertEquals(5.0, averageNumberOfCommentsForUser, 0);
        Assert.assertEquals(10.0, averageNumberOfPostsForUser, 0);
        System.out.println("Test post number = 1000");
        calculateStatistics.showStatistics();
    }

    @Test
    public void numbersOfComments0() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        Statistics statisticsMock = prepareStatisticsMock(usersNames, 1000, 0);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double averageNumbersOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        int numbersOfCommentsEqualsNull = calculateStatistics.getNumberOfComments();

        //THEN
        Assert.assertEquals(0, numbersOfCommentsEqualsNull);
        Assert.assertEquals(0.0, averageNumbersOfCommentsForPost,0);
        Assert.assertEquals(0.0, averageNumberOfCommentsForUser,0);
        Assert.assertEquals(10.0, averageNumberOfPostsForUser, 0);
        System.out.println("Test comments number = 0");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testCommentsLessThanPosts() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        Statistics statisticsMock = prepareStatisticsMock(usersNames, 100, 50);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double averageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(0.5, averageNumberOfCommentsForPost, 0);
        Assert.assertEquals(0.5, averageNumberOfCommentsForUser,0);
        Assert.assertEquals(1.0, averageNumberOfPostsForUser, 0);
        System.out.println("Test comments number less than posts");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testCommentsMoreThanPosts() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        Statistics statisticsMock = prepareStatisticsMock(usersNames, 100, 500);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double averageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(5.0, averageNumberOfCommentsForPost, 0);
        Assert.assertEquals(5.0, averageNumberOfCommentsForUser,0);
        Assert.assertEquals(1.0, averageNumberOfPostsForUser, 0);
        System.out.println("Test comments number more than posts");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testNumberOfUsers0() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        Statistics statisticsMock = prepareStatisticsMock(usersNames, 100, 500);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        int numberOfUsersEqualsNull = calculateStatistics.getNumberOfUsers();
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double averageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(0, numberOfUsersEqualsNull);
        Assert.assertEquals(5.0, averageNumberOfCommentsForPost,0);
        Assert.assertEquals(0, averageNumberOfCommentsForUser, 0);
        Assert.assertEquals(0, averageNumberOfPostsForUser, 0);
        System.out.println("Users number equals 0");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testNumbersOfUsers100() {
        //GIVEN
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        Statistics statisticsMock = prepareStatisticsMock(usersNames,1000, 200);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double averageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double averageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(0.2, averageNumberOfCommentsForPost,0);
        Assert.assertEquals(2.0, averageNumberOfCommentsForUser, 0);
        Assert.assertEquals(10.0, averageNumberOfPostsForUser, 0);
        System.out.println("Users number equals 100");
        calculateStatistics.showStatistics();
    }

    private Statistics prepareStatisticsMock(List<String> userNames, int posts, int comments){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        return statisticsMock;
    }

}
