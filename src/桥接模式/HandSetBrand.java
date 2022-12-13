package 桥接模式;

public abstract class HandSetBrand {
    protected HandSetSoft soft;

    public void SetHandSetSoft(HandSetSoft soft){
        this.soft = soft;
    }

    public abstract void Run();
}
