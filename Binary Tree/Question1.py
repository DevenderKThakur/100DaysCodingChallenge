# find the height of the tree 

class Node :
    def __init__(self,key) :
        self.value = key
        self.left = None
        self.right = None

def heightofTree(root) :
    if root == None:
        return 0 
    else :
        left = heightofTree(root.left)
        right = heightofTree(root.right)
        return max(left,right) + 1 


if __name__ == '__main__' :
    root = Node(10) 
    root.left = Node(20)
    root.right = Node(30)
    root.right.left = Node(40)
    root.right.right = Node(50)

    print(heightofTree(root))


# time O(n) and space O(h)
        