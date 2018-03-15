select a.x, a.y from functions a, functions b
where (a.x = b.y) and (a.y = b.x) and a.x<a.y
union 
select x, y from functions a where x=y and 
    ((select count(*) from functions where x=a.x and y=a.x)>1) 
    order by x;
