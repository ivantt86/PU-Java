
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Zadacha4АиЖ {
    
    private static String[] array;
    
    public static void Start(){
        
        int n = GetArrayLength();
        array = new String[n];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Въвеждане елементите на масива:");
        for (int i = 0; i < n; i++){
           System.out.print("Въведете елемент " + (i+1) + ":");
           array[i] = sc.next();
        }
        
        Reshenie();
    }
    
    private static void Reshenie(){
        
        System.out.println();
        System.out.println("Извеждане на екрана на всички населени места, ");
        System.out.println("в чиито имена буквата \"е\" или \"Е\" се среща 2, 3 или 4 пъти, а буквата \"р\" не се среща нито веднъж");
        
        for(String item : array){
            int occurrOfe = CountMatches(item.toLowerCase(), 'e');
            if (occurrOfe >= 2 && occurrOfe <= 4 && item.indexOf("p") == -1)
                System.out.println(item);
        }
    }
    
    private static int CountMatches(String s, char p){
    
        int result = 0;
        for (char c : s.toCharArray()){
            if (c == p)
                result++;
        }
        return result;
    }
    
    private static int GetArrayLength(){
        
        Scanner sc = new Scanner(System.in);
        int result;
        // Подсигуряваме се че ще въведът число между 0 и 50
        while(true){
            try{
                System.out.println("Въведете брой на елементите между 0 и 50");
                    result = Integer.parseInt(sc.next());
                if ( result > 0 || result < 50 )
                    break;
            }catch(Exception e){}
        }
        return result;
    }
}