#! python
# Given an array nums, write a function to move all 0's to the end of it
# while maintaining the relative order of the non-zero elements.

"""
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
should be [1, 3, 12, 0, 0].
"""

def moveZeros(aList):
    max = 0
    countZeros = 0
    length = len(aList)

    for i in range(length):
        if aList[i] == 0:
            countZeros += countZeros
        if max < aList[i]:
            temp = max
            max = aList[i]
            aList[i] = temp
            print(aList)

    for i in range(countZeros):
        del aList[i]
    zeroList = [0] * countZeros
    return aList + zeroList

nums = [0, 1, 0, 3, 12]
newList = moveZeros(nums)
#print(newList)
