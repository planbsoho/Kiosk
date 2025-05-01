package Kiosk_Level4;

public class BackToMainMenuException extends Exception{
    public BackToMainMenuException(String message){
        super(message);
    }
    //0을눌렀을때 뒤로가기 예외처리를 IndexOutOfBoundsException과 구분하기위해 생성
}
