crib = raw_input()
word = raw_input()
noIter = 0
counter = 0
if crib.__len__() == word.__len__():
  noIter = 1
else:
  noIter = crib.__len__() - word.__len__()

for i in range(0, noIter):
  for j in range(0, word.__len__()):
    if word[j] == crib[i + j]:
      break
    elif j == word.__len__() - 1 and word[j] != crib[i + j]:
      counter+=1
print(counter)