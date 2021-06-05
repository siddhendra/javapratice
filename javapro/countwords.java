import javax.xml.crypto.dsig.Manifest;

import jdk.javadoc.internal.tool.Main;

public class countwords {
    public static void main(String[] args){
        String  s ="welcome to java";
       String[] s1 = s.split("");
       int len=0;
       for(String t:s1)
       {
           len++;
       }
       System.out.println(len);
    }
    
}
