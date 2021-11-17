package com.company;
public class Main {

    public static void main(String[] args) {
        Tree tree1 = new Tree("Ель");
        Tree tree2 = new Tree("Сосна");

        System.out.println(tree1);
        System.out.println(tree2);

        tree1.fall();
        tree2.bloom();
        tree1.yellowed();
        tree2.yellowed();
        tree2.snow();

        System.out.println(tree1.equals(tree2));
    }
}

