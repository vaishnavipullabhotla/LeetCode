# Write your MySQL query statement below
select a.student_id,a.student_name,b.subject_name,count(c.subject_name) as attended_exams
from students as a
CROSS JOIN subjects as b
LEFT JOIN examinations as c
ON a.student_id=c.student_id 
and b.subject_name=c.subject_name
GROUP BY a.student_id, a.student_name, b.subject_name
ORDER BY a.student_id, b.subject_name;