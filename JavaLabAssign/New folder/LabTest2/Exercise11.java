public class Example11  
{  
public static void main(String[] args)   
{          
   int i;  
 
    int arr[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};  
    System.out.print("Before sorting an array: ");  
       for(i = 0; i < arr.length; i++)  
       System.out.println(arr[i]);        
       
       getSorted(arr, arr.length);  
      System.out.print("After sorting an array: ");      

for(i = 0; i <arr.length; i++)  
{  
System.out.println(arr[i]);  
}  
}  
  
private static void getSorted(int arr[], int n)   
{  
for (int i = 1; i < n; i++)  
{  
int j = i;  
int a = arr[i];  
while ((j > 0) && (arr[j-1] > a))   
{  
arr[j] = arr[j-1];  
j--;  
}  
arr[j] = a;  
}  
}  
}