package 模板方法;

public class testPaperA extends testPaper{

    @Override
    protected void answer1() {
        System.out.println("A");
    }

    @Override
    protected void answer2() {
        System.out.println("B");
    }

    @Override
    protected void answer3() {
        System.out.println("C");
    }
}
