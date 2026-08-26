package com.personalstudyplanner.model;
import java.time.LocalDate;
public record RevisionSession(int topicId,int revisionNumber,LocalDate scheduledDate,String status) {}
