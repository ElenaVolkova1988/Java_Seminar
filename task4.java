// задать целочисленный массив состоящий из элементов 1 и 0
// С помощью цикла и условия заменить 0 на 1 и 1 на 0 (НЕ ДОДЕЛАННАЯ)

import java.util.Random;

public class task4 {
    public static void main (String[] arg){
        int [] arr= new int [10];
        Random random=new Random();
        for (int i=0; i< arr.length;i++){
            arr[i]= random.nextInt(2);
            System.out.println(arr[i]);

        }
    }
    
}
