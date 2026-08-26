package com.personalstudyplanner.service;
import com.personalstudyplanner.model.PerformanceRecord;
public class PracticeService { public PerformanceRecord record(int topicId,int total,int correct,int confidence){if(total<=0||correct<0||correct>total||confidence<1||confidence>5)throw new IllegalArgumentException("Invalid performance data");return new PerformanceRecord(topicId,total,correct,confidence);} public boolean needsRevision(PerformanceRecord p){return p.scorePercentage()<60||p.confidenceLevel()<=2;} }
