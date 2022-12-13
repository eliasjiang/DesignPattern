package 桥接模式;

public class MainApp {
    public static void main(String[] args) {
        HandSetBrand ab;
        ab = new HandSetBrandN();

        ab.SetHandSetSoft(new HandSetGame());
        ab.Run();

        ab.SetHandSetSoft(new HandSetAddressList());
        ab.Run();



    }
}
