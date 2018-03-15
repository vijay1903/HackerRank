SELECT (NAME||'('||SUBSTR(OCCUPATION,1,1)||')') FROM OCCUPATIONS
ORDER BY NAME;
SELECT * FROM (
  SELECT ('There are a total of '|| count(*)||' '|| LOWER(occupation)|| 's.')
  FROM occupations
  GROUP BY occupation
  ORDER BY COUNT(*), LOWER(occupation)
);

