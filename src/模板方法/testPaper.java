package 模板方法;

abstract public class testPaper {

    public void testQuestion(){
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }
    public void testQuestion1(){
        System.out.println("question 1");
        answer1();
    }

    public void testQuestion2(){
        System.out.println("question 2");
        answer2();
    }

    public void testQuestion3(){
        System.out.println("question 3");
        answer3();
    }

    protected abstract void answer1();
    protected abstract void answer2();
    protected abstract void answer3();
}
