
public class StringBufferReverseExample2 {  
    public static void main(String[] args) {  
        StringBuffer sb1 = new StringBuffer("97g");  
        System.out.println("string1: " + sb1);  
          
        StringBuffer sb2 = new StringBuffer("12321");  
        System.out.println("string2: " + sb2);  
        // reversing of stringbuffer  
        System.out.println("reverse1: " + sb1.reverse());  
        System.out.println("reverse2: " + sb2.reverse());  
    }  
}