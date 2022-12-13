package 建造者模式;

public class PersonThinBuilder extends PersonBuilder{
    public PersonThinBuilder(String name) {
        super(name);
    }

    @Override
    public void buildHead() {
        System.out.println("Build Thin Head");
    }

    @Override
    public void buildBody() {
        System.out.println("Build Thin Body");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("Build Thin ArmLeft");
    }

    @Override
    public void buildArmRight() {
        System.out.println("Build Thin ArmRight");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("Build Thin ArmLeft");
    }

    @Override
    public void buildLegRight() {
        System.out.println("Build Thin ArmRight");
    }
}
