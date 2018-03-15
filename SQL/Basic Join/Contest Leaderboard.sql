select *
from 
(select A.hacker_id, H.name, sum(A.ms) as ss
from Hackers H,
(select max(score) as ms, challenge_id, hacker_id
from Submissions
group by challenge_id, hacker_id
order by challenge_id) A
where H.hacker_id = A.hacker_id
group by A.hacker_id, H.name
order by sum(A.ms) desc, hacker_id)
where ss != 0;
