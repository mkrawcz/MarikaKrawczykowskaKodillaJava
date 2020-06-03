package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsForUser;
    private double averageNumberOfCommentsForUser;
    private double averageNumbersOfCommentsForPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers == 0) {
            averageNumberOfPostsForUser = 0.0;
            averageNumberOfCommentsForUser = 0.0;
        } else {
            averageNumberOfPostsForUser = (double) numberOfPosts / (double) numberOfUsers;
            averageNumberOfCommentsForUser = (double) numberOfComments / (double) numberOfUsers;
        }
        if (numberOfPosts == 0) {
            averageNumbersOfCommentsForPost = 0.0;
        } else {
            averageNumbersOfCommentsForPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users " + numberOfUsers);
        System.out.println("Number of posts " + numberOfPosts);
        System.out.println("Number of comments " + numberOfComments);
        System.out.println("Average number of posts for user " + averageNumberOfPostsForUser);
        System.out.println("Average number of comments for user " + averageNumberOfCommentsForUser);
        System.out.println("Average number of comments for post " + averageNumbersOfCommentsForPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsForUser() {
        return averageNumberOfPostsForUser;
    }

    public double getAverageNumberOfCommentsForUser() {
        return averageNumberOfCommentsForUser;
    }

    public double getAverageNumbersOfCommentsForPost() {
        return averageNumbersOfCommentsForPost;
    }


}
