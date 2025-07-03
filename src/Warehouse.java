import java.util.Arrays;
import java.util.Scanner;

public class Warehouse {
    public int itemsQty = 5;
    public String[] items;


    public void getCommand(){
        createItemsArray();

        System.out.println("0-Выход, показать, проверить ХХХ, добавить ХХХ, удалить ХХХ");

        String command = "";

        while (!command.equals("0")){
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();

            String[] commandSplit = command.split(" ");

            switch (commandSplit[0]){
                case "0":
                    System.out.println("Выход");
                    break;
                case "показать":
                    for(int i = 0; i < itemsQty; i++){
                        if(items[i] != "" && items[i] != null) System.out.println(items[i]);
                    }
                    break;
                case "проверить":
                    if(!checkItem(commandSplit[1])) System.out.println("Нет");
                    else System.out.println("Есть");
                    break;
                case "добавить":
                    addItem(commandSplit[1]);
                    break;
                case "удалить":
                    deleteItem(commandSplit[1]);
                    break;
            }
        }
    }

    public void createItemsArray(){
        items = new String[itemsQty];
        for(int i = 0; i < itemsQty; i++){
            items[i] = "";
        }
    }

    public void addItem(String name){
        int indexOfEmpty = Arrays.binarySearch(items, "");

        if(indexOfEmpty < 0){
            System.out.println("Невозможно добавить предмет. Место на складе кончилось");
        } else if(checkItem(name)){
            System.out.println("Предмет уже есть на складе");
        }
        else {
            items[indexOfEmpty] = name;
            Arrays.sort(items);
            System.out.println(name + " добавлено");
        }
    }

    public void deleteItem(String name){

        int indexOfItem = Arrays.binarySearch(items, name);
        if(indexOfItem >= 0){
            items[indexOfItem] = "";
            Arrays.sort(items);
            System.out.println(name + " удалено");
        } else {
            System.out.println("Удаление предмета невозможно. Предмета нет на складе");
        }
    }

    public boolean checkItem(String name){
        boolean isItemFound = Arrays.binarySearch(items, name) >= 0;
        return isItemFound;
    }

}
