-- SQL Problem 004: University Database - Basic SELECT/WHERE/ORDER BY
-- Write your queries here for each task below.

1. SELECT name from students
    where department="Computer Science";

2. SELECT * from enrollments 
    WHERE grade="A"
    ORDER BY student_id;

3. SELECT course_name FROM courses 
    where credits=3
    ORDER BY course_name;

4. SELECT * from students
    where age>20
    ORDER BY DESC;