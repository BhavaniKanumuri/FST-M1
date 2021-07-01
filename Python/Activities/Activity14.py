def fibonacci_series(num):
    if (num==0):
        return 0
    elif (num==1):
        return 1
    else:
        return(fibonacci_series(num-2)+fibonacci_series(num-1))

my_list= int(input("Enter the number:"))
if my_list<=0:
    print("The entered number is not a valid one. Please enter a positive number")
else:
    print("The Fibonacci series is:")
    for my_list in range(my_list):
        print(fibonacci_series(my_list))