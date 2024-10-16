import org.omg.PortableServer.POA;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point2D p3d = new Point3D(3.43F,2.35F,23.2F);
        ((Point3D) p3d).getXYZ();
        System.out.println(p3d);
    }
}