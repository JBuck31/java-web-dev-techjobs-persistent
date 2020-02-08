## Part 1: Test it with SQL list the columns and their data types in the table.
##Is this all it wants??

SELECT *
FROM techjobs.job;

## Part 2: Test it with SQL

SELECT *
FROM techjobs.employer
Where location="St. Louis";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL

//select name and description from the skill table where id from skill table is in the job_skills table (use is not null). Return in alphabetical order.

SELECT name, description
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.skills_id is not null
ORDER BY name;