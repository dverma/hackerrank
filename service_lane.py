line1 = raw_input()
width = raw_input()
nt = line1.split()
n = int(nt[0])
t = int(nt[1])

width_arr = []
result = []

for i in width.split():
    width_arr.append(int(i))

for case in xrange(t):
    inp = raw_input()
    ij = inp.split()
    i = int(ij[0])
    j = int(ij[1])
    result.append(min(width_arr[i:j+1]))

for c in result:
    print c
