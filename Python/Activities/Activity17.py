import pandas

data={
    "Usernames" : ["admin", "Charles","Deku"],
    "Passwords" : ["password", "Charl13","AllMight"]
}
dataframe= pandas.DataFrame(data)

print(dataframe)

"""
This is a CSV File
The index is set to False
"""
dataframe.to_csv("sample.csv", index=False)