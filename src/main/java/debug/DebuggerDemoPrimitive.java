package debug;/*

step over - move to the next line of break point
step into - if there is a method call, get into that method
step out - return to the caller
resume - keep executing the program until it hits a break point
 */


public class DebuggerDemoPrimitive {
    public static void main(String[] args) {
        int integer1 = 7;
        int integer2 = 8;
        int sum = add(integer1, integer2);

        System.out.println("The sum is " + sum);
    }

    public static int add(int i1, int i2) {
        return i1+i2;
    }
}
