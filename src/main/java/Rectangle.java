public class Rectangle{
////*wi;return are;a

  private int length;
  private int width;

  public Rectangle (int inputLength, int inputWidth) { // inputs now assigned to properties
        this.length = inputLength;
        this.width = inputWidth;
    }

     public int calculateArea(){
       int area = this.length * this.width;
       return area;
    }

    public boolean checkSquare(){
      return this.length == this.width;
    }

}
