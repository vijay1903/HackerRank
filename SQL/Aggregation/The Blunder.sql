select round(avg(Salary))-floor(avg(replace(Salary, '0', '')))
from employees;
