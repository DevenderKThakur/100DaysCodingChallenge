arr = [10,15,20,40,8,11,55]

def merge(arr,start,mid,end):
    left = arr[start:mid+1]
    right = arr[mid+1:end+1]
    k = start
    i = j = 0 
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            arr[k] = left[i]
            i += 1 
            k += 1 
        else:
            arr[k] = right[j]
            j += 1 
            k += 1 
    while i < len(left):
        arr[k] = left[i]
        i += 1 
        k += 1 
    while i < len(right):
        arr[k] = right[j]
        j += 1 
        k += 1 


def mergeSort(arr,start,end):
    if end > start :
        mid = start + (end - start)//2 
        mergeSort(arr,start,mid)
        mergeSort(arr,mid+1,end)
        merge(arr,start,mid,end)

mergeSort(arr,0,6)
print(arr)
