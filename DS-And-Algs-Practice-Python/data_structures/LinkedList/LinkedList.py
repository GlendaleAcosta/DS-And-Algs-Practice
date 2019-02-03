# I didn't finish but I pretty much know Linked Lists very well

class LinkedList:
    def __init__(self):
        self.head = None

    def size(self):
        curr = self.head
        size = 0
        while curr is not None:
            size += 1
            curr = curr.next
        print("size", size)
        return size

    def empty(self):
        isEmpty = self.head is None
        print("empty", isEmpty)

    def value_at(self, index):
        if index + 1 > self.size():
            print("error: index is too high")
        else:
            curr = self.head
            i = 0
            while curr.next is not None and i is not index:
                i += 1
                curr = curr.next
            print('value_at', curr.val)

    def push_front(self, val):
        newNode = Node(val)
        if self.head is None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head = newNode

    def pop_front(self):
        if self.head is None:
            print("Linked List is empty")
        else:
            node = self.head
            self.head = self.head.next
            print('pop_front', node.val)
            return node

    def push_back(self, val):
        newNode = Node(val)
        if self.head is None:
            self.head = newNode
        else:
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = newNode


    def printList(self):
        curr = self.head
        while curr is not None:
            print(curr.val)
            curr = curr.next

    def pop_back(self):
        if self.head is None:
            print("LinkedList is empty")
        elif self.head.next is None:
            node = self.head
            self.head = None
            print('pop_back', node.val)
            return node
        else:
            curr = self.head
            prev = None
            while curr.next is not None:
                prev = curr
                curr = curr.next
            prev.next = None
            print('pop_back', curr.val)
            return curr

    def front(self):
        if self.head is None:
            print("Linked List is empty")
        else:
            print('front', self.head.val)
        return self.head

    def back(self):
        curr = self.head
        if curr is None:
            print('Linked List is empty')
        else:
            while curr.next is not None:
                curr = curr.next
            print('back', curr.val)
            return curr

class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


ll = LinkedList()
ll.empty()
ll.push_back(1)
ll.push_back(2)
ll.push_back(3)
ll.push_back(4)
ll.push_back(5)
ll.printList()
ll.size()
ll.empty()
ll.value_at(3)
ll.push_front(0)
ll.printList()
ll.pop_front()
ll.printList()
ll.pop_back()
ll.printList()
ll.front()
ll.back()
