import java.util.*;
import java.io.*;

public class Main{
    
    
    
    public static void main(String[] args) throws FileNotFoundException
    {
        //frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        //private Map<String,Integer> frequency = new HashMap<String,Integer>();
        
        
        File file = new File("testing.txt");
        Scanner sc = new Scanner(file);
        Queue<String> q = new LinkedList<String>(); 
        Map<String,Integer>frequency = new HashMap<String,Integer>();
        int theFrequency = 0;
        int count = 0;
        int arg = Integer.parseInt(args[0]);
        //System.out.println(arg);
        while(sc.hasNext() && count < arg)
        {
            String word = sc.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            count++;
            if(word.length() >= Integer.parseInt(args[1]))
            {
                q.add(word);
            }
            
            
        }
        
        
        while(!q.isEmpty())
        {
            
            String freq = q.remove();
            frequency.put(freq,frequency.getOrDefault(freq,0)+1);
        }
        
       System.out.println(frequency);
       
       
       
       
}

}
        
        
        
        
    
        


//q iterate word count