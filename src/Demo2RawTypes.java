import java.util.ArrayList;
import java.util.List;

public class Demo2RawTypes {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        //I want to store only integer

        arrayList.add(10);
        arrayList.add("20");
        arrayList.add(30);

        System.out.println("arrayList = " + arrayList);
        //sum all  the elements of list
        int sum = 0;
        for(Object obj : arrayList){
            sum = sum + (Integer) obj;
        }
        System.out.println("sum = " + sum);
    }
}
