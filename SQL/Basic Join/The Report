SELECT CASE
    WHEN S.Marks<70 THEN 'NULL'
    ELSE S.Name
    END
    , G.Grade ,S.Marks
FROM STUDENTS S JOIN GRADES G
ON S.Marks >= G.Min_Mark AND S.Marks <= G.Max_Mark
Order By G.Grade DESC,S.Name, S.Marks;
