# Write your MySQL query statement below
select e.name
from employee as e
JOIN employee as d
ON e.id = d.managerId
group by d.managerId
having count(d.managerId)>=5;