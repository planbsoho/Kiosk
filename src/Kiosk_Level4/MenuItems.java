package Kiosk_Level4;

public class MenuItems {
    //속성
    private String name;
    private double price;
    private String info;
    //    MenuItems burger = new MenuItems("기본버거", 3000, "잘구운버거");
//    MenuItems cheeseBurger = new MenuItems("치즈버거", 4000, "치즈가넘치는햄버거");
    //생성자
    MenuItems(String name,double price,String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }
    //기능
    //필드게터
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return price;
    }
    public String getInfo() {
        return info;
    }
    //종합정보출력
    public String displayInfo(){
        return String.format("%-13s | W%-6.2f | %s",name,price,info);
    }
}
