package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book dataBooks[] = new Book[10];
        dataBooks[0] = new ProgrammingBook("s1", "book1", 10, "HaAnh", "java", "springBoot");
        dataBooks[1] = new ProgrammingBook("s2", "book2", 20, "HaAnh", "java", "springBoot");
        dataBooks[2] = new ProgrammingBook("s3", "book3", 30, "HaAnh", "javas", "springBoot");
        dataBooks[3] = new ProgrammingBook("s4", "book4", 40, "HaAnh", "javas", "springBoot");
        dataBooks[4] = new ProgrammingBook("s5", "book5", 50, "HaAnh", "java", "springBoot");
        dataBooks[5] = new FictionBook("s7", "book5", 10, "HaAnh", "student");
        dataBooks[6] = new FictionBook("s8", "book6", 20, "HaAnh", "student");
        dataBooks[7] = new FictionBook("s9", "book7", 30, "HaAnh", "student");
        dataBooks[8] = new FictionBook("s6", "book8", 40, "HaAnh", "student");
        dataBooks[9] = new FictionBook("s10", "book9", 50, "HaAnh", "student");

        Manager haanh = new Manager(dataBooks);
        System.out.println("total pricer of Books = " + haanh.totalBooks(dataBooks));
        System.out.println("total language java of Book = " + haanh.countLanguage());
        Book temp;
        for (int i = 0; i < dataBooks.length; i++) {
            for (int j = 0; j < dataBooks.length - i - 1; j++) {
                if (dataBooks[j].getPrice() > dataBooks[j + 1].getPrice()) {
                    temp = dataBooks[j];
                    dataBooks[j] = dataBooks[j + 1];
                    dataBooks[j + 1] = temp;
                }
            }
        }
        for (Book a : dataBooks
        ) {
            System.out.println(a.getName());
        }
    }
}
