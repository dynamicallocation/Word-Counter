import java.util.*;
import java.io.*;
import java.io.IOException;

public class Main{
    
    
    
    public static void main(String[] args) throws FileNotFoundException
    {
        //frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        //private Map<String,Integer> frequency = new HashMap<String,Integer>();
        
        
       // InputStreamReader in= new InputStreamReader(System.in);
        //pulling data from input stream
       // BufferedReader input = new BufferedReader(in);
        //buffer
        String ln = null;
        File file = new File("testing.txt");
        Scanner sc = new Scanner(file).useDelimiter("[.,:;()?!\"\\s]+");
        //instantiate scanner the goes through file
        Queue<String> q = new LinkedList<String>(); 
        Queue<Map<String,Integer>> fq = new LinkedList<Map<String,Integer>>();
        //creat queue
        Map<String,Integer>frequency = new HashMap<String,Integer>();
        //create hashmap
        int count = 0;
        //take count of queue
        String freq;
        //take frequency of queue
        
        //CLA 
        int howMany = Integer.parseInt(args[0]);
        //Words that should be displayed
        int lengthWord = Integer.parseInt(args[1]);
        //Length of words to be considered valid
        int lastnWords = Integer.parseInt(args[2]);
        //Threshhold for moving window
    
        while(sc.hasNext())
        {
            //String[] words = ln.split(" ");
            String word = sc.next();
            //Take words from file while there is words to take
            if(word.length() >= lengthWord)//Verify valid length
            {
                
                q.add(word);
                //add valid word 
                
                if(q.size() >= lastnWords)
                {
                    
                      freq = q.remove();
                     //Remove the word from back
                     
                }
                else
                {
                   
                    freq = q.peek();
                    frequency.put(freq,frequency.getOrDefault(freq,0)+1);
                    fq.add(frequency);

                }
            }
            count++;
            //last n words
             
    }

  
        Map<String,Integer> unsortedMap = new HashMap();
        
        for(int i = 0; i < howMany;i++)
        {
            System.out.println(fq.remove());
        }
        
        
           //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
 
         //Use Comparator.reverseOrder() for reverse ordering
        unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
       
        System.out.println(reverseSortedMap);
        
        

        
        
        
        
        
       
       
       
}

}
        
        
        
        
    
        


//q iterate word count