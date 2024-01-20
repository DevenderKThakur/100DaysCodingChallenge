# l1 = [10,2,3,15,1]
# #  only used sort list 
# l1.sort() # .sort() uses tim sort method which is hybrid algorithm of merge and insertion sort 
# print(l1)

# #  sort anyhting that's iterable 
# l2 = [15,3,5,6,2]
# print(sorted(l2))

# l3 = [4,6,2,8,1]
# l3.sort(reverse=True)
# print(l3)

def myfunction(s):
    return len(s)

l = ["geeks","for","index"]

l.sort(key=myfunction , reverse=True)
print(l)