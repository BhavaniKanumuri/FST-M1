create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001)
INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001)
INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002)
INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002)
INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003)
INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007)
INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

-- Write an SQL statement to know which salesman are working for which customer.
SELECT cust.CUSTOMER_NAME as "Customer name",s.SALESMAN_NAME as "Salesman name",cust.city, s.COMMISSION
from salesman s
inner join CUSTOMERS cust
on s.SALESMAN_ID=cust.SALESMAN_ID

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
SELECT cust.customer_id,cust.customer_name,cust.CITY,cust.GRADE,s.salesman_name AS "Salesman", s.SALESMAN_CITY
from CUSTOMERS cust
LEFT OUTER JOIN SALESMAN s
on s.SALESMAN_ID=cust.SALESMAN_ID
where cust.GRADE<'300'
order by cust.customer_id

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
SELECT o.ORDER_NO, o.ORDER_DATE,o.PURCHASE_AMOUNT,cust.CUSTOMER_NAME as "Customer Name",cust.grade,s.salesman_name as "Salesman Name",s.COMMISSION
from ORDERS o
INNER JOIN CUSTOMERS cust ON o.CUSTOMER_ID=cust.CUSTOMER_ID
INNER JOIN SALESMAN s ON o.SALESMAN_ID=s.SALESMAN_ID