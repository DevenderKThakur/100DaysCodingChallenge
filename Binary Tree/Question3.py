# find the total  number of node in the tree 

class Node :
    def __init__(self,key):
        self.value = key 
        self.left = None 
        self.right = None 


def totalNumberOfNode(root):
    if root == None:
        return 0 
    else:
        left = totalNumberOfNode(root.left)
        right = totalNumberOfNode(root.right)
        return left + right + 1


if __name__ == '__main__':
    root = Node(1)
    root.left = Node(2)
    root.right = Node (3)
    root.left.left = Node(4)
    root.left.right = Node(5)

    print(totalNumberOfNode(root))
        