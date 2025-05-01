package Kiosk_Level4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private List<Menu> menus = new ArrayList<>();
    private boolean isrun = true;
    //생성자

    //기능
    public void firstSentance(){
        System.out.println("키오스크를 실행합니다,");
    }
    public void screenMain(){
        System.out.println("[ MAIN MENU ]\n" +
                "1. Burgers\n" +
                "2. Drinks\n" +
                "3. Desserts\n" +
                "0. 종료      | 종료");
    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        firstSentance();
        while(isrun){
            try{
                screenMain();
                System.out.println("매뉴를 선택해주세요");
                int choiceNumber1 = scan.nextInt();
                scan.nextLine();
                if ( choiceNumber1 > 0 && choiceNumber1 <= 3 ){
                    menus.get(choiceNumber1-1).printMenuList();
                    backFormat();
                    int choiceNumber2 = scan.nextInt();
                    if( choiceNumber2 >= 1 && choiceNumber2 <= 4 ){
                        MenuItems selectedItem3 = menus.get(choiceNumber1-1).getMenuItemList().get(choiceNumber2 -1);
                        System.out.println(selectedItem3.getName()+"을 선택하셨습니다.");
                    } else if ( choiceNumber2 == 0 ){
                        throw new BackToMainMenuException("뒤로가기");
                    } else {
                        throw new NumberFormatException("1~만");
                    }
                } else if ( choiceNumber1 == 0 ){
                    throw new ExitKioskException("종료");
                } else if (choiceNumber1 < 0 || choiceNumber1> 3) {
                    throw new InputMismatchException("1~4가 아닌입력");
                } else {
                    throw new NumberFormatException("올바른숫자");
                }
            } catch (BackToMainMenuException e){
                System.out.println("뒤로가기");
                scan.nextLine();
                continue;
            } catch (ExitKioskException e){
                System.out.println("키오스크를 종료합니다");
                break;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자입니다 1~4사이의 숫자를 입력해주세요");
                scan.nextLine();
            } catch(InputMismatchException e){
                System.out.println("1~3의 숫자를 입력해주세요.");
                scan.nextLine();
                scan.nextLine();
            } catch (IndexOutOfBoundsException e){
                System.out.println("범위오류입니다");
                scan.nextLine();
            }
        }
    }//메뉴추가
    public void addMenu(Menu menu){
        menus.add(menu);
    }//추가됐는지 확인용메서드
    public void printMenus(){
        for(Menu menu :menus){
            System.out.println(menu);
        }
    }
    //menus의 메뉴이름확인
    public void printMenuName(int index){
        menus.get(index).printMenuName();
    }//뒤로가기포멧
    public void backFormat(){
        String exit = "0은 뒤로가기";
        System.out.println(String.format("%17s",exit));
    }
}