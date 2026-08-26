package com.personalstudyplanner.service;
import com.personalstudyplanner.model.Topic; import java.time.LocalDate; import java.time.temporal.ChronoUnit;
public class PriorityCalculator {
 public double calculateDifficultyScore(Topic t){return t.getDifficulty()*2.0;} public double calculateImportanceScore(Topic t){return t.getImportance()*2.0;}
 public double calculateDeadlineScore(Topic t){if(t.getDeadline()==null)return 0;long d=ChronoUnit.DAYS.between(LocalDate.now(),t.getDeadline());if(d<=0)return 10;if(d<=2)return 9;if(d<=7)return 7;if(d<=14)return 5;return 2;}
 public double calculateRemainingWorkScore(Topic t){return t.getProgress()>=100?0:10.0*t.remainingMinutes()/Math.max(1,t.getEstimatedMinutes());}
 public double calculatePYQScore(Topic t){return Math.min(10,t.getPyqFrequency()*2.0);} public double calculateWeaknessScore(Topic t){return Math.min(10,(100-t.getPracticeScore())/10.0+Math.max(0,3-t.getMissedSessions()));}
 public double calculatePriority(Topic t){return calculateDifficultyScore(t)+calculateImportanceScore(t)+calculateDeadlineScore(t)+calculateRemainingWorkScore(t)+calculatePYQScore(t)+calculateWeaknessScore(t);}
}
