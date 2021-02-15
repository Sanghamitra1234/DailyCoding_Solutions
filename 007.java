class Solution {
    
    public int numDecodings(String s) {
       
        return  countDecode(s,s.length(), 0);
    }
    public int countDecode(String s, int n, int start){
      
           if(start>n) return 0;
           if(start==n) return 1;
           if(s.charAt(start)=='0') return 0;
           int ans=countDecode(s,n,start+1);
           if(start<n-1&&(s.charAt(start)=='1'||s.charAt(start)=='2'&&s.charAt(start+1)<'7')) {
               
               ans+=countDecode(s,n,start+2);
            }
          
        return ans;
       
    }
}

//The time complexity is 2to the power n;
class Solution {
    
    public int numDecodings(String s) {
        int n=s.length();
        int [] mem=new int[n];
        Arrays.fill(mem, 0, n, -1);
        return  countDecode(s,n, 0,mem);
    }
    public int countDecode(String s, int n, int start, int [] mem){
      
           if(start>n) return 0;
           if(start==n) return 1;
           if(mem[start]!=-1) return mem[start];
           if(s.charAt(start)=='0') return 0;
           int ans=countDecode(s,n,start+1,mem);
           if(start<n-1&&(s.charAt(start)=='1'||s.charAt(start)=='2'&&s.charAt(start+1)<'7'))             {            
               ans+=countDecode(s,n,start+2,mem);
            }
        
          mem[start]=ans;
        return ans;
       
    }
}

/The time complexity is O(n);
