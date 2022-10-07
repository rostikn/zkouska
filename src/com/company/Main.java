package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pet> pets = new ArrayList();

    public static void main(String[] args) {
        run();
    }

        private static void run(){
            System.out.println("Spousti se program");
            menu();
        }

        private static void menu(){
            System.out.println("Zadejte 1 pro pridani zviratka");
            System.out.println("Zadejte 2 pro odebrani zviratka");
            System.out.println("Zadejte 3 pro vypis");
            System.out.println("Zadejte cislo: ");
            String action = sc.nextLine();
            int num = Integer.parseInt(action);
            switch (num) {
                case 1 -> addPet();
                case 2 -> removePet();
                case 3 -> printAllPets();
                case 4 -> System.exit(1);
                default  -> menu();
            }
        }
        public static void addPet(){
            System.out.println("Action: AddPet");
            System.out.println("Zadejte jmenu: ");
            String name= sc.nextLine() ;
            System.out.println("Zadejte vek:");
            int age = Integer.parseInt(sc.nextLine());
            String gender= sc.nextLine();
            System.out.println("Zadejte druh: ");
            String type = sc.nextLine();
            System.out.println("Zadejte pocet nohou: ");
            int numberOfLegs = Integer.parseInt(sc.nextLine());
            pets.add(new Pet(name, age, gender, type, numberOfLegs));
            menu();
        }
        public static void removePet(){
            System.out.println("Action: RemovePet");
            System.out.println("Zadej jmeno: ");
            String name= sc.nextLine();
            System.out.println("odstrani se:" + name);
           pets.removeIf(pet -> pet.getName().equals(name));
            System.out.println("pet named" + name + "was removed");
            menu();
        }
        public static void printAllPets(){
            System.out.println("Action: printAllPets");
            System.out.println(pets);
            menu();
        }


}
