public class Rectangle {
    public Double Length,Width,Area,Perimeter;

    public Rectangle(Double Length,Double Width )
    {
this.Length=Length;
this.Width=Width;
    }
    public Double getLength()
    {
        return this.Length;
    }
    public Double getWidth()
    {return this.Width;}
    public Double getArea()

    {
        return Area=Length*Width;
    }
    public Double getPerimeter()
    {return Perimeter=2*(Length+Width);}

    @Override
    public String toString() {
        return "Rectangle{" +
                "Length=" + Length +
                ", Width=" + Width +
                ", Area=" + Area +
                ", Perimeter=" + Perimeter +
                '}';
    }
}
