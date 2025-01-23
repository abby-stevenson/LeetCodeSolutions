SELECT Em.name as Employee
FROM Employee Em
JOIN Employee E ON Em.managerId = E.ID
WHERE Em.salary > E.salary;
