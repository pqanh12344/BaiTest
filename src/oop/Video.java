/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Hp
 */
public class Video extends Thing{
    private String id;
    private String moTa;
    private float price;

    public Video(String id, String moTa, float price) {
        this.id = id;
        this.moTa = moTa;
        this.price = price;
    }

    public Video() {
    }

    
    
    public String getId() {
        return id;
    }

    public String getMoTa() {
        return moTa;
    }

    public float getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + moTa + " " + price;
    }

    
    
    @Override
    public String getDescription() {
        StringBuilder s = new StringBuilder();
        s.append("So seri: ").append(id).append("\n")
                .append("Mo Ta: ").append(moTa).append("\n")
                .append("Gia: ").append(price).append("\n");
        return s.toString();
    }
}
