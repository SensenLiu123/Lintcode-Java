public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    
    public int length;
    public int width;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    
    
    public int getArea(){
        return length * width;
    }
}
