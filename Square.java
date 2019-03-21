
class Square extends Polygon {
    private double w,l;
    public Square(double l, double w){
        super(4);
        this.l = l;
        this.w = w;
    }
    public void calArea(){
        area = w*l;
    }
}