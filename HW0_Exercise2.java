public class getnum {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int l = m.length;
        int i = 0;
        int temp = 0;
        while (i < l) {
          if (m[i] > temp){
              temp = m [i];
          }  
          
          i++;
        }
        return temp;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};    
       System.out.println(getnum.max(numbers));
    }
}