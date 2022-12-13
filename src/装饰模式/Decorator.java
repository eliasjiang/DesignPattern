package 装饰模式;

public abstract class Decorator extends Component{
    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}
