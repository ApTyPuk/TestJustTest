package com.Artur;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("test.txt"));

        Set<String> stringSet = new HashSet<>();

        try {
            while (scanner.hasNextLine()) {
                String test = scanner.nextLine();
                stringSet.add(test);
            }
        }catch (NoSuchElementException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }

        System.out.println("\n");

        Iterator<String> iterator = stringSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n");
        System.out.println(stringSet.size());

    }



}
