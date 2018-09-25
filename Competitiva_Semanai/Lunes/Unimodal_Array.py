n = input()
array = list(map(int, input().split()))
if array.__len__() == 1:
    print("YES")
    exit(0)
i = 0
if array[i] < array[i + 1]:
    while i < array.__len__() - 1 and array[i] < array[i + 1]:
        i += 1
    if i == array.__len__() - 1:
        print("YES")
        exit(0)
if array[i] >= array[i + 1]:
    if i == array.__len__() - 2:
        print("YES")
        exit(0)
    else:
        if array[i] == array[i+1]: 
            while i < array.__len__() - 1 and array[i] == array[i + 1]:
                i += 1
            if i == array.__len__() - 1:
                print("YES")
                exit(0)
            elif array[i] > array[i+1]:
                while i < array.__len__() - 1 and array[i] > array[i + 1]:
                    i += 1
                if i == array.__len__() - 1:
                    print("YES")
                else:
                    print("NO")
            else:
                print("NO")
        else:
            if i == array.__len__() - 1:
                print("YES")
                exit(0)
            else:
                while i < array.__len__() - 1 and array[i] > array[i + 1]:
                    i += 1
                if i == array.__len__() - 1:
                    print("YES")
                else:
                    print("NO")

else:
    print("NO")
    exit(0)
    

