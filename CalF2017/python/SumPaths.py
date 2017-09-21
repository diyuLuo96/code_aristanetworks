#!/usr/bin/env python

import unittest

class TestSumPaths(unittest.TestCase):

  def testSanity(self):
    n1 = Node(value=1)
    self.assertEqual(n1.sumPaths(), 1)

  # Write some more test cases

class Node:
  def __init__(self, value=0, left=None, right=None):
    self.left = left
    self.right = right
    self.value = value

  def sumPaths(self):
    # IMPLEMENT ME
    raise NotImplementedError

if __name__ == "__main__":
  unittest.main()
