package projects.shapes;


import java.util.Scanner;
import java.util.logging.Logger;

abstract class PROPERTIES
{
    abstract  void area();
    abstract  void perimeter();


    double peri;

    double area1;
    String p;
    Scanner input=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");

}