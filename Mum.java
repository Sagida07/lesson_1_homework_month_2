public class Mum extends Granny {

    public Mum() {
    }

    public Mum(String name, int age, Home home, HobbiesEnum hobbiesEnum) {
        super(name, age, home, hobbiesEnum);
    }

    public Mum(Home home, HobbiesEnum hobbiesEnum) {
        super(home, hobbiesEnum);
    }

    final public void saySomething() {
        System.out.println("Good morning!");
    }

    public void saySomething(String say) {
        System.out.println(say);
    }


    public String getInfo() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nHobby: " + getHobbiesEnum();
    }
}
