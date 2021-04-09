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
    public Book[] sortBooks() {
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
        return dataBooks;
    }
    public void displayNewdataBooks(){
        for (Book a : dataBooks
        ) {
            System.out.println(a.getName());
        }
    }

}



