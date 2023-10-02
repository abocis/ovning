public class Loopar {
    public static void main(String[] args) {
        System.out.println("hej");

        //for loop kommer att köras ett stycke kod tills ett villkor har uppnåtts

        for (int number =0 ; number <= 40; number += 5)  {

            if (number %  2 == 1){

                System.out.println ( number + " is  even");


            }else {
                System.out.println(number + " is odd" );
            }

        }


        //exemple for loop 1
        for (int a = 1; a <= 5; a++){

            System.out.println("loop a " + a );

        }
        //samma exemple med while loop
        int b = 1;
        while (b <= 5){
            System.out.println("while loop " + b);
            b++;
        }

    }

}
