import time

initial_time = time.time()
numeros = list(map(int, input().split()))
numero_pares = ((numeros[1] - 1)/2 if numeros[1] % 2 != 0 else numeros[1]/2)
# print(numero_pares)
juguetes = numeros[0]
presupuesto = numeros[1]

if presupuesto >= 2*juguetes:
   print(0)
elif presupuesto < juguetes:
  print(int(numero_pares) if presupuesto % 2 != 0 else int(numero_pares - 1))
elif presupuesto == juguetes:
  print(int(juguetes - numero_pares - 1))
else:
  print(int(juguetes - numero_pares))
 
# print(pares.__len__())
# print("--- %f seconds ---" % (time.time() - initial_time))
