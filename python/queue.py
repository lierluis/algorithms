class Queue:
    def __init__(self, head=None):
        self.storage = [head]

    def enqueue(self, new_node):
        """Add node to the tail of the queue."""
        self.storage.append(new_node)

    def peek(self):
        """View node at the head of the queue."""
        return self.storage[0]

    def dequeue(self):
        """Remove node from the head of the queue."""
        return self.storage.pop(0)

if __name__ == "__main__":
    # Tests
    q = Queue(1)
    q.enqueue(2)
    q.enqueue(3)

    # Test peek
    print(q.peek()) # 1

    # Test dequeue
    print(q.dequeue()) # 1

    # Test enqueue
    q.enqueue(4)
    print(q.dequeue()) # 2
    print(q.dequeue()) # 3
    print(q.dequeue()) # 4
    q.enqueue(5)
    print(q.peek()) # 5
