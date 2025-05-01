package Kiosk_Level2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    //설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    //속성
    private String name;
    private double price;
    private String info;
    //생성자
    public MenuItem(String name, int price ,String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }
    //기능
    public String getName(){
        return this.name;
    }
    public double price(){
        return this.price;
    }
    public String getInfo(){
        return this.info;
    }
    @Override
    public String toString(){
        return name+ "   price : " +price+ "   info : "+info;
    }
}