import java.util.jar.JarEntry;

public class WhileLopp {
    public static void main(String[] args) {
        // while loop

        int j = 1;

        while (j <= 5 ){
            System.out.println("whule loop " + j);
            j++;
        }

        // whle med break

        int a = 1;

        while (true ){

            if (a > 5){
                break;
            }
            System.out.println("while loop med break " + a);
            a++;
        }

        // do while loo

        boolean isReady = false;
        int c = 1;

        do {
            if (c > 5 ){
                break;
            }
            System.out.println("do while loop " + c);
            c++;
            isReady = ( c > 0);

        }while (isReady);{

        }

        // while med continue
        int z = 0;
        while (z < 30){
            z += 5;

            if (z % 15 == 0){
                continue;
            }

            System.out.println(z + " _ ");
        }


    }
}
