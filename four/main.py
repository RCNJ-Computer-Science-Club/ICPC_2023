def financialManagement():
  totalBalance = 0
  for months in range(0,12):
    balance = float(input("Closing balance for this month: "))
    totalBalance = totalBalance + balance
  return round((totalBalance / 12), 2) 
