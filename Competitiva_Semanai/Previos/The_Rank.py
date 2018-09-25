numero_estudiantes = int(input())
estudiantes = {}
for i in range(1, numero_estudiantes + 1):
  estudiantes[i] = sum(list(map(int, input().split())))
print(sorted(estudiantes.values(), reverse=True).index(estudiantes.get(1)) + 1)
