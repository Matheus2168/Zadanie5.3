public class Test {


    public static void main(String[] args) {

        double i = 0.0;

        while (i <= 3.1){
            System.out.printf("%.1f, ",i);

            i+=0.1;
        }

        System.out.println();

        i = 0.0;
        do{
            System.out.printf("%.1f, ",i);
            i+=0.1;
        }
        while (i<=3.1);
    }
}
