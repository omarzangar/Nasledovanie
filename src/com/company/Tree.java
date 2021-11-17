package com.company;

public class Tree {
    private String name;
    private Vetka vetka;
    private List list;

    public Tree(String name){
        this.name = name;
        this.vetka = new Vetka();
        this.list = new List();
    }

    public void bloom(){
        System.out.println(name + ": Зацвело");
    }

    public void fall(){
        vetka.fallist(name);
    }

    public void snow(){
        list.snowed(name);
    }

    public void yellowed(){
        list.yell(name);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;

        Tree tree = (Tree) obj;

        if (obj == null || getClass() != obj.getClass()) return false;

        if(!vetka.equals(tree.vetka))
            return false;

        if(!list.equals(tree.list))
            return false;

        return name.equals(tree.name);
    }

    @Override
    public int hashCode(){
        int result = vetka.hashCode() + list.hashCode();
        result = 23 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Дерево: " + name;
    }

}



