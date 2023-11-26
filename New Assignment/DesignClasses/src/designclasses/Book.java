/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designclasses;


public class Book {
    private String bookName;
    private String authorName;
    private int price;
    
    public Book(String bn, String an){
        this.bookName = bn;
        this.authorName = an;
    }
    
    public Book(int p){
        this.price = p;
    }
    
    // Methods //
    public void displayInfo(){
        System.out.println("Name: "+bookName);
        System.out.println("Author: "+authorName);
    }
    
}
