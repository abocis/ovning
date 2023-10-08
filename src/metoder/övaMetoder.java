package metoder;

public class övaMetoder {
    public static void main(String[] args) {

        Mymethod("abou", 29);



        // exemple 1
        System.out.println(methodMedReturn(4,7));
        // exeempele 2
        int result = methodMedReturn(5,6);
        System.out.println("my result  is " +  result);

        checkAge(112);

    }

    // method without return value. here  we use the void...

    public static void Mymethod (String fmname, int age ){

        System.out.println(fmname  +"is "+ age);
    }
    // method wth return value, instead of using the void key word we use the primitive data such as int chart osv

     static int methodMedReturn(int x, int y){
        return y + x;
    }

    // create check age method the return an integer

    static void checkAge(int age ){

        if (age < 20 ){
            System.out.println("du får inte komma in i systemet ");
        }else{
            System.out.println("VÄLKOMMEN IN ");
        }

    }
}
