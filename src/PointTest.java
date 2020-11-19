public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(3, 4);
        System.out.println(p2);
        Point3D p3 = new Point3D();
        System.out.println(p3);
        Point3D p4 = new Point3D(6, 10, 3);
        System.out.println(p4);
        p4.setZ(20);
        System.out.println(p4);
    }
}
