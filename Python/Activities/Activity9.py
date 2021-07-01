my_list1=[10,20,30,89,67,43]
my_list2=[12,45,66,11,90,100]

my_list3=[]
for num in my_list1:
    if (num % 2 !=0):
        my_list3.append(num)
for num in my_list2:
    if (num % 2 ==0):
        my_list3.append(num)

print("The First List is",my_list1)
print("The Second List is", my_list2)
print("The Result is", my_list3)