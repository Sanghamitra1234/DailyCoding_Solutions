import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int findLongestSubstring(String s, int k){
        if(s.length()<=k) return -1;
        
        //Sliding window method
        int start=0;
        int len=1;
        HashMap<Character,Integer> h=new HashMap<>();
        
       for(int end=0;end<s.length();end++){
            char curr=s.charAt(end);
            h.put(curr,h.get(curr)==null?1:h.get(curr)+1);
            if(h.size()>=k){
                //Remove char from hashmap until the size becomes what we want
                while(start<end && h.size()>k){
                    if(h.get( s.charAt(start) ) > 1){
                        h.replace(s.charAt(start), h.get( s.charAt(start) )-1);
                    }else {
                        h.remove( s.charAt(start) );
                    }
                    start++;
            }
            len=Math.max(len, end-start+1);
           // end++;
           
          }
        }
        return len;
    }
	public static void main (String[] args)
	 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []arr;
		try{
		    String st=br.readLine();
		    int t=Integer.parseInt(st);
		    for(int i=0;i<t;i++){
		        String a=br.readLine();
		        int at=Integer.parseInt(br.readLine());
		        int n=findLongestSubstring(a, at);
		        System.out.println(n);
		    }
		   
		}
		catch(IOException e){ }
	 }
}
//Time complexity=O(n)
//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring/0
