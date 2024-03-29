import java.util.Random;

public class ex15 {
    public static void main(String[] args) {
        //조건문 - switch문
        //패턴
        //     정수,문자,문자열
        int a = 10;
        switch ( a ) {
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("그외의 값");
                break;
        }
        int a2 = 11;
        switch ( a2 ) {
            case 9:
            case 10:
                System.out.println("9 or 10");
                break;
            default:
                System.out.println("그외의 값");
                break;
        }
        //연습문제 - switch문 연습
        //1.
        //애완견 똘이를 기쁘게 해줄 애완용 로봇을 프로그램해보자.
        // 코드 0를 입력하면 "음악을 틀어준다."콘솔 출력
        // 코드 1 : 간식을 준다.
        // 코드 2 : 주인의 영상을 틀어준다.
        // 코드 3 : 산책을 시켜준다.
        // 그외의 코드 : 잘못된 코드입니다. 출력
        //랜덤수(코드)를 0~5까지 발생시켜, 코드에 맞는 출력문을
        //작성하시오.
        Random rand = new Random();
        int code = rand.nextInt(6); //0~5
        switch (code) {
            case 0:
                System.out.println("음악을 틀어준다");
                break;
            case 1:
                System.out.println("간식을 준다");
                break;
            case 2:
                System.out.println("주인의 영상을 틀어준다");
                break;
            case 3:
                System.out.println("산책을 시켜준다");
                break;
            default:
                System.out.println("잘못된 코드입니다");
                break;
        }
        //2.
        //달을 나타내는 랜덤수 1~12까지의 정수를 발생시켜,
        //3,4,5이면 봄
        //6,7,8이면 여름
        //9,10,11이면 가을
        //12,1,2이면 겨울 이라고 출력하시오.
        int month = rand.nextInt( 12 ) + 1;
        switch ( month ) {
            //break문이 없으면, 아래 case로 흘러간다.
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6, 7, 8: //Java 14버전부터 가능함. 주의!
                System.out.println("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울입니다.");
                break;
            default:
                System.out.println("그외의 달입니다.");
                break;
        }

    }
}
