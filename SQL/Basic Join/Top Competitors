SELECT H.hacker_id, H.name
FROM Hackers H, Submissions S, Challenges C, Difficulty D 
WHERE H.hacker_id = S.hacker_id
AND S.challenge_id = C.challenge_id
AND C.difficulty_level = D.difficulty_level
AND S.score = D.score
GROUP BY H.hacker_id, H.name
HAVING COUNT(S.challenge_id) > 1
order by count(S.challenge_id) desc, H.hacker_id;
