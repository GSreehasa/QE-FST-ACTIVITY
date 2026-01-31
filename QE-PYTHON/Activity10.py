tuple1=tuple(map(int, input("Enter numbers: ").split()))
print("The numbers divisible by 5 are")
for i in tuple1:
    if(i%5==0):
        print(i)
