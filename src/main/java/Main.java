import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
       // görev 1
//        Circle circle = new Circle(3.75);
//
//        System.out.println("circle.radius= " + circle.getRadius());
//
//        System.out.println("circle.area= " + circle.getArea());
//
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//
//        System.out.println("cylinder.area= " + cylinder.getArea());
//
//        System.out.println("cylinder.volume= " + cylinder.getVolume());


        // görev 2

//        Rectangle rectangle = new Rectangle(5, 10);
//
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//
//        System.out.println("rectangle.length= " + rectangle.getLength());
//
//        System.out.println("rectangle.area= " + rectangle.getArea());
//
//        Cuboid cuboid = new Cuboid(5,10,5);
//
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//
//        System.out.println("cuboid.length= " + cuboid.getLength());
//
//        System.out.println("cuboid.area= " + cuboid.getArea());
//
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//
//        System.out.println("cuboid.volume= " + cuboid.getVolume());

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1, "ahmet", 1111);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(1, "ayşe", 1221);
        System.out.println(juniorDeveloper.toString());
        System.out.println(juniorDeveloper2.toString());

        juniorDeveloper.work();
        juniorDeveloper2.work();


        MidDeveloper midDeveloper = new MidDeveloper(1, "mehmet", 121212);
        System.out.println(midDeveloper.toString());
        midDeveloper.work();

        HRManager hrManager = new HRManager(1, "osman", 12000, new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[2]);

        hrManager.addEmployee(0, juniorDeveloper2);
        hrManager.addEmployee(1, juniorDeveloper);
        hrManager.addEmployee(0, midDeveloper);
        System.out.println(hrManager.toString());

    }

}