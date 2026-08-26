package com.personalstudyplanner.model;
public record PerformanceRecord(int topicId,int totalQuestions,int correctAnswers,int confidenceLevel){public double scorePercentage(){return totalQuestions==0?0:correctAnswers*100.0/totalQuestions;}}
