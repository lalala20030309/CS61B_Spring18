class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
        public String toString(){
            return Integer.toString(item) + ',' + next;
        }
    }
public class SLList {
    
    private IntNode first;
    public SLList(int x) {
        first = new IntNode(x, null);
    }
    
    public static void main(String[] args){
        SLList L = new  SLList(10);
        System.out.println(L.first);
        System.out.println(L.addFirst(5));
        System.out.println(L.getFirst());
        L.addLast(15);
        System.out.println(L);
        // why print out the address? think
        System.out.println(L.first);
        // why prints out 5,10,15,null? 
        System.out.println(L.size());
    }
    /** Adds an item to the front of the list. */
    public IntNode addFirst(int x) {
        first = new IntNode(x, first);
        return first;
    }
    
    public int getFirst() {
        return first.item;
    }
    /*study again ! */
    public void addLast(int x) {
        IntNode p = first;
        while (p.next != null){
            p = p.next;
        }
        p.next =  new IntNode(x,null);
    }
   public int size(){
        int i = 1;
        IntNode p = first;
        while(p.next != null){
            p = p.next;
            i++;
        }
        
        return i;
        
    }
}

/* result:
$javac SLList.java
$java -Xmx128M -Xms16M SLList
10,null
5,10,null
5
SLList@2a139a55
5,10,15,null
3
*/