import time
values = list(map(int, input().split()))
while values[0] >= 2*values[1] or values[1] >= 2*values[0]:
    if values[0] == 0 or values[1] == 0:
        break
    if values[0] >= 2*values[1]:
        values[0] %= 2*values[1]
    elif values[1] >= 2*values[0]:
        values[1] %= 2*values[0]    
print(values[0], values[1])