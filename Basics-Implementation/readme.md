##### This repo contains the algorithms i have learnt during my interview preparation.

> <b> <i> <span style="color:rgba(10,200,0,0.5)"> HashSet Implementation</span> <i></b>

[problem statement](https://leetcode.com/problems/design-hashset/)

<details>
<summary>Implementation</summary>

```java
class MyHashSet {
    private int  buckets;
    private int  bucketSize;
    private boolean [][] myHashSet;
    public MyHashSet() {
        myHashSet=new boolean[1000][];
        buckets=1000;
        bucketSize=1000;
    }
    public int getBucket(int key){
        return key%buckets;
    }
      public int getIndex(int key){
        return key/buckets;
    }
    public void add(int key) {
        int currentKey=getBucket(key);
        int currentIndex=getIndex(key);
        if(myHashSet[currentKey]==null){
            if(currentKey==0){
                 myHashSet[currentKey]=new boolean[bucketSize+1];
            }
            else{
 myHashSet[currentKey]=new boolean[bucketSize];
            }

        }
        myHashSet[currentKey][currentIndex]=true;
    }

    public void remove(int key) {
             int currentKey=getBucket(key);
        int currentIndex=getIndex(key);
        if(myHashSet[currentKey]==null){
            return;
        }
        myHashSet[currentKey][currentIndex]=false;
    }

    public boolean contains(int key) {
          int currentKey=getBucket(key);
        int currentIndex=getIndex(key);
         if(myHashSet[currentKey]==null){
            return false;
        }
        return myHashSet[currentKey][currentIndex];
    }
}
```

<span style="color:rgba(200,10,0,0.5)">TC:O(1)</span>
<span style="color:rgba(200,10,0,0.5)">SC:O(N)</span>

</details>

---

> <b> <i> <span style="color:rgba(10,200,0,0.5)"> MinStack</span> <i></b>

[problem statement](https://leetcode.com/problems/min-stack/)

<details>

<summary>
Intuition

</summary>

<span style="color:rgba(227, 172, 43,0.5)">Approach 1: </span>

**PUSH OPERATION:**
The main brute force approach is to implement this with two stacks.<br>
For the push operation we push the element on to stack 1<br>
And check the minimum value if it is larger than or equal<br>
then we update the minimum value to current value<br>
and push the minimum value on to stack 2.

**POP OPERATION:** <br>
when we pop an element on the stack 1 we also <br>
perform the same operation on Stack 2 as well.

<span style="color:rgba(227, 172, 43,0.5)">Approach 2: </span>

###### This is a better approach than before.

**Push Operation:**

```java
   public void push(int val) {
        if(min >=val){
            st.push(min);
            min=val;
        }
        st.push(val);
    }
```

**POP Operation:**

```java
   public void pop() {
        int current=st.pop();
        if(current==min){
                min=st.pop();
        }
    }
```

</details>

---

> <span style="color:rgba(10,200,0,0.5)"><i>Implement Queue using Stack </i></span>

[problem statement](https://leetcode.com/problems/implement-queue-using-stacks/)

<details>
<summary>
Intuition
</summary>

**HINT:** use two stacks to implement queue functionality.

<p><i> For the pop and Peek operation we need to transfer all the elements to outer stack from inner stack. And for pop and peek first we need to check if the outer stack is empty and if the inner stack has element pop all the elements in the inner stack and push them into the outer stack.
And just return the top element in outer stack for peek or pop the first element in the outer stack.</i> </p>

</details>

---

> <span style="color:rgba(10,200,0,0.5)"><i>Implement HashMap </i></span>

[problem statement](https://leetcode.com/problems/design-hashmap/)

<details>
<summary>
Intuition

</summary>

```java
   class Node{
        int key;
        int value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;

        }
    }
    Node[] nodes;
    int bucketSize;
    public MyHashMap() {
        bucketSize=1000;
        nodes=new Node[bucketSize];

    }
    /* Main Logic*/
    private Node find(Node node,int key){
        Node prev=node;
        Node curr=node.next;
        while(curr!=null && prev.next.key!=key){
            prev=curr;
            curr=curr.next;
        }
        return prev;
    }
    private int getHashCode(int key){
        return Integer.hashCode(key)%bucketSize;
    }
```

<span style="color:rgba(200,10,0,0.5)">TC:O(N)</span>
<span style="color:rgba(200,10,0,0.5)">SC:O(N)</span>

</details>

---
