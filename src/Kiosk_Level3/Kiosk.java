package Kiosk_Level3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //속성
    private static List<MenuItem> menuItems = new ArrayList<>();
    private static List<MenuItem> saveItems = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    boolean run = true;
    //생성자
    Kiosk(String name, double price, String info){
        this.menuItems.add(new MenuItem( name, price, info));
    }
    Kiosk(){}
    //기능
    public void firstInfo(){
        System.out.println("키오스크를 실행합니다.");
    }
    //메뉴나열
    public void menuList(){
        for(MenuItem a : menuItems){
            System.out.print((menuItems.indexOf(a)+1)+" 번 : ");
            System.out.println(a);
        }
    }
    //메뉴선택
    public void start(){
        while(run) {
            try {
                System.out.println("원하는 메뉴를 선택해주세요 1~5 0은뒤로가기 혹은 종료");
                int choise = scan.nextInt();
                scan.nextLine();

                switch (choise) {
                    case 1 -> {
                        System.out.println(choise+" 번매뉴를 선택하셨습니다 "+saveItems);
                        MenuItem saveInstance = menuItems.get(choise-1);
                        saveItems.add(saveInstance);
                    }
                    case 2 -> {
                        System.out.println(choise+" 번매뉴를 선택하셨습니다 ");
                        MenuItem saveInstance = menuItems.get(choise-1);
                        saveItems.add(saveInstance);
                    }
                    case 3 -> {
                        System.out.println(choise+" 번매뉴를 선택하셨습니다 ");
                        MenuItem saveInstance = menuItems.get(choise-1);
                        saveItems.add(saveInstance);
                    }
                    case 4 -> {
                        System.out.println(choise+" 번매뉴를 선택하셨습니다 ");
                        MenuItem saveInstance = menuItems.get(choise-1);
                        saveItems.add(saveInstance);
                    }
                    case 5 -> {
                        System.out.println(choise+" 번매뉴를 선택하셨습니다 ");
                        MenuItem saveInstance = menuItems.get(choise-1);
                        saveItems.add(saveInstance);
                    }
                    case 0 ->{
                        if(saveItems.isEmpty()==true){
                            System.out.println("선택된 항목이 없습니다 뒤로가기");
                            for(MenuItem a : menuItems){
                                System.out.print((menuItems.indexOf(a)+1)+" 번 : ");
                                System.out.println(a);
                            }
                        }else {
                            System.out.println("키오스크를 종료합니다");
                            run = false;
                            break;// outofboundException이 안뜨도록 바로 탈출
                        }
                    }
                    default -> throw new IndexOutOfBoundsException("오류");
                }
            }catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다 1~5의 숫자를 입력해주세요");
                scan.nextLine();
            }catch(IndexOutOfBoundsException e){
                System.out.println("잘못된 숫자 입니다. 1~5사이의 숫자를 입력해주세요.");
                //IndexOutOfBoundsException 발생 시 처리 음수, 리스트크기보다 큰수면 오류발생
            }
        }

    }
    public void checkSaveItem(){
        System.out.println("선택한 상품들입니다.");
        for(MenuItem a : saveItems){
            System.out.println(a);
        }
    }
}
