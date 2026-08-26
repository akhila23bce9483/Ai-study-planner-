package com.personalstudyplanner.service;
import com.personalstudyplanner.model.*; import java.time.LocalDate; import java.util.*;
public class StudyPlanner {
 private final PriorityCalculator calculator; public StudyPlanner(PriorityCalculator calculator){this.calculator=calculator;}
 public List<StudySession> generate(List<Topic> topics,int availableMinutes){if(availableMinutes<=0)return List.of(); PriorityQueue<Topic> q=new PriorityQueue<>(Comparator.comparingDouble(calculator::calculatePriority).reversed().thenComparing(t->t.getDeadline()==null?LocalDate.MAX:t.getDeadline()).thenComparing(Topic::remainingMinutes,Comparator.reverseOrder())); topics.stream().filter(t->t.getStatus()!=Topic.Status.COMPLETED&&t.remainingMinutes()>0).forEach(q::offer); List<StudySession> out=new ArrayList<>();int left=availableMinutes;while(!q.isEmpty()&&left>0){Topic t=q.poll();int d=Math.min(left,Math.min(90,t.remainingMinutes()));out.add(new StudySession(t.getId(),LocalDate.now(),d,"PLANNED"));left-=d;}return out;}
}
