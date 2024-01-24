# a tree node contains the data and the address of the left and right child of node 
class Node :
    def __init__(self,k):
        self.left = None
        self.right = None 
        self.key = k 


if __name__ == '__main__' :
    root = Node (10)
    root.left = Node(20)
    root.right = Node (30)
    root.left.left = Node (40)

print (root)
