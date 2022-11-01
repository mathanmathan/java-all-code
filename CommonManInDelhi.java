package india.newDelhi;

class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules{

public static void main(String[] args){

TrafficRulesDelhi driver = new CommonManInDelhi();
TrafficRules driver1 = new CommonManInDelhi();
driver.dontGoByDieselVehicle();
driver1.goByDieselVehicle();
driver1.goByBicycle();

}
public void dontGoByDieselVehicle(){
    System.out.println("Delhi commissioner asked don't use Diesel Vehicle");
}
public void goByDieselVehicle(){
    System.out.println("chennai commissioner asked  use Diesel Vehicle");
}
public void goByBicycle(){
    System.out.println("chennai commissioner asked  use Bicycle");
}
}
