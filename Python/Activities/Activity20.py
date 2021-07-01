import pandas

#Read from excel
dataframe=pandas.read_excel("sample.xlsx")

#Print the data
print("The data is: ")
print(dataframe)

#Print the number of rows and columns
print("The number of rows and columns are: ", dataframe.shape)

#Print the data in email column
print("The email column data is: ")
print(dataframe['Email'])

#Sort the FirstName in ascending order and print the data
print("The FirstName sorted in ascending order is: ")
print(dataframe.sort_values('FirstName'))



