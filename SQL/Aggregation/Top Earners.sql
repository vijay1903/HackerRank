select max(salary*months), max(count(salary*months))  from employee
group by salary*months;
