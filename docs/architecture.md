# Architecture

The application uses a simple layered structure:

- `model`: domain objects and records.
- `service`: scheduling, revision, PYQ, practice, readiness and recommendation logic.
- `database`: JDBC connection configuration.
- `util`: reusable validation.
- `database/`: MySQL schema and sample data.

The core scheduling logic is independent of MySQL so it can be unit-tested with plain Java objects. Database credentials are supplied through environment variables.

## Learning loop
Learn -> Complete -> Practice -> PYQ -> Performance -> Revision.

An optional AI API can be added later without making the core planner dependent on it.
