# insert the element in the binary search tree 

class Node :
    def __init__(self,key):
        self.value = key 
        self.left = None 
        self.right = None 

def insert_value_in_tree(root,val):
    if root == None :
        return Node(val)
    elif root.value == val:
        return root
    elif root.value > val :
        root.left = insert_value_in_tree(root.left , val)
    else:
        root.right = insert_value_in_tree(root.right , val )
    return root

if __name__ == '__main__' :
    
    root = None 
    root = insert_value_in_tree(root,10)
    root = insert_value_in_tree(root,20)
    root = insert_value_in_tree(root,5)

    print(root.left.value)