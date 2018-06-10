public class star{
    public static void drawTriangle(int n){
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
      star.drawTriangle(10);  
    }
}
/* result:

$javac star.java$javac
$java -Xmx128M -Xms16M star

$javac star.java
$java -Xmx128M -Xms16M star
*

**

***

****

*****

******

*******

********

*********

**********

*/