package com.company;

public class Manager {
    public static Book dataBooks[];
    public Manager(Book[] dataBooks){
        this.dataBooks=dataBooks;
    }
    public double totalBooks(Book[] dataBooks){
        double total = 0;
        for (Book a: dataBooks
        ) {
            total += a.getPrice();
        }
        return total;
    }
    public int countLanguage() {
        int count = 0;
        for (int i = 0 ; i < dataBooks.length ; i++) {
            if(dataBooks[i] instanceof ProgrammingBook && ((ProgrammingBook)dataBooks[i]).getLanguage() == "java"){
                count++;
            }
        }
        return  count;
    }
}



