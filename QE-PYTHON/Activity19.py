import pandas as pd
data={ "FirstName":["satvik","Avinash","lahri"],
      "LastName":["shah","kati","rath"],
      "Email":["satshah@example.com","avinashk@example.com","lahari.rath@example.com"],
      "Phoneno":["4557689213","5789876032","5609123857"]}
df=pd.DataFrame(data)
df.to_excel("users.xlsx",index=False)
print("excel created successfully")

