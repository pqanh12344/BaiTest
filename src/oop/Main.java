/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        do{
            System.out.println("1. Nhập du lieu");
            System.out.println("2. Hiển thị chi tiet");
            System.out.println("3. look up");
            System.out.println("4. Exit");
            System.out.println("____________________________");
            System.out.println("Mời chọn : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //nhap sach
                    ArrayList<BookOnTape> books = new ArrayList<>();
                    System.out.println("Nhap so luong Book");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap so Se-ri: ");
                        String z = sc.nextLine();
                        System.out.println("Nhap mo ta: ");
                        String x = sc.nextLine();
                        System.out.println("Nhap Gia");
                        float y = Float.parseFloat(sc.nextLine());
                        BookOnTape book = new BookOnTape(z, x, y);
                        books.add(book);
                    }

                    File file = new File("book.txt");
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    for(BookOnTape a: books){
                        pw.println(a.getId());
                        pw.println(a.getMoTa());
                        pw.println(a.getPrice());
                    }
                    pw.close();
                    
                    //nhap video
                    ArrayList<Video> videos = new ArrayList<>();
                    System.out.println("Nhap so luong Video");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap so Se-ri: ");
                        String z = sc.nextLine();
                        System.out.println("Nhap mo ta: ");
                        String x = sc.nextLine();
                        System.out.println("Nhap Gia");
                        float y = Float.parseFloat(sc.nextLine());
                        Video video = new Video(z, x, y);
                        videos.add(video);
                    }

                    file = new File("video.txt");
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter fw1 = new FileWriter(file,true);
                    BufferedWriter bw1 = new BufferedWriter(fw1);
                    PrintWriter pw1 = new PrintWriter(bw1);
                    for(Video a: videos){
                        pw1.println(a.getId());
                        pw1.println(a.getMoTa());
                        pw1.println(a.getPrice());
                    }
                    pw1.close();
                    
                    
                    //nhap furniture
                    ArrayList<Furniture> furnitures = new ArrayList<>();
                    System.out.println("Nhap so luong Furniture");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap so Se-ri: ");
                        String z = sc.nextLine();
                        System.out.println("Nhap mo ta: ");
                        String x = sc.nextLine();
                        System.out.println("Nhap Gia");
                        float y = Float.parseFloat(sc.nextLine());
                        Furniture furniture = new Furniture(z, x, y);
                        furnitures.add(furniture);
                    }

                    file = new File("furniture.txt");
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter fw2 = new FileWriter(file,true);
                    BufferedWriter bw2 = new BufferedWriter(fw2);
                    PrintWriter pw2 = new PrintWriter(bw2);
                    for(Furniture a: furnitures){
                        pw2.println(a.getId());
                        pw2.println(a.getMoTa());
                        pw2.println(a.getPrice());
                    }
                    pw2.close();
                    break; 
                case 2:
                    // display sach
                    System.out.println("Hien thi Sach: ");
                    System.out.println("-----------------------");
                    Scanner in = new Scanner(new File("book.txt"));
                    while(in.hasNextLine()){
                        String z = in.nextLine();
                        String x = in.nextLine();
                        float y = Float.parseFloat(in.nextLine());
                        
                        System.out.println("so Se-ri: " + z);
                        System.out.println("mo ta: " + x);
                        System.out.println("Gia: " + y);
                        System.out.println();
                    }
                    System.out.println("---------------------------");
                    
                    //display video
                    System.out.println("Hien thi Video: ");
                    System.out.println("-----------------------");
                    in = new Scanner(new File("video.txt"));
                    while(in.hasNextLine()){
                        String z = in.nextLine();
                        String x = in.nextLine();
                        float y = Float.parseFloat(in.nextLine());
                        
                        System.out.println("so Se-ri: " + z);
                        System.out.println("mo ta: " + x);
                        System.out.println("Gia: " + y);
                        System.out.println();
                    }
                    System.out.println("---------------------------");
                    
                    //display furniture
                    System.out.println("Hien thi Furniture: ");
                    System.out.println("-----------------------");
                    in = new Scanner(new File("furniture.txt"));
                    while(in.hasNextLine()){
                        String z = in.nextLine();
                        String x = in.nextLine();
                        float y = Float.parseFloat(in.nextLine());
                        
                        System.out.println("so Se-ri: " + z);
                        System.out.println("mo ta: " + x);
                        System.out.println("Gia: " + y);
                        System.out.println();
                    }
                    System.out.println("---------------------------");
                case 3:
                    System.out.println("Nhap so Se-ri can tim: ");
                    String k = sc.nextLine();
                    ArrayList<BookOnTape> listBooks = new ArrayList<>();
                    Scanner out = new Scanner(new File("book.txt"));
                    while(out.hasNextLine()){
                        String z = out.nextLine();
                        String x = out.nextLine();
                        float y = Float.parseFloat(out.nextLine());
                        listBooks.add(new BookOnTape(z,x,y));
                    }
                    
                    ArrayList<Video> listVideos = new ArrayList<>();
                    out = new Scanner(new File("video.txt"));
                    while(out.hasNextLine()){
                        String z = out.nextLine();
                        String x = out.nextLine();
                        float y = Float.parseFloat(out.nextLine());
                        listVideos.add(new Video(z,x,y));
                    }
                    
                    ArrayList<Furniture> listFurnitures = new ArrayList<>();
                    out = new Scanner(new File("furniture.txt"));
                    while(out.hasNextLine()){
                        String z = out.nextLine();
                        String x = out.nextLine();
                        float y = Float.parseFloat(out.nextLine());
                        listFurnitures.add(new Furniture(z,x,y));
                    }
                    
                    for(BookOnTape a: listBooks){
                        if(a.getId().equals(k)){
                            System.out.println(a.getDescription());
                        }
                    }
                    
                    for(Video a: listVideos){
                        if(a.getId().equals(k)){
                            System.out.println(a.getDescription());
                        }
                    }
                    
                    for(Furniture a: listFurnitures){
                        if(a.getId().equals(k)){
                            System.out.println(a.getDescription());
                        }
                    }
                    break;
                case 4:{
                    System.out.println("Ðã thoát!");
                    System.exit(0);
                }
            }
        }while(choice != 0);

        
        
    }
}
