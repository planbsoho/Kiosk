package Kiosk_Level3;

public class Main {

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        Kiosk implementKiosk1 = new Kiosk("햄버거",3000,"순살패티위에 양상추가들어간 햄버거");
        Kiosk implementKiosk2 = new Kiosk("불버거",5000,"매운 햄버거");
        Kiosk implementKiosk3 = new Kiosk("치즈버거", 6000, "치즈가 듬뿍 들어간 햄버거");
        Kiosk implementKiosk4 = new Kiosk("민트버거", 9000, "민트가 듬뿍 들어간 민초파의 햄버거");
        Kiosk implementKiosk5 = new Kiosk("김치버거", 9000, "김치가 듬뿍 들어간 한국인의 햄버거");

        kiosk.firstInfo();
        kiosk.menuList();
        kiosk.start();
        kiosk.checkSaveItem();
    }
}