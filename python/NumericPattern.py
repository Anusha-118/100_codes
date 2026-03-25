def NP(n):
    for i in range(n, 0, -1):
        for j in range(i):
            print(j, end=" ")
        print()

n=int(input("Enter the number: "))
NP(n)  