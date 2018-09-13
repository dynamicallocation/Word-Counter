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
        StringBuilder sb = new StringBuilder();
        int theFrequency = 0;
        int count = 0;
        String wordFreq;
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
        
       /*() MyComparator comp = new MyComparator(frequency);
        Map<String,Integer> sortedFrequency = new TreeMap(comp);
        sortedFrequency.putAll(frequency);
        System.out.println(frequency);
        Set<String> keys = sortedFrequency.keySet();
        System.out.println(keys);*/
        
        //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
 
        //Use Comparator.reverseOrder() for reverse ordering
        frequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
 
        Set<String> keys = reverseSortedMap.keySet();
        System.out.println(keys);

       //Compare Value implementation by Lokesh Gupta 
       //https://howtodoinjava.com/sort/java-sort-map-by-values/
       
       
       
}

}
        
        
        
        
    
        


//q iterate word count