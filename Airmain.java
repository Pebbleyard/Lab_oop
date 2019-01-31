public class Airmain{
    public static void main(String[] args) {
            Air air1 = new Air(); //Creating Air obje
            air1.setTemperature(25);
            air1.setColor("Yellow");
            air1.setAirOnOff(true);
            System.out.println("air1 info: "+air1.toString());

            Air air2 = new Air("Toshiba",25,true, 20.5, "Green" ); //Creating Air object2
            System.out.println("air2 info before change:==> "+air2.toString());
            
            air2.setTemperature(22);
            air2.setRadius(5);
            air2.setColor("Blue");
            air2.setAirOnOff(true);

            if(air1.getIsOnOff() == true)
            {
                air2.setAirOnOff(false);
            }
            System.out.println("air2 info: "+air2.toString());
        }
}