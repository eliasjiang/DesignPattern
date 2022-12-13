package 建造者模式;

public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    public void CreatePerson(){
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }
}
