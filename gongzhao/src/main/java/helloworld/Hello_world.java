package helloworld;

import java.util.*;

public class Hello_world{
    public static void main(String[] arg){
        int[] in={1,2,6,5,3};
        int[] out={5,5,7,6,8};
        int[] sorted_in=sort_raise(in);
        Map<Integer,Integer> dict1=dict_load(in);
        Map<Integer,Integer> dict2=dict_load(out);        
        int pure_out=0,seat=0;
        for(int i=0;i<sorted_in.length;i++){
            if(!dict2.containsKey(sorted_in[i])){
                pure_out=0;
            }else{
                pure_out=dict2.get(sorted_in[i]);
            }
            seat=seat+dict1.get(sorted_in[i])-pure_out;
            System.out.print("In:"+" "+dict1.get(sorted_in[i])+" "+"Out:"+" "+pure_out+" "+"Number of Seats:"+" "+seat+"\n");
        }    
    }
    private static int[] sort_raise(int[] numbers){
        
        for (int n=0;n<numbers.length;n++){
            for (int i=numbers.length-1;i>0;i--){
                if (numbers[i]<numbers[i-1]){
                    int a=numbers[i-1];
                    numbers[i-1]=numbers[i];
                    numbers[i]=a;
                    
                }
            }
    }
        return numbers;
    }
    private static int[] zeros(int number){
        int[] zero=new int[number];
        for (int i=0;i<number;i++){
            zero[i]=0;
        }
        return  zero;
    }
    private static Map<Integer,Integer> dict_load(int[] inputs){
        Map<Integer,Integer> dict=new HashMap<Integer,Integer>();
        for (int i=0;i<inputs.length;i++){
            if (!dict.containsKey(inputs[i])){
                dict.put(inputs[i], 1);
            }
            else{
                dict.put(inputs[i],dict.get(inputs[i])+1);
            }
        }
        return dict;
    }
}
