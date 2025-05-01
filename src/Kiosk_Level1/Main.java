package Kiosk_Level1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println(" [ SHAKESHACK MENU ]");
        while(isRunning){
            try {
                System.out.println("원하는 항목의 번호를 입력하세요 \n1 ShackBurger, 2 SmokeShack, 3 Cheeseburger, 4 Hamburger, 0은종료");
                int check = scan.nextInt();
                scan.nextLine();
                switch(check){
                    case 1-> System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    case 2-> System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    case 3-> System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    case 4-> System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    case 0 -> {
                        System.out.println("0. 종료 ");
                        return;
                    }
                    //요구사항
                    case 5 ->{
                        System.out.println("[ SHAKESHACK MENU ]\n" +
                                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                                "0. 종료      | 종료\n" +
                                "0 <- // 0을 입력\n" +
                                "\n" +
                                "프로그램을 종료합니다.");
                        return;
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("정확한 숫자를 입력해주세요");
                scan.nextLine();
            }
        }
    }

}