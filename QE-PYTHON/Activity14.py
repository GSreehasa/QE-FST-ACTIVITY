def fibonacci(num: int):
    if num <= 1:
        return num
    else:
        return (fibonacci(num-1) + fibonacci(num-2))
nterms = int(input("how many values do you want?"))

if nterms <= 0:
    print("enter the positive value")
else:
    for i in range(nterms):
        print(fibonacci(7))