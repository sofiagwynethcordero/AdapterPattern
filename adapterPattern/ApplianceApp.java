package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        PowerOutlet lapTop = new LaptopAdapter (laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refriGerator = new RefrigeratorAdapter (refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartPhoneCharger = new SmartPhoneAdapter (smartphoneCharger);

        System.out.println();
        System.out.println(lapTop.plugIn());
        System.out.println(refriGerator.plugIn());
        System.out.println(smartPhoneCharger.plugIn());
    }
}
