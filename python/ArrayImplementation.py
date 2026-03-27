def create_reverse_array(size):
    arr = []
    for i in range(size):
        arr.append(size - i)
    return arr
size = int(input("Enter the size of the array: "))
print(create_reverse_array(size))
