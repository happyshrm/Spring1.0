package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Son extends Father {
    public void doRun(){
        System.out.println("Son doRun");
    }

    public void doRun(String name){
        System.out.println("Son doRun:"+name);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Father father=new Father();
        Constructor con=Father.class.getConstructor(new Class[0]);
        System.out.println(con);
        Father f=(Father) con.newInstance(new Object[0]);
        System.out.println(f);
        f.doRun();
    }
}
