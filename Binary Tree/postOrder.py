# left right node 

class Node :
    def __init__(self,key):
        self.value = key 
        self.left  = None 
        self.right = None 


def postOrderTraversal(root) :
    if root != None :
        postOrderTraversal(root.left)
        postOrderTraversal(root.right)
        print(root.value)


if __name__ == '__main__' :
    root = Node(10) 
    root.left = Node(20)
    root.right = Node(30)
    root.right.left = Node(40)
    root.right.right = Node(50)

    postOrderTraversal(root)
        