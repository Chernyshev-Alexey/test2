import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //example1();
        //example2();
        //example3();
        //example4();
        //example5();
        //example6();
        //table(5);
        //drawRectangle(6, 1, "+");
        //task1();
        //task2();
        //task3();
        //task4();
        //task6();
        //task7();
        //task8();
        //task9();
        //task12();
        //task13();
        //taskA3();
        //task10();

        //System.out.println( (int)'a' );
        //System.out.println( (int)'z' );
        //System.out.println(-10 % 7);
        task10();

    }

    public static void task10(){
        Warehouse wh = new Warehouse();
        wh.getCommand();
    }

    public static void taskA3(){
        short size = 3;
        int[][] ints = new int[size][];
        ints[0] = new int[1];
        ints[0][0] = 1;
        }
    public static void task13(){
        String[] cards = {
                "6 червей",
                "7 червей",
                "8 червей",
                "9 червей",
                "10 червей",
                "Валет червей",
                "Дама червей",
                "Король червей",
                "Туз червей",
                "6 бубновый",
                "7 бубновый",
                "8 бубновый",
                "9 бубновый",
                "10 бубновый",
                "Валет бубновый",
                "Дама бубновый",
                "Король бубновый",
                "Туз бубновый",
                "6 пиковый",
                "7 пиковый",
                "8 пиковый",
                "9 пиковый",
                "10 пиковый",
                "Валет пиковый",
                "Дама пиковый",
                "Король пиковый",
                "Туз пиковый",
                "6 крестовый",
                "7 крестовый",
                "8 крестовый",
                "9 крестовый",
                "10 крестовый",
                "Валет крестовый",
                "Дама крестовый",
                "Король крестовый",
                "Туз крестовый"
        };

        System.out.print("Количество игроков: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 6 || n < 2) {
            System.out.println("Игроков должно быть от 2 до 6");
        } else {
            Random rnd = new Random();
            int[][] players = new int[n][5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {

                    int cardNum = 0;

                    boolean isCardUsed = true;
                    while (isCardUsed) {
                        cardNum = rnd.nextInt(31) + 1;
                        isCardUsed = false;

                        for (int k = 0; k < n; k++) {
                            for (int l = 0; l < 5; l++) {
                                if (players[k][l] == cardNum) isCardUsed = true;
                            }
                        }
                    };
                    players[i][j] = cardNum;
                    players[i][j] = cardNum;
                    players[i][j] = cardNum;

                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(cards[players[i][j]]);
                }
                System.out.println();
            }
        }
    }

    public static void task12(){

        System.out.print("Введите email: ");

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        int dotLastIndex = email.lastIndexOf(".");

        System.out.println(email.substring(dotLastIndex + 1));
    }

    public static void task9(){
        int [] a = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i]);
            if(i > 0) System.out.print(", ");
            else System.out.print("\n");
        }

        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - 1; j++){

                if(a[j] < a[j + 1]){
                    int buffer = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = buffer;
                }
            }
        }

        //Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }

    public static void task8(){

        String text = "Жили-были старик со старухой.\n" +
                "\n" +
                "Вот и говорит старик старухе:\n" +
                "\n" +
                "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.";

        Scanner scanner = new Scanner(System.in);
        String menu = "";
        while (!menu.equals("0")){

            System.out.println(text);
            System.out.println("1-Удалить пробелы,  2-Сделать все заглавными или строчными,  3-Посчитать пробелы,  0-Выход");

            menu = scanner.nextLine();

            switch (menu){
                case "1":
                    text = text.replaceAll(" ", "");
                    break;
                case "2":
                    if(!text.substring(2,3).equals(text.substring(2,3).toUpperCase())) text = text.toUpperCase();
                    else text = text.toLowerCase();
                    break;
                case "3":
                    System.out.printf("Количество пробелов: %d \n", text.split(" ").length - 1);
                    break;
            }



        }
    }

    public static void task7(){
        String[] ar = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println(Arrays.toString(ar));

        for(int i = 0; i < ar.length/2; i++){
            String buffer = ar[i];
            ar[i] = ar[ar.length - i - 1];
            ar[ar.length - i - 1] = buffer;
        }

        System.out.println(Arrays.toString(ar));


    }

    public static void task6(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Введие слово: ");
            String word = scanner.nextLine().trim();
            if(word.equals("1")) break;

            if (word.indexOf(" ") > 0) {
                System.out.println("Введите корректное слово");
            }

            String wordBack = "";
            for(int i = 0; i < word.length(); i++){
                wordBack += word.substring(word.length() - i - 1, word.length() - i);
            }
            System.out.println(wordBack);
        }

    }

    public static void task4(){
        Book[] books = new Book[5];

        while(true) {
            System.out.print("Название книги: ");

            Scanner scanner = new Scanner(System.in);
            String name = "";

            name = scanner.nextLine();
            if(name.equals("1")) break;

            boolean isBookExist = false;
            int firstNullIndex = 100;

            for (int i = 0; i < books.length; i++){

                if(books[i] == null) {
                    firstNullIndex = i;
                    break;
                } else if (books[i].name.equals(name) ){
                    isBookExist = true;
                    System.out.print("Такая книга есть. ");
                    books[i].printStatus();
                    //System.out.println();
                    break;
                }
            }

            if(!isBookExist){

                System.out.println("Такой книги нет. Добавляем книгу: ");

                books[firstNullIndex] = new Book();
                books[firstNullIndex].name = name;

                System.out.print("Год издания: ");
                books[firstNullIndex].year = scanner.nextInt();

                System.out.print("Цена: ");
                books[firstNullIndex].price = scanner.nextInt();

                System.out.print("Книга добавлена. ");
                books[firstNullIndex].printStatus();

                if(firstNullIndex >= books.length - 1) {
                    System.out.println("Картотека заполнена");
                    break;
                }
            }
        }

        for(int i = 0; i < books.length; i++){
            if(books[i] != null){
                System.out.printf("%d:  ", i);
                books[i].printStatus();
            } else break;
        }
    }

    public static void task3(){
        String[] names = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int[][] scores = {
                {5, 4, 6, 8, 4},
                {4, 9, 7, 9, 7},
                {8, 1, 5, 4, 6},
                {3, 0, 7, 6, 4},
                {7, 4, 3, 2, 8}
        };
        String[] total = new String[5];
        for(int i = 0; i < names.length; i++){
            int totalScore = 0;
            for(int j = 0; j < names.length; j++){
                totalScore += scores[i][j];
            }
            total[i] = names[i] + " " + totalScore;
        }

        System.out.println(Arrays.toString(total));
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);

        String user = "", password = "";

        boolean isCorrect = false;
        while (!isCorrect){
            System.out.print("Введите имя: ");
            user = scanner.nextLine();

            System.out.print("Введите пароль: ");
            password = scanner.nextLine();

            if(password.length() < 8 || password.length() > 16){
                System.out.println("Пароль должен быть от 8 до 16 символов");
            } else isCorrect = true;
        }
        System.out.printf("Имя пользователя %s, пароль %s", user, password);
    }

    public static void task1(){
        int[] ar = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[3]);
    }

    public static void drawRectangle(int n, int m, String s) {
        for(int i = 0; i < m; i++){
            System.out.print(s);
        }
        System.out.println("");

        for(int i = 0; i < n - 2; i++){
            System.out.print(s);
            for(int j = 0; j < m - 2; j++){
                System.out.print(" ");
            }
            System.out.print(s);
            System.out.println("");
        }

        for(int i = 0; i < m; i++){
            System.out.print(s);
        }
    }

    public static void table(int n) {

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < n + 1; j++){
                System.out.printf(i * j + "\t");
            }
            System.out.println("");
        }

        for(int i = 1; i < n + 1; i++){
            System.out.println(i + " * " + n + " = " + i * n);
        }

    }

    public static void example6() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }

        }

    }

    private static boolean checkName(String name) {
        name = name.trim();
        String[] arrayOfNames = name.split(" ");
        System.out.println(arrayOfNames.length);
        int wordsQty = 0;
        for (int i = 0; i < arrayOfNames.length; i++){
            if (!arrayOfNames[i].equals("")) {
                wordsQty++;
            }
        }
        if(wordsQty == 3){
            return true;
        } else {
            return false;
        }
    }

    private static String formatName(String name) {
        name = name.trim();

        String[] arrayOfNames = name.split(" ");
        for(int i = 0; i < arrayOfNames.length; i++){
            if(arrayOfNames[i].substring(0, 1) != arrayOfNames[i].substring(0, 1).toUpperCase()){
                arrayOfNames[i] = arrayOfNames[i].toUpperCase().substring(0, 1) + arrayOfNames[i].substring(1, arrayOfNames[i].length());
                System.out.println(arrayOfNames[i].length());
                System.out.println(arrayOfNames[i].substring(1, arrayOfNames[i].length()));
            }
        }

        String result = "";

        for (int i = 0; i < arrayOfNames.length; i++){
            if (!arrayOfNames[i].equals("")) {
                result = result + " " + arrayOfNames[i];
            }
        }
        result = sortByLength(result);

        return result;
    }

    private static String sortByLength(String name) {
        name = name.trim();
        String[] arrayOfNames = name.split(" ");
        String result = "";

        for (int i = 0; i < arrayOfNames.length; i++){
            if (!arrayOfNames[i].equals("")) {
                result = result + " " + arrayOfNames[i];
            }
        }
        result = result.trim();

        arrayOfNames = result.split(" ");


        boolean isArrayChanged = false;
        do {
            isArrayChanged = false;
            for(int i = 0; i < arrayOfNames.length - 1; i++){
                if(arrayOfNames[i].length() > arrayOfNames[i + 1].length()){
                    String buffer = arrayOfNames[i];
                    arrayOfNames[i] = arrayOfNames[i + 1];
                    arrayOfNames[i + 1] = buffer;
                    isArrayChanged = true;
                }
            }
        } while (!isArrayChanged);

        result = "";
        for (int i = 0; i < arrayOfNames.length; i++){
            if (!arrayOfNames[i].equals("")) {
                result = result + " " + arrayOfNames[i];
            }
        }
        result = result.trim();

        return result;
    }

    public static void example5(){
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        //Написать код здесь
        return str.replaceAll(" ", "");
    }

    public static void example4(){
        String a = "22";
        String b = "22";

        b ="23";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static void example3(){
        //System.out.println(name1.equals(name2));

        checkUserName("Иван Петрович Иванов", "иван иванов");

    }

    public static void checkUserName(String name1, String name2){
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Выберите другое имя");
        } else {
            System.out.println("Отличное имя!");
        }
        System.out.println("Ваше имя имеет длину " + name1.length() + " символов");

        /*
        String[] arrayOfNames = name1.split(" ");
        String nameWithoutSpaces = "";
        for(int i = 0; i < arrayOfNames.length; i++){
            nameWithoutSpaces += arrayOfNames[i];
        }
        */
        String nameWithoutSpaces = name1.replaceAll(" ", "");
        System.out.println(nameWithoutSpaces);
        System.out.println("Без пробелов имя имеет длину " + nameWithoutSpaces.length() + " символов");

    }

    public static void example2(){
        String str = "Sometimes";
        System.out.println(str.charAt(3));
    }

    public static void example1(){
        int[] ar = new int[11];
        for(int i = 0; i < ar.length; i++){
            ar[i] = i + 5;
        }

        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
