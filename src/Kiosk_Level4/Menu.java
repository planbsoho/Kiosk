package Kiosk_Level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //속성 필드
    private String menuName;
    private List<MenuItems> menuItemList = new ArrayList<>();
    //생성자
    Menu(String menuName){
        this.menuName = menuName;
    }
    //요구사항.
    // Menu 객체 생성을 통해 이름 설정
    // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입 ??
    //    Menu(String menuName,List<MenuItems> menuItems){
    //        this.menuName = menuName;
    //        this.menuItemList = menuItems;
    //    }
    //생성자로 아이템을 추가해야하나 기능으로 해야하나. 생성자는 새로운인스턴스를 초기화하는것 생성자로 추가하면 두개의객체가만들어진다.
    //menu1 - item1 , menu2 item2 이런식. 메서드로추가하기
    //기능
    //menuItem인스턴스 추가
    //메뉴아이템을 리스트에추가
    public void addMenuItem(MenuItems menuitem){
        this.menuItemList.add(menuitem);
    }
    //메뉴이름출력
    public void printMenuName(){
        System.out.println(this.menuName);
    }
    //메뉴이름과 메뉴의아이템들 리스트출력
    public void printMenuList(){
        System.out.println(this.menuName);
        int i = 1;
        for(MenuItems menuItem : menuItemList){
            System.out.println( i+ ". " + menuItem.displayInfo());
            i++;
        }
    }
    //아이템 이름만을 출력하기위한 메서드
    public void printMenuItemName(int index){
        System.out.print(this.menuItemList.get(index).getName());
    }
    //개별매뉴이름출력을위한메서드
    public void printindividualName(int index){
        System.out.println(menuItemList.get(index).getName());
    }
    //아이템출력을위해 키오스크클래스에서 아이템에 접근하기위한메서드
    public List<MenuItems> getMenuItemList() {
        return menuItemList;
    }
}
