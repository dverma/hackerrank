package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote
{
	Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    Map<String, Integer> noteMap = new HashMap<String, Integer>();
    
    public RansomNote(String magazine, String note) {
        
        String[] magWords = magazine.split(" ");
        String[] noteWords = note.split(" ");
        
        for(String s : magWords){
            if(magazineMap.containsKey(s))
            {
                int count = magazineMap.get(s);
                magazineMap.remove(s);
                magazineMap.put(s,++count);
            }
            else
                magazineMap.put(s,1);
        }
        
        for(String s : noteWords){
            if(noteMap.containsKey(s)){
                int count = noteMap.get(s);
                noteMap.remove(s);
                noteMap.put(s,++count);
            }
            else
                noteMap.put(s,1);
        }
    }
    
    public boolean solve() {
    	if(noteMap.keySet().size()>magazineMap.keySet().size())
            return false;
        for(String s: noteMap.keySet()){
            if(noteMap.get(s)>magazineMap.get(s)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
