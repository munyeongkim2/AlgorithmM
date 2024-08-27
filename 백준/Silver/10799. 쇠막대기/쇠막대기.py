ring = input()
stack = []
answer = 0
# stack.append(ring[0])
for i in range(len(ring)):
    if ring[i] == '(':  
        stack.append('(')

    else:
        if ring[i - 1] == '(':  
            stack.pop()
            answer += len(stack)

        else:
            stack.pop()
            answer += 1 

print(answer)