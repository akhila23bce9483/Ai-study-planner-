# Personal AI Study Planner

A console-based personalised study planner for exam preparation. The first version uses explainable rule-based intelligence rather than machine learning.

## Features
- Topic difficulty, importance, estimated time, deadline and progress
- Priority-based study planning with Java `PriorityQueue`
- Adaptive handling of incomplete work
- Spaced revision at +1, +3, +7 and +14 days
- Deterministic PYQ classification using topic keywords
- PYQ frequency analysis
- Practice performance and weak-topic detection
- Priority Preparation Mode for limited time
- Internal readiness indicator
- MySQL schema with foreign keys and indexes

## Technology
Java 17, Maven, MySQL, JDBC, JUnit 5, OOP, Collections, PriorityQueue, HashMap, ArrayList and sorting.

## Setup
1. Install Java 17+ and Maven.
2. Install MySQL and run `database/schema.sql`.
3. Optionally run `database/sample_data.sql`.
4. Set `DB_PASSWORD`; optionally set `DB_URL` and `DB_USER`.
5. Run `mvn test`, then `mvn package`.
6. Run `java -cp target/classes com.personalstudyplanner.Main`.

No passwords or API keys are stored in the repository.

## Architecture
`model` contains domain objects, `service` contains scheduling and analysis logic, `database` contains JDBC configuration, and `util` contains validation. See `docs/architecture.md` and `docs/algorithm.md`.

## Learning loop
Learn -> Complete -> Practice -> PYQ -> Performance -> Revision.

## Future improvements
Complete JDBC DAO CRUD operations, expand the console menu, add verified learning resources, add JavaFX after the core is stable, and optionally add an external AI layer with a rule-based fallback.
