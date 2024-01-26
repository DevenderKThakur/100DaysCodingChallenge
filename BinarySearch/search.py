# return the index of the target element

def search(arr,target):
    start = 0 
    end = len(arr) - 1
    while start <= end :
        mid = start + (end - start) // 2 
        if arr[mid] == target :
            return mid+1 
        if arr[mid] < target :
            start = mid + 1 
        else :
            end = mid - 1 
    return -1 


arr = [1,10,10,10,20,20,40]

target = 10

# print(search(arr,target))


# return the first occurence of the element in the array 
def first_occurence (arr, target) :
    start = 0 
    end = len(arr) - 1 
    mid = start + (end - start) // 2 
    while start <= end :
        if arr[mid] < target :
            start = mid + 1 
        elif arr[mid] > target :
            end = mid - 1  
        else :
            if mid == 0 or arr[mid] != arr[mid-1] :
                return mid 
            else :
                end = mid - 1 
    return -1 

print(first_occurence(arr,target))
# return the last ocuurence of the element in the array 


def last_occurence (arr,target) :
    start = 0 
    end = len(arr) - 1 
    mid = start + (end - start) // 2 
    while start <= end :
        if arr[mid] < target :
            start = mid + 1 
        elif arr[mid] > target :
            end = mid -1 
        else :
            if mid == len(arr) - 1 or arr[mid] != arr[mid + 1] :
                return mid 
            else :
                start = mid + 1 
    return -1 

# print(last_occurence(arr,target))

