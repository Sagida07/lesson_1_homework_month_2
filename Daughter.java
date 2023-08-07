
final public class Daughter extends Mum {


    public Daughter(String name, int age, Home home, HobbiesEnum hobbiesEnum) {
        super(name, age, home, hobbiesEnum);
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHome: " + getHome().getName() +
                "\nHome: " + getHome().getAddress();
    }

}

