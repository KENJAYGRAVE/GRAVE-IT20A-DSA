/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<>();


      person.add("ken jay");
        person.addFirst("sander");
        person.addLast("jm");
        person.add(1, "raymart");

        System.out.println("Linked List Original: " + person);
        System.out.println(person.size());


        if (person.contains("raymart")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = person.contains("raymart");
        System.out.println(containslion);


    }

}