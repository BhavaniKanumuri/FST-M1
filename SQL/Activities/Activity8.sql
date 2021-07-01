-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
SELECT MAX(PURCHASE_AMOUNT) AS "MAX AMOUNT", CUSTOMER_ID FROM ORDERS 
GROUP BY CUSTOMER_ID;

-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
SELECT SALESMAN_ID, ORDER_DATE, MAX(PURCHASE_AMOUNT) AS "MAX AMOUNT" FROM ORDERS 
WHERE ORDER_DATE=TO_DATE('2012/08/17','YYYY/MM/DD')
GROUP BY SALESMAN_ID, ORDER_DATE;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list 2030, 3450, 5760, and 6000.
SELECT CUSTOMER_ID, ORDER_DATE, MAX(PURCHASE_AMOUNT) AS "MAX AMOUNT" FROM ORDERS 
WHERE PURCHASE_AMOUNT IN ('2030','3450','5760','6000')
GROUP BY CUSTOMER_ID, ORDER_DATE;