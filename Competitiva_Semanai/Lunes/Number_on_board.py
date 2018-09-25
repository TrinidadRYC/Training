k = int(input())
n = int(input())
digits_n = list(map(int, str(n)))
counter = 0
digits_n = sorted(digits_n)
suma = sum(digits_n)

if k <= suma:
    print(0)
else:
    i = 0
    while i < digits_n.__len__():
        if digits_n[i] != 9:
            counter += 1
            suma += 9 - digits_n[i]
            i += 1
        if suma >= k:
            break
    print(counter)
