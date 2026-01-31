l1 = list(map(int,input("enter list of values with spaces").split()))
l2 = list(map(int,input("enter list of values with spaces ").split()))
ln1=[i for i in l1 if i%2!=0]
ln2=[i for i in l2 if i%2!=0]
print(ln1,ln2)