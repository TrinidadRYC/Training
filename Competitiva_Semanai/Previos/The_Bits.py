n = int(input())
a = list(input())
b = list(input())

# -----SOLUCIÓN MATEMÁTICA-----
total_ceros = dobles = uno_cero = unos = 0
for i in range(n):
  if a[i] == '0' and b[i] == '0':
    dobles += 1
  if a[i] == '0':
    total_ceros += 1
  else:
    unos += 1
  if a[i] == '1' and b[i] == '0':
    uno_cero += 1

print(dobles*unos+(total_ceros-dobles)*uno_cero)

# -----SOLUCIÓN BRUTE FORCE-----
# counter = 0
# for i in range(0, n - 1):
#   for j in range(i + 1, n):
#     if(a[i] != a[j] and (b[i] == '0' or b[j] == '0')):
#       # print(a[i],a[j])
#       counter += 1
# print(counter)
# print("--- %f segundos ---" % (time.time() - initial_time))
