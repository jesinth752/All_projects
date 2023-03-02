package projects.coordinates;

class Points implements Cloneable{
    int x1;
    int y1;


    Points(int x1 ,int y1)
    {
        this.x1=x1;
        this.y1=y1;

    }
    boolean checkequals(int x2,int y2)
    {

        return x1 == x2 && y1 == y2;

    }

    public Object clone() throws  CloneNotSupportedException
    {
        return  super.clone();
    }
}