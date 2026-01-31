Fruits ={
    "apple": 120,
    "banana": 40,
    "grapes": 80,
    "muskmelon": 50,
    "orange": 60
}
fruit = input("Enter fruit name: ").lower()
if fruit in Fruits:
    print(fruit, "is available. price:",Fruits[fruit])
else:
    print(fruit, "is not available.")