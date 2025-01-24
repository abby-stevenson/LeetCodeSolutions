SELECT name AS Customers
FROM Customers
LEFT JOIN Orders ON Orders.customerID = Customers.ID
WHERE Orders.customerID IS NULL;