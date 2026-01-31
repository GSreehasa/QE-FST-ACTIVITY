import pandas as pd
data = {
    "usernames": ["admin", "charles", "deku"],
    "Passwords": ["password","Char113","AllMight"]
}

df = pd.DataFrame(data)
df.to_csv("users.csv", index=False)
print("CSV file created successfully")