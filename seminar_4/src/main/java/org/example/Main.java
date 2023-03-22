package org.example;

public class Main {
    public static void main(String[] args) {



        HashMap<String, Emp> hashMap = new HashMap<>();
        Emp e1 = hashMap.put("abc", new Emp("sss", 11));
        Emp e2 = hashMap.put("aasabc", new Emp("sasdss", 12));
        Emp e3 = hashMap.put("abc", new Emp("ssfafs", 13));
        Emp e4 = hashMap.put("abdsadc", new Emp("sssfjkr", 14));

        Emp e5 = hashMap.remove("abc");
        Emp e6 = hashMap.remove("abc");

        Emp e7 = hashMap.get("abc");
        Emp e8 = hashMap.get("aasabc");
    }
}

class Emp{
    private String name;
    private int age;

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }
}