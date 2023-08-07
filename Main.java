public class Main {
    public static void main(String[] args) {

        // objectA
        Home home = new Home("Mansion", "Michurina 24");
        Mum mum = new Mum("Naima", 47, home, HobbiesEnum.SKIING);

        System.out.println(mum.getInfo());
        mum.saySomething();
        mum.saySomething("I'm going to go to Karakol to go skiing");

        System.out.println("\n------------");

        Home home2 = new Home("Apartment", "Rome");

        // objectB
        Daughter daughter1 = new Daughter("Alisha", 11, home, HobbiesEnum.DRAWING);

        System.out.println(daughter1.getInfo());


        System.out.println("\n------------");


        // objectC
        Daughter daughter2 = new Daughter("Faina", 24, home2, HobbiesEnum.TRAVELLING);

        System.out.println(daughter2.getInfo());
    }
}