package com.personalstudyplanner.model;
import java.time.LocalDate;
public record StudySession(int topicId, LocalDate date, int durationMinutes, String status) {}
