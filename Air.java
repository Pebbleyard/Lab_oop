public class Air{
    private String brand;
    private int temperature;
    private boolean  airOnOff;
    private String color;
    private double radius;

    public Air(){
        this.brand = "Samsung";
        this.temperature = 0;
        this.radius = radius;
        this.airOnOff = true;
        this.color = "white";
    }

    public Air(String brand,int temperature,boolean airOnOff,double radius,String color) {
        this.brand = brand;
        this.temperature = temperature;
        this.airOnOff = airOnOff;
        this.radius = radius;
        this.color = color;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public boolean getIsOnOff() {
        return this.airOnOff;
    }

    public void setAirOnOff(boolean airOnOff){
        this.airOnOff = airOnOff;
    }

    public String getColor() {
        return color;
    }
      
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
      }
      
    public void setRadius(double radius) {
       this.radius = radius;
    }

    public String toString(){
        if(airOnOff){ // Checking Whether Air is on/of
          return "Brand: "+this.brand+"  /  color: " +this.color+"/ radius: "+this.radius+ "/ Temperature: "+ this.temperature+ "/air is on";
        }
        else{
          return "Brand: "+this.brand+"  /  color: "+this.color+"/ radius: "+this.radius+"/ Temperature: "+this.temperature+"/ air is off";
        }
        }


}