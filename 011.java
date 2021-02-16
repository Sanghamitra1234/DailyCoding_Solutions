
import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    String[]s ={"dear", "de", "prefixco", "deer", "dog"};
    String prefix = "de";
    ArrayList <String> newS = findWithPrefix (s, prefix+".*");
    System.out.println(newS);
    
  }
  public static  ArrayList<String> findWithPrefix (String[]s, String prefix)
  {
    ArrayList<String> result=new ArrayList<>();
    for(String index:s){
        //System.out.println(index);
        if(index.matches(prefix)){
            result.add(index);
        }
    }
    return result;
  }
}

//Used regex to match prefix
