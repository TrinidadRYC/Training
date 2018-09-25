values = list(map(int, input().split()))
first_millis = 2 * values[3] + values[0] * values[1]
second_millis = 2 * values[4] + values[0] * values[2]
if first_millis < second_millis:
     print("First")
elif second_millis < first_millis:
     print("Second")
else:
    print("Friendship")
