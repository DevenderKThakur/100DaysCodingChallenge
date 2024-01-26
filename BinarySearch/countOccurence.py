# count the occurence of the element in the array 

arr = [1,3,5,5,5,5,67,123,125]
target = 5

def first_occurence (arr,target) :
    start = 0
    end = len (arr) - 1 
    while start <= end :
        mid = start + (end - start)//2 
        if arr[mid] < target :
            start = mid +1 
        elif arr[mid] > target :
            end = mid - 1 
        else :
            if mid == 0 or arr[mid] != arr[mid-1] :
                return mid 
            else :
                end = mid - 1 
    return -1 



def last_occurence (arr,target) :
    start = 0
    end = len (arr) - 1 
    while start <= end :
        mid = start + (end - start)//2 
        if arr[mid] < target :
            start = mid +1 
        elif arr[mid] > target :
            end = mid - 1 
        else :
            if mid == len(arr) -1  or arr[mid] != arr[mid + 1] :
                return mid 
            else :
                start = mid + 1 
    return -1 


def count_occurence(arr,target):
    first = first_occurence(arr,target)
    last = last_occurence(arr,target)
    if first == -1 :
        return -1
    else:
        return abs(first - last) + 1 
    
print(count_occurence(arr,target))