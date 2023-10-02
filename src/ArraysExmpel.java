import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExmpel {
    public static void main(String[] args) {
        //ARRAY VS ARRAYLIST

        // creating an array, but you have to give the size witch is fix and cannot grow
        String [] friendArray = new String[4];



        // creat an array and pass the value directly
        String[] teamsArray = {"Liverpool", "Tothenhamn","Man city", "Westhamn"};


        //creating and arrayList
        ArrayList<String> cityList = new ArrayList<String>(Arrays.asList("dakar", "thies", "Diourbel","ziguinchor"));

        // GET ELEMENT
        System.out.println(teamsArray[0]);
        System.out.println(cityList.get(0));
        // GET SIZE
        System.out.println(teamsArray.length);
        System.out.println(cityList.size());

        // add element on a arrayList..
        // CANNOT DO THAT WITH A ARRAY
        cityList.add("saint Louis");
        System.out.println(cityList.get(4));

        // change an element  on an array
        teamsArray[0] = "marseille ";
        System.out.println(teamsArray[0]);

        // change an element array list
        cityList.set(0, "mbour");
        System.out.println(cityList.get(0));

        System.out.println(Arrays.toString(teamsArray));
        System.out.println(cityList);








    }
}
