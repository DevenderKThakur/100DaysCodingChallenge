# search the target element in the binary tree 

class Node :
    def __init__(self,key):
        self.value = key 
        self.left = None 
        self.right = None 

# recursive way 
def search_in_tree(root,target): # time complexity of the soln is O(h) and space is O(h)
    if root is None :
        return False 
    elif root.value == target :
        return True 
    elif root.value > target :
        return search_in_tree(root.left,target)
    else:
        return search_in_tree(root.right,target)
    
# time O(h) and space is O(1)
def search_in_tree2(root,target):
    while root != None :
        if root.value == target:
            return True 
        elif root.value > target :
            root = root.left 
        else :
            root = root.right 
    return False


if __name__ == '__main__' :
    root = Node (40)
    root.left = Node(20)
    root.right = Node(80)
    root.left.left = Node(8)
    root.left.right = Node(30)
    root.right.left = Node(60)
    root.right.right = Node(100)
    root.right.right.right = Node(120)

    # print(search_in_tree(root,100))
    print(search_in_tree2(root,100))