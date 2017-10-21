class Node(object):
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList(object):
    def __init__(self, head=None):
        self.head = head

    def insert_first(self, new_node):
        "Insert new node as the head of the LinkedList"
        new_node.next = self.head
        self.head = new_node

    def delete_first(self):
        "Delete the first (head) node in the LinkedList and return it"
        deleted = self.head
        if self.head:
            self.head = self.head.next
            deleted.next = None
        return deleted


class Stack(object):
    def __init__(self, top=None):
        self.ll = LinkedList(top)

    def push(self, new_node):
        "Push (add) a new node onto the top of the stack"
        self.ll.insert_first(new_node)

    def pop(self):
        "Pop (remove) the first node off the top of the stack and return it"
        return self.ll.delete_first()


# Test cases
n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)

# Start setting up a Stack
stack = Stack(n1)

# Test stack functionality
stack.push(n2)
stack.push(n3)
print(stack.pop().value)
print(stack.pop().value)
print(stack.pop().value)
print(stack.pop())
stack.push(n4)
print(stack.pop().value)
