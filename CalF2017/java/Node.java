class Node {
  private final int value;
  private Node left = null;
  private Node right = null;

  public Node(int val) {
    this.value = val;
  }

  public Node right() {
    return this.right;
  }

  public Node left() {
    return this.left;
  }

  public void setRight(Node r) {
    this.right = r;
  }

  public void setLeft(Node l) {
    this.left = l;
  }

  public int value() {
    return this.value;
  }

  public int sumPaths() {
    if (this==null)return 0;
    return help(this,0);
    //throw new java.lang.UnsupportedOperationException("Not implemented yet.");
  }
  public int help(Node root, int cum){
    if (root==null)return 0;
    cum = cum+root.value;
    if (root.left==null && root.right==null)return cum;
    return help(root.left,cum)+help(root.right,cum);

  }
}
