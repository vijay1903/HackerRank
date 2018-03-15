select  c.idee, c.nm, cc.counts from
    (select count(counts) as c_counts, counts
    from (select H.hacker_id, H.name as nm, count(C.challenge_id)     as counts
    from Hackers H join Challenges C
    on H.hacker_id = C.hacker_id
    group by H.hacker_id, H.name
    order by count(C.challenge_id) desc, H.hacker_id)
    group by counts
    order by counts) cc
join 
    (select H.hacker_id as idee, H.name as nm, count(C.challenge_id)           as counts
    from Hackers H join Challenges C
    on H.hacker_id = C.hacker_id
    group by H.hacker_id, H.name
    order by count(C.challenge_id) desc, H.hacker_id) c
on c.counts=cc.counts
where ((cc.c_counts = 1) or (cc.counts = 50));
