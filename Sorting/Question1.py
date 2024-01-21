# merge two array in sorted form 

def merge(arr1,arr2):
    result = []
    i = 0 
    j = 0 
    while i < len(arr1) and j < len(arr2) :
        if arr1[i] < arr2[j] :
            result.append(arr1[i])
            i += 1 
        else :
            result.append(arr2[j])
            j += 1 
    while i < len(arr1):
        result.append(arr1[i])
        i += 1 
    while j < len(arr2):
        result.append(arr2[j])
        j += 1 
    return result 

arr1 = [10,15]
arr2 = [5,6,6,30,40]
result = merge(arr1,arr2)
print(result)