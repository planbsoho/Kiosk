package Kiosk_Level4;

public class ExitKioskException extends Exception{
    public ExitKioskException(String message){
        super(message);
    }
    //0을 눌렀을때 종료하기 예외처리를 IndexOutOfBoundsException과 구분하기위해 생성
}