package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<News> list = new ArrayList<>();
        System.out.println("---------List-----------");
        System.out.println("1: Insert News");
        System.out.println("2: View List News");
        System.out.println("3: Average rate");
        System.out.println("4: Exit");
            int n;
            System.out.println("Select Your Option");
            n = sc.nextInt();
            switch(n) {
                case 1:
                    News news = new News();
                    System.out.println("Enter Id: ");
                    news.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter Title: ");
                    news.setTitle(sc.nextLine());
                    System.out.println("Enter Publish Date");
                    news.setPubishDate(sc.nextLine());
                    System.out.println("Enter Author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.println("Enter Content: ");
                    news.setContent(sc.nextLine());
                    System.out.println("Enter Rate: ");
                    news.Input();
                    list.add(news);
                    break;
                case 2:
                System.out.format("%15s %15s %15s %15s %15s %15s","ID",  "Title","PublishDate", "Author", "Content", "Average");
                list.forEach(News::Display);
                break;
                case 3: 
                System.out.format("%15s %15s %15s %15s %15s %15s","ID",  "Title","PublishDate", "Author", "Content", "Average");
                for(int i = 0; i< list.size();i++) {
                    list.get(i).calculate();
                    list.get(i).Display();
                }
                break;
                case 4:
                    System.exit(0);
            }
        sc.close();
    }
}
