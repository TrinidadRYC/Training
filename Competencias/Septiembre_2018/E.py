import time

initial_time = time.time()
crib = input()
word = input()
noIter = (1 if crib.__len__() == word.__len__() else crib.__len__() - word.__len__())
counter = 0

for i in range(noIter):
  if all(j  != crib[i + word.index(j)] for j in word):
    counter+=1
print(counter)
print("--- %f seconds ---" % (time.time() - initial_time))
