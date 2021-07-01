-- Add the grade column
alter table salesman 
add grade int

-- Update the values in the grade column
update salesman set grade='100'

-- Display data
select * from salesman