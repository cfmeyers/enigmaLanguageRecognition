

from random import randint

ABC = 'abcdefghijklmnopqrstuvwxyz'
for i in xrange(900):
    gibberish = "\""
    for x in xrange(73):
        gibberish += ABC[randint(0,25)]
    gibberish += "\","
    print gibberish
