package Bai3;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title;
    private String pubishDate;
    private String author;
    private String content;
    private float averangeRate;
   
    public float getAverangeRate() {
        return averangeRate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPubishDate() {
        return pubishDate;
    }
    public void setPubishDate(String pubishDate) {
        this.pubishDate = pubishDate;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }  
    public void Display() {
        System.out.format("%15s %15s %15s %15s %15s", getTitle(),getPubishDate(), getAuthor(), getContent(), getAverangeRate());
    }
    public int[] rateList = new int[3];
    public void Input() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ;i++) {
            System.out.print("Enter rate: " + (i+1));
            rateList[i] = sc.nextInt();
        }
        sc.close();
    }
    public void calculate() {
        int s = 0;
        for(int i = 0 ; i < 3; i++) {
            s += rateList[i];
        }
        this.averangeRate = (float)(s / 3);
    }

}
