public class tester {
    public static void main(String[] args) {

        person p3 = new person("10/10/2007" , "engineering" , "nati.asfour2007@gmail.com" , "single" , 217172402 );
        person p4 = new person(p3);
        System.out.println(p3);
        System.out.println(p4);

        person p2 = new person (0546440626 , 170.0 , 82.5);
        System.out.println(p2);

        person p1 = new person ();
        System.out.println(p1);


        Car c1 = new Car();
        System.out.println(c1);

        Car c2 = new Car("BMW");
        System.out.println(c2);

        Car c3 = new Car(2020);
        Car c4 = new Car (c3);
        c3.setYear(2017);
        System.out.println(c3);
        System.out.println(c4);
    }
}
