class SumPaths {
    public static void main(String[] args) {
      testSanity();
     // testNull();
      // Write some more test cases
      testTwoNode();
      testMoreNodes();
    }

    private static void testSanity() {
      Node root = new Node(1);

      int res = root.sumPaths();
      int expected = 1;

      if (res == expected) {
        System.out.println("Test one passed!");
      } else {
        System.out.println("Test one failed; expected " + expected + " but got " + res + " instead.");
      }
    }
    
    

    public static void testTwoNode(){
      Node root = new Node(1);
      Node left = new Node(4);
      Node right = new Node(1);
      root.setLeft(left);
      root.setRight(right);

      int res = root.sumPaths();
      int expected = 7;

      if (res == expected) {
        System.out.println("Test two passed!");
      } else {
        System.out.println("Test two failed; expected " + expected + " but got " + res + " instead.");
      }

    }
    private static void testMoreNodes() {
      Node root = new Node(1);
      Node l1_left = new Node(3);
      Node l1_right = new Node(5);
      Node l2_left = new Node(2);
      Node l2_right = new Node(4);
      root.setLeft(l1_left);
      root.setRight(l1_right);
      l1_left.setLeft(l2_left);
      l1_right.setRight(l2_right);
      int res = root.sumPaths();
      int expected = 16;

      if (res == expected) {
        System.out.println("Test one passed!");
      } else {
        System.out.println("Test one failed; expected " + expected + " but got " + res + " instead.");
      }
    }
}
