import random
f = open('binaryNumbers.txt', 'w')
s = ''
for i in xrange(1000000-2):
    s = str(random.randint(0,1))
    f.write(s)

f.close()
print "Complete"