SELECT CN.CONTINENT, FLOOR(AVG(CT.POPULATION))
FROM CITY CT JOIN COUNTRY CN 
ON CN.CODE = CT.COUNTRYCODE
GROUP BY CN.CONTINENT
ORDER BY CN.CONTINENT;