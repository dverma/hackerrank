t = int(raw_input())
test_cases = []
for i in xrange(t):
    test_cases.append(raw_input())
for case in test_cases:
    deletions = 0
    case = case.upper()
    last = '0'
    for i in case:
        if i==last:
            deletions+=1
        last = i
    print deletions