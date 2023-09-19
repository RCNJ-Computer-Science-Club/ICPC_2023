def milesDriven():
  x = 0
  while (x == 0): 
    pairs = int(input("How many pairs of data? "))
    if (pairs == -1):
      return
    mphTotal = []
    timeTotal = []
    distance = 0
    elapsedTime = 0
    
    for i in range(0, pairs):
      mph = int(input("What was the mph for the pairs (enter individually) "))
      mphTotal.append(mph)
      time = int(input("Enter time recorded at that speed (in hours) "))
      timeTotal.append(time)
    for i in range(0, pairs):
      if (timeTotal[i-1] > timeTotal[i]):
        elapsedTime = timeTotal[i] 
      else:
        elapsedTime = timeTotal[i] - timeTotal[i-1]
      distance = distance + (mphTotal[i] * elapsedTime)
    print(distance, "miles")

milesDriven()