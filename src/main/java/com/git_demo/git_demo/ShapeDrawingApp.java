public class ShapeDrawingApp {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = new Shape[4];
        
        // Adding Circle and Rectangle objects to the array
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Rectangle();
        
        // Calling the draw method on each shape
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
