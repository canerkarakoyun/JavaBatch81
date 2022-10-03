package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=15000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka: "+car1.marka+"\nModel: "+ car1.model
        +"\nYil: "+car1.yil+"\nFiyat: "+car1.fiyat);

        Car car2=new Car();
        System.out.println("Car2 bilgileri\nMarka: "+car2.marka+"\nModel: "+ car2.model
                +"\nYil: "+car2.yil+"\nFiyat: "+car2.fiyat);

        /*
        Herhangi bir obje uzerinden bir veriable yazdirmaya calistigimizda
        Java degeri su siralama ile arar;

        1. Obje olusturulduktan sonra bir deger atandi mi?
        2. Objenin olusturuldugu class'da veriable'a bir deger atanmis mi?
        3. Objenin olusturuldugu class'da da bir deger atanmamissa
            data turune gore Java default deger atar.
         */
    }
}
