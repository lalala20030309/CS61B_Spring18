public class star{
    public static void printstar(int n){
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i) {
                System.out.print('*');
                j ++;
            }
            System.out.println("\n");
            i++;
        }
    }
    public static void main(String[] args){
      star.printstar(5);  
    }
}
/* result:

$javac star.java$javac
$java -Xmx128M -Xms16M star
*

**

***

****

*****

*/