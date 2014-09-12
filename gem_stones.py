n = int(raw_input())
inp = []
rocks = []
for i in xrange(n):
    temp = []
    rock = raw_input()
    for rock_element in rock:
        temp.append(rock_element)
    elements = set(temp)
    rocks.append(elements)
gem_stones = rocks[0]
for i in xrange(1,n):
    gem_stones = gem_stones.intersection(rocks[i])
print len(gem_stones)
