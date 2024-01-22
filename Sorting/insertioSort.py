def insertionSort(arr):
    for row in range (1,len(arr)):
        elememt = arr[row]
        col = row -1 
        while col >= 0 and elememt < arr[col] :
            arr[col + 1 ] = arr[col]
            col -= 1 
        arr[col + 1 ] = elememt


arr = [12,3,4,52,6,1]
insertionSort(arr)
print(arr)
 