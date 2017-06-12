class Node(object):
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList(object):
    def __init__(self, head=None):
        self.head = head

    def append(self, new_node):
        """Add a node to the linked list."""
        current = self.head
        if self.head:
            while current.next:
                current = current.next
            current.next = new_node
        else:
            self.head = new_node

    def get_position(self, position):
        """Get a node from a position.

        Assume the first position is 1.
        Return None if position is not in the list.
        """
        iterator = 1
        current = self.head
        while current and position >= 1:
            if iterator == position:
                return current
            else:
                current = current.next
                iterator += 1
        return None

    def insert(self, new_node, position):
        """Insert a new node at the given position.

        Assume the first position is 1.
        Inserting at position 3 means between the 2nd and 3rd nodes.
        """
        prev = self.get_position(position - 1)
        if prev:
            new_node.next = prev.next
            prev.next = new_node

    def delete(self, value):
        """Delete the first node with a given value."""
        current = self.head
        if self.head:
            if current.value == value:
                if current.next:
                    self.head = current.next
            else:
                while current.next:
                    if current.next.value == value:
                        current.next = current.next.next
                        return
                    else:
                        current = current.next

# Test cases
# Set up some Nodes
n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)

# Start setting up a LinkedList
ll = LinkedList(n1)
ll.append(n2)
ll.append(n3)

# Test get_position
# Should print 3
print ll.head.next.next.value
# Should also print 3
print ll.get_position(3).value

# Test insert
ll.insert(n4,3)
# Should print 4 now
print ll.get_position(3).value

# Test delete
ll.delete(1)
# Should print 2 now
print ll.get_position(1).value
# Should print 4 now
print ll.get_position(2).value
# Should print 3 now
print ll.get_position(3).value
