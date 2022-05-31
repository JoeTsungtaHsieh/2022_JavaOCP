package day22_cocurrent;

import java.util.concurrent.Callable;

public class ExceptionTask implements Callable<String>{

    @Override
    public String call() throws Exception{
        System.out.println("發生錯誤的 Task");
        
        throw new RuntimeException("哇哇哇~發生了例外...");
    }
    
}
