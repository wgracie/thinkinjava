package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListIterator {  
    public static void main(String[] args)  {  
        ArrayList<Integer> list = new ArrayList<Integer>();  
        list.add(10);
        list.add(8);
        list.set(1, 9); 
        list.add(7);
        Iterator<Integer> iterator = list.iterator();  
        while(iterator.hasNext()){  
            Integer integer = iterator.next();  
            if(integer==10)  
                list.remove(integer);   //注意这个地方  
                //iterator.remove();
        }  
    }  
}  