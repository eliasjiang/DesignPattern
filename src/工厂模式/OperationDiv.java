package 工厂模式;



public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if(getNumberB()==0) try {
            throw new Exception("除数不能为0");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getNumberA()/getNumberB();
    }
}
