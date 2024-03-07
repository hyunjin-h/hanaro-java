public class ex03 {
    // 데이터 타입(자료형)
    public static void main(String[] args) {
        // 기본자료형 8개
        // 정수형: int(4) long(8) short(2) byte(1)
        // 실수형: float(4) double(8)
        // 논리형: boolean(1)
        // 문자형: char(2) => 내부적으로는 숫자형

        int myInt = 10;
        System.out.println(myInt);
        long myLong = 20L; // L long 리터럴로 초기화, 소문자는 헷갈릴 수 있다~
        System.out.println(myLong);
        short myShort = 30;
        System.out.println(myShort);
        byte myByte = 40;
        System.out.println(myByte);


        // 실수형
        // float 4
        float myFloat = 6.14f; // float 리터럴 초기화
        double myDouble = 3.14d;// double 리터럴 초기화
        System.out.println(myFloat);
        System.out.println(myDouble);


        // 논리형 boolean
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // 문자형 char
        // 문자 저장방식: 문자값,정수값 -> 유니코드표 -> 메모리에 저장
        char myChar1 = 'a';
        char myChar2 = '가';
        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println((int) myChar1);
        System.out.println((int) myChar2);
        System.out.println("ASCII: " + (char) 65);
        System.out.println("Uni: " + (char) 0xAc00);


        // 참조자료형: 문자열, 배열, 클래스(객체), 열거형
        // 문자열
        String myString = "문자열";
        String myString2 = new String("문자열2");
        System.out.println(myString);
        System.out.println(myString2);

        // 배열


    }
}
