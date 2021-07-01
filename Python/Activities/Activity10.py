my_tuple=input("Enter your numbers").split(",")
print("The given list of numbers are", my_tuple)

for num in my_tuple:
    if (int(num) % 5 == 0):
        print("Numbers that are divisible by 5 are:",num)