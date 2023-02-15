// Напишите метод, который находит самую длинную строку общего префикса среди массива строк
// Если общего префикса нет, вернуть пустую строку

public class task3 {
    public static void main (String[] args){
        String[] arr =new String[]{"abc","abcde","abcdefg","acvbd","abcdf"};
        String temp="";
        String pref_x ="abc";
        for (int i=0; i<arr.length;i++){
            if(arr[i].contains(pref_x)){
                if (temp.length()<arr[i].length()){
                    temp=arr[i];
                }

            }
        }
        System.out.println(temp);
        
    }}




    
