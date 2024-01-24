class Node :
    def __init__(self,key) :
        self.value = key
        self.left = None
        self.right = None

def printkDistance(root,k):
    if root == None :
        return 
    if k == 0 :
        print (root.value)
    else:
        printkDistance(root.left,k-1)
        printkDistance(root.right,k-1)



if __name__ == '__main__' :
    root = Node(10) 
    root.left = Node(20)
    root.right = Node(30)
    root.right.left = Node(40)
    root.right.right = Node(50)

    printkDistance(root,2)

    
