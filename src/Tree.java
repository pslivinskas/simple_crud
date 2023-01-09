import java.util.ArrayList;
import java.util.Scanner;

public class Tree {
    private static int counter = 0;
    public static ArrayList<Tree> trees = new ArrayList<>();
    private int id;
    private String name;
    private String continent;

    public Tree() {
        this.id = ++counter;
        trees.add(this);
    }

    public Tree(int emptyTree) {
        this.id = 0;
    }

    public Tree(String name, String continent) {
        this.id = ++counter;
        this.name = name;
        this.continent = continent;
        trees.add(this);
    }

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", continent='" + this.continent + '\'' +
                '}';
    }

    public static void showTrees() {
        for (int i = 0; i < Tree.trees.size(); i++) {
            Tree tree = Tree.trees.get(i);
            System.out.println(tree);
        }
    }

    public static void deleteTree(int id) {
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).id == id) {
                trees.remove(i);
                System.out.println("Successfully removed");
                return;
            }
        }
        System.out.println("Could not find this id");
    }
    public static void editTree (Scanner sc){
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).id == id){
                System.out.println("Enter tree name");
                trees.get(i).setName(sc.nextLine());
                System.out.println("Enter tree continent");
                trees.get(i).setContinent(sc.nextLine());
                System.out.println("Tree was successfully updated");
            }
        }
    }
}
