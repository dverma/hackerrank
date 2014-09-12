i = raw_input()
k = int(raw_input())
store = []
for foo in range((k)-1):
    store.append( int(i,2) << foo+1 )
result = int(i,2)
for bar in store:
    print bin(result),result, bin(bar), bar
    result = result^bar
    print bin(result), result
    
print bin(result), result

c = result >> k-1
print bin(c), c