/*
Jemma Tiongson
Class # 16031
Purpose: Program a formula that can find an area of a circle
 */

class AreaCircle{
    public static void main (String [] args){
        int r = 2;
        final double PI = 3.14159;
        double areaCircle = PI*Math.pow(r,2);
        int newNum = (int)areaCircle;
        System.out.println("The area of a circle with the radius of " +r+ " is " +newNum+ ".");
    }
}