package projects.shapes;


class Rectangle extends PROPERTIES
{

    int l;
    int w;


    Rectangle()
    {
        LOGGER.info("Enter length:");
        l=input.nextInt();
        LOGGER.info("Enter width:");
        w=input.nextInt();
    }

    public void area() {
        area1=(l*w);
        p="Area of the rectangle :"+(int)area1;
        LOGGER.info(p);

    }


    public void perimeter() {
        peri=(2*(l*w));
        p="Perimeter of the rectangle :"+(int)peri;
        LOGGER.info(p);
    }
}
