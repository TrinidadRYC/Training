n = int(input())
arreglo = list(map(int, input().split()))

if n % 2 == 0 or arreglo[0] % 2 == 0 or arreglo[-1] % 2 == 0:
    print("NO")
else:
    print("YES")
