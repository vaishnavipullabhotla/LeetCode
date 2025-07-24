# Write your MySQL query statement below
select a.name as Employee
from employee a
JOIN employee b
ON a.managerId=b.id
where a.salary>b.salary;