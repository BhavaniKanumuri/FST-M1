def total_sum(num):
    sum=0
    for each in num:
        sum += each
    return sum

my_list=[12,23,45,100]
result=total_sum(my_list)
print("The sum of all the numbers in a given list is:"+str(result))