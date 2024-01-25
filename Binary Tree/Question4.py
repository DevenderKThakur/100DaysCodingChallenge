# find the maximum element in the binary tree  
import math 
class Node :
    def __init__(self,key) :
        self.value = key 
        self.left = None 
        self.right = None 

def maxElement(root): 
    if root == None :
        return -math.inf
    else:
        left = maxElement(root.left)
        right = maxElement(root.right)
        return max(left,right,root.value)
    
if __name__ == '__main__' :
    root = Node(10) 
    root.left = Node(20)
    root.right = Node(30)
    root.right.left = Node(40)
    root.right.right = Node(50)

    print(maxElement(root))