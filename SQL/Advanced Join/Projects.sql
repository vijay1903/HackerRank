--select * from projects order by start_date;  
select Aa.s, min(Bb.e) from
(select A.start_date  as s
from (select * from projects order by start_date) A
where A.start_date not in (select end_date from projects)) Aa,
(select B.end_date as e
from (select * from projects order by start_date) B
where B.end_date not in (select start_date from projects)) Bb
where AA.s < Bb.e
group by Aa.s
order by Aa.s-min(Bb.e) desc, Aa.s, min(Bb.e);

