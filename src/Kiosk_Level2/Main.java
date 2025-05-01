package Kiosk_Level2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunnig = true;
        List<MenuItem> menuItems = new ArrayList<>();
        List<MenuItem> saveItems = new ArrayList<>();//선택한 인스턴스를 출력하기위한 리스트
        Scanner scan = new Scanner(System.in);

        MenuItem potato =new MenuItem("감자튀김", 5000, "국내산 감자튀김");
        MenuItem cheesePotato =new MenuItem("치즈감자튀김", 5000, "치즈가 토핑 감자튀김");
        MenuItem hamburger = new MenuItem("기본햄버거", 8000, "미국산 소고기버거");
        MenuItem cheeseBurger = new MenuItem("치즈버거", 8000, "치즈가 듬뿍 들어간 햄버거");
        MenuItem spicyBurger = new MenuItem("불닭버거", 8000, "불닭소스가 들어간 햄버거");
        MenuItem coke = new MenuItem("콜라", 8000, "시원한 콜라");
        MenuItem zeroCoke = new MenuItem("제로콜라", 8000, "살안찌는 콜라");

        menuItems.add(potato);
        menuItems.add(cheesePotato);
        menuItems.add(hamburger);
        menuItems.add(cheeseBurger);
        menuItems.add(spicyBurger);
        menuItems.add(coke);
        menuItems.add(zeroCoke);

        //아이템의 인덱스와 정보 출력
        for(MenuItem a : menuItems){
            System.out.print((menuItems.indexOf(a)+1)+ " : " );
            System.out.println(a);
        }

        while (isRunnig) {
            try {
                System.out.println("원하는 메뉴를 선택하세요. 0은 종료");
                int choiceNumber = scan.nextInt();
                scan.nextLine();
                if(choiceNumber == 0){
                    isRunnig=false;
                    break;// outofboundException이 안뜨도록 바로 탈출
                }
                System.out.println(choiceNumber+" 번을 선택하셨습니다. ");
                // 입력받은 정보를 인덱스에 넣어 인스턴스로 변환후 savelist에 추가
                MenuItem saveNumber = menuItems.get(choiceNumber-1);
                saveItems.add(saveNumber);

            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다. 숫자를 입력해주세요.");
                scan.nextLine();//catch문에서 개행문자제거
            } catch (IndexOutOfBoundsException e){
                System.out.println("잘못된 숫자 입니다. 1~7사이의 숫자를 입력해주세요.");
                //IndexOutOfBoundsException 발생 시 처리 음수, 리스트크기보다 큰수면 오류발생
            }
        }
        System.out.println("선택한 음식 목록 입니다.");
        for(MenuItem a : saveItems){
            System.out.println(a);
        }
    }
}