#! python
# Given an array nums, write a function to move all 0's to the end of it
# while maintaining the relative order of the non-zero elements.

"""
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
should be [1, 3, 12, 0, 0].
"""

def shuffleZeros(aList):
    for item in aList:
        if item is 0:
            item = float('inf')

    aList.sort()

    for item in aList:
        if item is float('inf'):
            item = 0
    return aList

nums = [0, 1, 0, 3, 12]
newList = shuffleZeros(nums)
print(newList)
