class Node :
    def __init__(self,key) :
        self.val = key 
        self.left = None 
        self.right = None


def inorderTraversal(root):
    if root != None :
        inorderTraversal(root.left)
        print(root.val)
        inorderTraversal(root.right)

if __name__ == '__main__' : 
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)

    inorderTraversal(root)

