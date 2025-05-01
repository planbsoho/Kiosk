package Kiosk_Level4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        MenuItems firstBurger = new MenuItems("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItems secondBurger = new MenuItems("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItems thirdBurger = new MenuItems("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItems fourthBurger = new MenuItems("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        Menu burgersMenu = new Menu("[ BURGERS MENU ]");

        burgersMenu.addMenuItem(firstBurger);
        burgersMenu.addMenuItem(secondBurger);
        burgersMenu.addMenuItem(thirdBurger);
        burgersMenu.addMenuItem(fourthBurger);

//        burgersMenu.printMenuList();

        MenuItems firstDrink = new MenuItems("coke", 3.1, "시원해요");
        MenuItems secondDrink = new MenuItems("milk", 5.5, "튼튼해요");
        MenuItems thirdDrink = new MenuItems("cider", 3.3, "차가워요");
        MenuItems fourthDrink = new MenuItems("coffee", 6.6, "따뜻해요");
        Menu drinkMenu = new Menu("[  DRINK MENU  ]");

        drinkMenu.addMenuItem(firstDrink);
        drinkMenu.addMenuItem(secondDrink);
        drinkMenu.addMenuItem(thirdDrink);
        drinkMenu.addMenuItem(fourthDrink);

//        drinkMenu.printMenuList();

        MenuItems firstDessert = new MenuItems("cookie", 2.0, "달콤해요");
        MenuItems secondDessert = new MenuItems("haribo", 3.2, "말랑해요");
        MenuItems thirdDessert = new MenuItems("chocolate", 2.1, "녹았어요");
        MenuItems fourthDessert = new MenuItems("donut", 1.9, "5000칼로리");
        Menu dessertMenu = new Menu("[  DESSERT MENU  ]");

        dessertMenu.addMenuItem(firstDessert);
        dessertMenu.addMenuItem(secondDessert);
        dessertMenu.addMenuItem(thirdDessert);
        dessertMenu.addMenuItem(fourthDessert);

//        dessertMenu.printMenuList();

        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgersMenu);
        kiosk.addMenu(drinkMenu);
        kiosk.addMenu(dessertMenu);

        kiosk.start();
    }
}