/*Properties and UIDefaults extends to HashTable which further extends to Dictionaries, created as a Class.
The HashTable implements HaspMap, it is serializable and cloneable.*/
import java.util.*;
public class  ArrayToTables 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[15];
        Hashtable<Integer, Integer> Ht = new Hashtable<>(5, 0.8f);   // Sie of 5, with Load factor 0.8
        int x;
        System.out.println("Start Entering the Values in the Hashtable !! ");
        for(int i = 0; i < 15; i++)
        {
            System.out.print("Enter the value : ");
            arr[i] = sc.nextInt();
            System.out.println();     //  Hash function always comprises of % operator to ensure compression within the Table size
            x = arr[i]%5;             // Hash Function to set values in the Table of size 5
            Ht.put(x, arr[i]);        // Adding elements into the Table
            System.out.println("The current Hashtable : "+Ht);
        }
        sc.close();
    }
}