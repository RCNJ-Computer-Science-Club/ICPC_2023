def milesDriven():
  x = 0
  while (x == 0): # To allow continous inputs
    pairs = int(input("How many pairs of data? "))
    if (pairs == -1): # When -1 is input, to end the function
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
      if (timeTotal[i-1] > timeTotal[i]): # To fix an error where i-1 would backflow into last number in array
        elapsedTime = timeTotal[i] 
      else:
        elapsedTime = timeTotal[i] - timeTotal[i-1]
      distance = distance + (mphTotal[i] * elapsedTime) # Calculations for each distance / time pair
    print(distance, "miles")

milesDriven()
