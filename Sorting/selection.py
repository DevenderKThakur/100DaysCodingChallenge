def selectionSort(arr):
    for row in range (len(arr) - 1 ):
        minimun_index = row 
        for col in range (row+1,len(arr)):
            if arr[col] < arr[minimun_index]:
                minimun_index = col
        arr[minimun_index] , arr[row] = arr[row] , arr[minimun_index]


arr = [12,3,4,52,6,1]
selectionSort(arr)
print(arr)


# time complexity O(n^2) , unstable 