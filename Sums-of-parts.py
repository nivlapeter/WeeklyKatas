from collections import deque
def parts_sums(ls):
    # your code
    arr = []
    for i in deque(range(len(ls)+1)):
        arr.append(sum(ls[i:]))
    return arr