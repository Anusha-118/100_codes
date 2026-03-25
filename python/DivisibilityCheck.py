def is_divisible_by_3_and_5(num):
    if num % 3 == 0 and num % 5 == 0:
        return True
    else:
        return False
    
n=int(input("Enter a number: "))
result = is_divisible_by_3_and_5(n)
if(result):
    print(f"{n} is divisible by both 3 and 5.")
else:
    print(f"{n} is not divisible by both 3 and 5.")
