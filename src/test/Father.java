package test;

public class Father {
    public void doRun(){
        System.out.println("Father doRun");
    }

    public void doRun(String name){
        System.out.println("Father doRun:"+name);
    }

    public void test(){
        doRun("siege");
    }
}
