package com.personalstudyplanner.service;
import com.personalstudyplanner.model.Topic;import org.junit.jupiter.api.Test;import java.time.LocalDate;import static org.junit.jupiter.api.Assertions.*;
class RevisionPlannerTest{@Test void completedTopicGetsFourRevisions(){var t=new Topic(1,"Trees",4,5,120,LocalDate.now().plusDays(10),100);var r=new RevisionPlanner().plan(t);assertEquals(4,r.size());assertEquals(LocalDate.now().plusDays(1),r.get(0).scheduledDate());assertEquals(LocalDate.now().plusDays(14),r.get(3).scheduledDate());}}
