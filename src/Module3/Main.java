package Module3;

public class Main {
    public static void main(String[] args) {
        double[] ar = {1.3, 3.2, 5.1, 4.7};

        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }

        double total = 0;
        for(int i = 0; i < ar.length; i++){
            total += ar[i];
        }
        System.out.printf("Сумма массива %f \n", total);

        double max = ar[0];
        for(int i = 0; i < ar.length; i++){
            if(max < ar[i]) max = ar[i];
        }
        System.out.printf("Максимальный элемент массива %f \n", max);
    }
}
