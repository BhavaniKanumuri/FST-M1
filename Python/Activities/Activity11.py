my_dict={"apple":60,"banana":50,"guava":120,"strawberry":150}
print(my_dict)

ver_dict=input("Enter the fruit name").lower()
if(ver_dict in my_dict):
    print("Yes, the entered fruit is available")
else:
    print("No, the entered fruit is not available")