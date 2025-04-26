public class myTest {
    public static void main(String[] args){
        //helloWorld myWorld = new helloWorld();
        helloWorld.helloLoop();
    }
}
class helloWorld {
    public helloWorld() {
    }
 
    public static void main(String[] var0) {
       helloLoop();
    }
 
    public static void helloLoop() {
       char[] var0 = new char[]{'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
 
       for(int var1 = 0; var1 < var0.length; ++var1) {
          if (var0[var1] == 'W') {
             System.out.print(" " + var0[var1]);
          } else {
             System.out.print(var0[var1]);
          }
       }
 
    }
 }
 
