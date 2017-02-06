/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author jaime
 */
public class MyRectangle {
    //Declaration of Atributes
    private MyPoint topLeft; 
    private MyPoint bottomRight;
    //Initialize Atributes
    public MyRectangle(int x1, int y1, int x2, int y2){ 
        topLeft = new MyPoint(x1,y1); 
        bottomRight = new MyPoint(x2,y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){ 
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    @Override 
    public String toString(){ //return String
        return "MyRectangle[ topleft = " + this.topLeft + ",bottomRight = " + this.bottomRight + "]";
    }
    public double getArea(){ 
        return (this.topLeft.getX()-this.bottomRight.getX())*(this.topLeft.getY()-this.bottomRight.getY());
    }
    public double getPerimeter(){ 
        return (this.topLeft.getX()-this.bottomRight.getX())+(this.topLeft.getY()-this.bottomRight.getY())*2;
}
}
