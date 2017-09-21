#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

struct node {
  int value;
  struct node* left;
  struct node* right;
};

int sumPaths(struct node* n) {
  // IMPLEMENT ME
  return 0;
}

void testSanity() {
  struct node* n1 = (struct node*)malloc(sizeof(struct node));
  n1->value = 1;
  assert(sumPaths(n1) == 1);
}

int main() {
  testSanity();
  // Write some more test cases
  return 0;
}
