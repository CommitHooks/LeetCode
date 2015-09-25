#! python
# Given an array nums, write a function to move all 0's to the end of it
# while maintaining the relative order of the non-zero elements.

"""
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
should be [1, 3, 12, 0, 0].
"""
def shuffleZeros(aList):
    length = len(aList)
    countZeros = 0
    for item in aList:
        if item is 0:
            countZeros = countZeros + 1

    aList.sort()

    countNums = length - countZeros
    for i in range(length):
        if i < countNums:
            aList[i] = aList[i+countZeros]
        else:
            aList[i] = 0
    return aList

nums = [0, 1, 0, 3, 12]
newList = shuffleZeros(nums)
print(newList)
