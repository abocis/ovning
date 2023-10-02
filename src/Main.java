public class Main {
    public static void main(String[] args) {
    // HÄR INNE KAlAR VI PÅ VÅR METHOD
        total(10,15);
        total(12, 29);

    }
    public static void total (int a , int b){
        int result = a + b;
        System.out.println("result = " + result);

    }
    //detta ska man inte göra i en method
    public static void calcTotal  (){
        // static innebär att method är associated med denna klass main
        // void betyder att vi inte har något retur värde

        int a = 3;
        int b = 5;
        int result = a + b ;
        System.out.println("Total sum " + result);
    }
}