package Kiosk_Level3;

public class MenuItem {
    //속성
    private String name;
    private String info;
    private double price;
    //생성자
    MenuItem(String name, double price, String info){
        this.name=name;
        this.price=price;
        this.info=info;
    }
    //기능
    public void setName(String name) {
        this.name = name;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getInfo(){
        return this.info;
    }
    @Override
    public String toString() {
        return "상품 이름: " + name + ", 가격: " + price + "원, 설명: " + info;
    }
}
