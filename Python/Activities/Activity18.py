import pandas

#Read the csv file
dataframe=pandas.read_csv("sample.csv")

#Print the full data
print("The data is: ")
print(dataframe)

#Print the Username column
print("Usernames are: ")
print(dataframe["Usernames"])

#Print the username and password of the second row
print("The username and password of the second row is: ")
print("Username: ", dataframe["Usernames"][1], "|","Password: ", dataframe["Passwords"][1])

#Print username column in ascending order
print("The data of usernames in ascending order is: ")
print(dataframe.sort_values("Usernames"))

#Print passwords in descending order
print("The data of passwords in descending order is: ")
print(dataframe.sort_values("Passwords", ascending=False))


