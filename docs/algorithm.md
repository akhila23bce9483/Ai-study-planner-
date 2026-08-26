# Scheduling and Intelligence

The first version deliberately uses explainable rule-based intelligence rather than machine learning.

## Priority score
`Priority = Difficulty + Importance + Deadline Urgency + Remaining Work + PYQ Frequency + Weakness`

Each factor has a small readable score. Deadline urgency rises as the exam approaches. Remaining work is based on estimated minutes and progress. PYQ frequency comes from the student's own previous-year questions. Weakness uses practice performance and missed sessions.

## PriorityQueue
`StudyPlanner` places incomplete topics in a Java `PriorityQueue`. Higher priority comes first, then earlier deadline, then larger remaining work. Queue insertion/removal is `O(log n)`.

## Adaptive behaviour
Completed topics leave normal study planning and enter revision planning. Missed work is not deleted, so priority can be recalculated later.

## PYQ classification
The initial classifier uses a `HashMap<Integer, Set<String>>` of topic keywords. Matching is deterministic substring matching, not NLP or machine learning.

## Emergency mode
When remaining preparation time exceeds available time, Priority Preparation Mode is recommended instead of promising full syllabus completion.
