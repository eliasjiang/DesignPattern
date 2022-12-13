package 建造者模式;

public class MainApp {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonThinBuilder("kim");
        PersonDirector pbD = new PersonDirector(pb);
        pbD.CreatePerson();

    }
}
