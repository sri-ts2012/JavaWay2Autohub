package Polymorphismex;

public class overloadmaindemo {
 
    /**
     * Standard main method, JVM will only call this method
     * even if you provided multiple overloaded version.
     * 
     */
    public static void main(String[] args) {
        System.out.println("Inside main(String[] args) method ....");
        //main(new int[]);
       main(new Integer[]{1, 2, 3});
       main(10);
    }    
    /**
     * An overloaded main method which accepts Integer[] instead of
     * String[] as argument. 
     * @param args
     */
    public static void main(Integer[] args){
        System.out.println("Inside main(Integer[] args) method ....");
       
    }
    
    public static void main(int args){
        System.out.println("Inside main(int) ....");
       
    }
    /**
     * Another overloaded main method which accepts Double[] instead of
     * String[] as argument. 
     * @param args
     */
    public static void main(Double[] args){
        System.out.println("Inside main(Double[] args) method ....");
    }
 
}
 
/*Output
Inside main(String[] args) method ....
Inside main(Integer[] args) method ....

*/
