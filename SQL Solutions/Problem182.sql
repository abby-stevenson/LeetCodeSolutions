SELECT DISTINCT E.Email 
FROM Person E
JOIN Person Em ON E.email = Em.email
WHERE E.id != Em.id;