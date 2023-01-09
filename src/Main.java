import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Tree("Maple", "Africa");
        new Tree("Oak", "North America");
        new Tree("Birch", "Central America");
        new Tree("Poplar", "South America");
        new Tree("Elm", "Asia");
        new Tree("Chestnut", "Australia");
        new Tree("Pine", "Europe");
        new Tree("Spruce", "Middle East");
        new Tree("Willow", "Arctic");
        new Tree("Palm", "Central Europe");
        new Tree("Cedar", "Eastern Europe");
        new Tree("Linden", "Western Europe");


        System.out.println("Welcome to the list of trees");
        while (true) {
            intro();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    Tree.showTrees();
                    break;
                case 2:
                    System.out.println("Enter tree name");
                    Tree tr = new Tree();
                    tr.setName(sc.nextLine());
                    System.out.println("Enter tree continent");
                    tr.setContinent(sc.nextLine());
                    System.out.println("The tree was successfully added");
                    break;
                case 3:
                    System.out.println("Enter ID of the tree you want to delete");
                    Tree.deleteTree(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Enter ID of the tree you want to edit");
                    Tree.editTree(sc);
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(1);
                    break;

            }
        }

    }

    public static void intro() {
        System.out.println("1. See the list of trees");
        System.out.println("2. Add tree to the list");
        System.out.println("3. Delete tree from the list");
        System.out.println("4. Edit tree");
        System.out.println("5. Exit program");
        ;
    }
}