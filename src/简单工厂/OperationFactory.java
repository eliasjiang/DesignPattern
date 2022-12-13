package 简单工厂;

public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = switch (operate) {
            case "+" -> new OperationAdd();
            case "-" -> new OperationSub();
            case "*" -> new OperationMul();
            case "/" -> new OperationDiv();
            default -> null;
        };
        return oper;
    }
}
