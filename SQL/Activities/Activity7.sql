select sum(PURCHASE_AMOUNT) as "total_sum" from orders

select avg(PURCHASE_AMOUNT) as "average" from orders

select max(purchase_amount) as "maximum" from orders

select min(purchase_amount) as "minimum" from orders

select count(distinct salesman_id) as "total salesman count" from orders