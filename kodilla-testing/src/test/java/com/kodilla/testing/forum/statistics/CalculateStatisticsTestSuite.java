package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.doubleThat;
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
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 0;
        int commentsCount = 500;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double AverageNumbersOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        int numberOfPostsEqualsNull = calculateStatistics.getNumberOfPosts();

        //THEN
        Assert.assertEquals(0, numberOfPostsEqualsNull);
        Assert.assertEquals(0, AverageNumbersOfCommentsForPost,0);
        Assert.assertEquals(5.0, AverageNumberOfCommentsForUser, 0);
        Assert.assertEquals(0, AverageNumberOfPostsForUser, 0);
        System.out.println("Test post number = 0");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testNumberOfPosts1000() {
        //GIVEN
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 1000;
        int commentsCount = 500;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double AverageNumbersOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();

        //THEN
        Assert.assertEquals(0.5, AverageNumbersOfCommentsForPost, 0);
        Assert.assertEquals(5.0, AverageNumberOfCommentsForUser, 0);
        Assert.assertEquals(10.0, AverageNumberOfPostsForUser, 0);
        System.out.println("Test post number = 1000");
        calculateStatistics.showStatistics();
    }

    @Test
    public void numbersOfComments0() {
        //GIVEN
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 1000;
        int commentsCount = 0;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double AverageNumbersOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        int numbersOfCommentsEqualsNull = calculateStatistics.getNumberOfComments();

        //THEN
        Assert.assertEquals(0, numbersOfCommentsEqualsNull);
        Assert.assertEquals(0.0, AverageNumbersOfCommentsForPost,0);
        Assert.assertEquals(0.0, AverageNumberOfCommentsForUser,0);
        Assert.assertEquals(10.0, AverageNumberOfPostsForUser, 0);
        System.out.println("Test comments number = 0");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testCommentsLessThanPosts() {
        //GIVEN
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 100;
        int commentsCount = 50;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double numberOfUsers = calculateStatistics.getNumberOfUsers();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double AverageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(0.5, AverageNumberOfCommentsForPost, 0);
        Assert.assertEquals(0.5, AverageNumberOfCommentsForUser,0);
        Assert.assertEquals(1.0, AverageNumberOfPostsForUser, 0);
        System.out.println("Test comments number less than posts");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testCommentsMoreThanPosts() {
        //GIVEN
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 100;
        int commentsCount = 500;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double numberOfUsers = calculateStatistics.getNumberOfUsers();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double AverageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(5.0, AverageNumberOfCommentsForPost, 0);
        Assert.assertEquals(5.0, AverageNumberOfCommentsForUser,0);
        Assert.assertEquals(1.0, AverageNumberOfPostsForUser, 0);
        System.out.println("Test comments number more than posts");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testNumberOfUsers0() {
        //GIVEN
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        int postCount = 100;
        int commentsCount = 500;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        int numberOfUsersEqualsNull = calculateStatistics.getNumberOfUsers();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double AverageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(0, numberOfUsersEqualsNull);
        Assert.assertEquals(5.0, AverageNumberOfCommentsForPost,0);
        Assert.assertEquals(0, AverageNumberOfCommentsForUser, 0);
        Assert.assertEquals(0, AverageNumberOfPostsForUser, 0);
        System.out.println("Users number equals 0");
        calculateStatistics.showStatistics();
    }

    @Test
    public void testNumbersOfUsers100() {
        //GIVEN
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("Name" + i);
        }
        int postCount = 1000;
        int commentsCount = 200;

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //WHEN
        double numberOfUsers = calculateStatistics.getNumberOfUsers();
        double AverageNumberOfCommentsForUser = calculateStatistics.getAverageNumberOfCommentsForUser();
        double AverageNumberOfPostsForUser = calculateStatistics.getAverageNumberOfPostsForUser();
        double AverageNumberOfCommentsForPost = calculateStatistics.getAverageNumbersOfCommentsForPost();

        //THEN
        Assert.assertEquals(0.2, AverageNumberOfCommentsForPost,0);
        Assert.assertEquals(2.0, AverageNumberOfCommentsForUser, 0);
        Assert.assertEquals(10.0, AverageNumberOfPostsForUser, 0);
        System.out.println("Users number equals 100");
        calculateStatistics.showStatistics();
    }

}
