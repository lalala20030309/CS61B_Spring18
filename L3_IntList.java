/*
System.out.println(L);
prints out the address of L. In order to print
L, use ToString method. 
*/

public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    
    public String toString(){
        return Integer.toString(first) +"," + rest;
    }
    
    /*public static int size(IntList L){
        int s = 1; 
        for (; L.rest != null; s++){
        L = L.rest;    
        }
        return s;
    }*/
    public static int size(IntList L){
        if (L.rest == null) {
            return 1;
        }
        return 1 + size(L.rest);
    }
    public  int size2(){
        if (this.rest == null) {
            return 1;
        }
        return 1 + this.rest.size2();
    }
    // get i th item in the IntList
    public static int get1(IntList L, int i){
       for (int j = 1; j <= i; j++){
           L = L.rest;
       }
       return L.first;
    }
    public int get2(int i){
        if (i == 0){
            return first;
        }
        return rest.get2(i-1);
    }
    /*public static void main(String[] args) {
        IntList L = new IntList(5,null);
        L.rest = new IntList(10,null);
        L.rest.rest = new IntList(15,null);*/
   
     //do it again mf incrList is not right come back later
    public static IntList dincrList(IntList L, int x){
        
        for (IntList p = L; p != null; p = p.rest) {
            p.first += x;
        }
       return L;  
    }
    
    public static IntList incrList(IntList L, int x){
    
    IntList Q = new IntList(0, null);
    for (; L != null; L = L.rest){
         Q.first = L.first + x;    
    }
    return Q;
    
    }
   
   public static void main(String[] args){
        IntList L = new IntList(15,null);
        L = new IntList(10,L);
        L = new IntList(5,L);
        L = new IntList(1,L);
        System.out.println(L);
        System.out.println(size(L));
        System.out.println(L.size2());
        System.out.println(get1(L,2));
        System.out.println(L.get2(2));
    }
}