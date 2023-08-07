public class Granny {

    private String name;
    private int age;
    private Home home;
    private HobbiesEnum hobbiesEnum;

    public Granny() {
    }

    public Granny(String name, int age, Home home, HobbiesEnum hobbiesEnum) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.hobbiesEnum = hobbiesEnum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Home getHome() {
        return home;
    }

    public HobbiesEnum getHobbiesEnum() {
        return hobbiesEnum;
    }


    public Granny(Home home, HobbiesEnum hobbiesEnum) {
        this.home = home;
        this.hobbiesEnum = hobbiesEnum;
    }


}
