select W.id, P.age, W.coins_needed, W.power
from Wands W join Wands_property P
on W.code = P.code
where w.coins_needed = 
    (select min(coins_needed)
    from Wands W2 inner join Wands_Property P2 on W2.code = P2.code
    where P2.is_evil = 0 and W.power = W2.power and P.age = P2.age)
order by W.power desc, P.age desc;

