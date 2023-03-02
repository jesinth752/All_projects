package projects.shapes;

import java.util.logging.Logger;

public class Shapes {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void runapp() {
        LOGGER.info("Triangle");
        Triangle t1=new Triangle();
        t1.perimeter();
        t1.area();
        LOGGER.info("Rectangle");
        Rectangle r1=new Rectangle();
        r1.perimeter();
        r1.area();
        LOGGER.info("circle");
        Circle c1=new Circle();
        c1.perimeter();
        c1.area();


    }
}