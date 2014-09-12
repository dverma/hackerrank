line1 = raw_input()
msg = raw_input()
nk = line1.split()
n = int(nk[0])
k = int(nk[1])

testMatrix = [['' for x in xrange(len(msg))] for x in xrange(k+1)]

for ind,c in enumerate(msg):
    testMatrix[0][ind] = int(c)

for i in xrange(k-1):
    for j in xrange(k-1-i):
        testMatrix[i+1][j] = 0
        
for i in xrange(len(msg)):
    for j in xrange(1,k+1):
        if testMatrix[j][i] == '':
            if j+1<k and i-1>0:
                testMatrix[j][i] = testMatrix[j+1][i-1]
            else:
                temp = testMatrix[0][i]
                for x in xrange(1,j):
                    temp = temp^testMatrix[x][i]
                testMatrix[j][i] = temp
                if i<len(msg)-1:
                    testMatrix[j-1][i+1] = temp
actualStr = ''
for i in xrange(n):
    actualStr += str(testMatrix[k][i])

print actualStr