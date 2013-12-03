
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 * генериране по случаен начин едномерен масив от цели числа принадлежащи на интервала [–100,100]
 * и намиране средно аритметично на елементите, които се делят на 5 без остатък
 */
public class Zadacha1G {
    
    public static int Zadacha1GResult(int arrayLength){
        
        int[] array = GenerateArray(arrayLength);
        int n=0;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]%5 == 0){
                sum += array[i];
                n++;
            }
        }
        return sum/n;
    }
    
    public static int[] GenerateArray(int n){
        
        int[] result = new int[n];
        Random r = new Random();
        
        for (int i =0; i < n; i++)
            result[i] = r.nextInt(100+100)-100;
        
        return result;
    }
}
