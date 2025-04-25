interface Drawable { // Interface
    void draw();
}class Circle implements Drawable { // Circle class
    public void draw() {
        System.out.println("Drawing a Circle:");
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
    }
}class Rectangle implements Drawable { // Rectangle class
    public void draw() {
        System.out.println("Drawing a Rectangle:");
        System.out.println("************");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("************");
    }
}class Triangle implements Drawable { // Triangle class
    public void draw() {
        System.out.println("Drawing a Triangle:");
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" ******* ");
    }
}public class ShapeDrawer { // Main class
    public static void main(String[] args) {
        Drawable c = new Circle();
        Drawable r = new Rectangle();
        Drawable t = new Triangle();
        c.draw(); System.out.println();
        r.draw(); System.out.println();
        t.draw();
    }
}
