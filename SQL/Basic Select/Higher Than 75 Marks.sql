select name from students
where marks > 75
order by SUBSTR(name, -3), id;
