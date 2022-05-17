package day18;

class BigData {
    private String data;

    BigData() {
        for(int i=0; i<=9999;i++){
            data += String.valueOf(i);
        }
    }
} 
    public class ObjectTest {
        public static void main(String[] args)throws Exception {
            System.gc();
            Runtime runtime = Runtime.getRuntime();
            System.out.printf("FreeMemory: %,d bytes\n",runtime.freeMemory());
            BigData bigData = new BigData();
            Thread.sleep(1000);
            System.out.printf("FreeMemory: %,d bytes\n",runtime.freeMemory());
            bigData = null;
            System.gc();
            Thread.sleep(1000);
            System.out.printf("FreeMemory: %,d bytes\n",runtime.freeMemory());
            
        }
    }
    
    

