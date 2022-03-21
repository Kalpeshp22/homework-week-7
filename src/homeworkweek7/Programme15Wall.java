package homeworkweek7;

/*
Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters width and height of type double and it needs to
initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
height parameter is less than 0 it needs to set the height field value to 0.
 */
public class Programme15Wall {
    double width, height;

    public Programme15Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
            return;
        }
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.width = width;
        this.height = height;
    }

    // getWidth
    public double getWidth() {
        return this.width;
    }
    // getHeight
    public double getHeight() {
        return this.height;
    }
    // setWidth
    public void setWidth(double updatedWidth) {
        if (updatedWidth < 0){
            this.width = 0;
        }
        this.width = updatedWidth;
        return;
    }
    // setHeight
    public void setHeight(double updatedHeight) {
        if (updatedHeight < 0){
            this.height = 0;
            return;
        }
        this.height = updatedHeight;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public static void main(String[] args) {
        Programme15Wall wall = new Programme15Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }
}
