package com.personalstudyplanner.service;
import com.personalstudyplanner.model.*; import java.time.LocalDate; import java.util.*;
public class RevisionPlanner { public List<RevisionSession> plan(Topic t){if(t.getStatus()!=Topic.Status.COMPLETED)return List.of();int[] days={1,3,7,14};List<RevisionSession> r=new ArrayList<>();for(int i=0;i<days.length;i++)r.add(new RevisionSession(t.getId(),i+1,LocalDate.now().plusDays(days[i]),"PLANNED"));return r;} }
