USE personal_study_planner;
INSERT INTO users(name,email,available_hours_per_day,preferred_start_time) VALUES ('Demo Student','demo@example.com',3.0,'18:00:00');
INSERT INTO subjects(user_id,subject_name,description) VALUES (1,'Java','Core Java concepts'),(1,'DSA','Data structures and algorithms');
INSERT INTO topics(subject_id,topic_name,difficulty,importance,estimated_minutes,deadline,progress) VALUES (1,'OOP',3,5,90,DATE_ADD(CURDATE(),INTERVAL 10 DAY),20),(1,'Collections',4,5,120,DATE_ADD(CURDATE(),INTERVAL 12 DAY),0),(2,'Trees',4,5,120,DATE_ADD(CURDATE(),INTERVAL 5 DAY),30),(2,'Dynamic Programming',5,5,180,DATE_ADD(CURDATE(),INTERVAL 7 DAY),0);
INSERT INTO topic_keywords(topic_id,keyword) VALUES (3,'tree'),(3,'avl'),(3,'bst'),(4,'knapsack'),(4,'dynamic programming'),(4,'dp');
