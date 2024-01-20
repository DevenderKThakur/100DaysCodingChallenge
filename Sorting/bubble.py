def bubbleSort(arr):
    for row in range (len(arr)-1):
        swap = False 
        for col in range (0,len(arr)-row-1):
            if arr[col] > arr[col+1]:
                swap = True
                arr[col] , arr[col+1] = arr[col+1] , arr[col]
        if swap == False:
            return 


arr = [12,3,4,52,6,1]
bubbleSort(arr)
print(arr)

