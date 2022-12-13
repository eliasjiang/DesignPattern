package 建造者模式;

abstract public class PersonBuilder {
    public String name;

    public PersonBuilder(String name){
        this.name = name;
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

}
