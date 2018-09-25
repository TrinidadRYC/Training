import time

initial_time = time.time()
inters_lamps = list(map(int, input().split()))
encendidas = list(map(int, input().split()))
del encendidas[0]
interruptores = [list(map(int, input().split())) for i in range(inters_lamps[0])]
estado_inicial = [True if i in encendidas else False for i in range(1, inters_lamps[1] + 1)]
lamparas = estado_inicial[:]
contador = 0
reiniciar = True
for i in interruptores:
  del i[0]
while reiniciar:
  for i in interruptores:
    if interruptores.index(i) == 0 and contador != 0 and estado_inicial == lamparas: 
      print(-1)
      reiniciar = False
      break
    elif all(not l for l in lamparas):
      print(contador)
      reiniciar = False
      break
    else:
      contador += 1
      lamparas = [not lamparas[j - 1] if j in i else lamparas[j - 1] for j in range(1, lamparas.__len__() + 1)]
print("--- %f seconds ---" % (time.time() - initial_time))
