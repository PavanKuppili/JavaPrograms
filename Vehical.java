class Vehcal
{
 public String make;
 public String model;
 public void displayInfo( )
 {
    
 }
}
class Car extends Vehcal
{
    public void displayInfo(String make,String model,int doors)
 {
    System.out.println("make:"+make);
    System.out.println("model:"+model);
    System.out.println("doors:"+doors);
 }
}
class Vehical
{
public static void main(String args[])
{
    Car obj=new Car();
    obj.displayInfo("toyota","fortuerner",4);
}
}