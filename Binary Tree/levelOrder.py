# print the node of the tree in the level format 
from collections import deque
class Node :
    def __init__(self,key):
        self.value = key 
        self.left = None 
        self.right = None  

def level_order(root):
    if root == None :
        return 
    q = deque()
    q.append(root)
    while len(q) > 0 :
        node = q.popleft()
        print(node.value,end=" ")
        if node.left is not None :
            q.append(node.left)
        if node.right is not None :
            q.append(node.right)


if  __name__ == '__main__' :
    root = Node(10)
    root.left = Node (20)
    root.right = Node (30)
    root.left.left = Node(40)
    root.left.right = Node(50)
    root.left.left.left = Node(70)
    root.left.left.right = Node(80)
    root.right.left = Node(60)

    # print(height_of_tree(root))
    print(level_order(root))
    