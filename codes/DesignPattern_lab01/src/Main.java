import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<SmartPhone> arrSmart=new ArrayList<>();
        List<Laptop> arrLaptops=new ArrayList<>();
        List <Tablet> arrTablets=new ArrayList<>();

        //creating smartphone factory and smartphones
        DeviceFactory smartphoneFactory=new SmartphoneFactory();
        Device smartPhone=smartphoneFactory.createDevice("samsung","0191");
        Device smartPhone2=smartphoneFactory.createDevice("iphone16","0181");

        arrSmart.add((SmartPhone) smartPhone);
        arrSmart.add((SmartPhone) smartPhone2);

        for(SmartPhone e: arrSmart){
            System.out.println(e);
            e.powerON();
            e.call();
            e.powerOff();
        }
        System.out.println();

        //creating laptop factory and laptops
        DeviceFactory LaptopFactory=new LaptopFactory();
        Device laptop1= LaptopFactory.createDevice("lenovo","RTX-3050");
        Device laptop2= LaptopFactory.createDevice("Dell","RTX 1650");

        arrLaptops.add((Laptop) laptop1);
        arrLaptops.add((Laptop) laptop2);

        for(Laptop l:arrLaptops){
            System.out.println(l);
            l.powerON();
            l.code();
            l.powerOff();
        }

        System.out.println();

        //creating a tablet factory and tablets
        DeviceFactory tabletFactory=new TabletFactory();
        Device tablet1=tabletFactory.createDevice("Xiaomi",true);
        Device tablet2=tabletFactory.createDevice("Huwawei",false);

        arrTablets.add((Tablet) tablet1);
        arrTablets.add((Tablet) tablet2 );

        for(Tablet t: arrTablets){
            System.out.println(t);
            t.powerON();
            t.read();
            t.powerOff();
        }


    }
}
