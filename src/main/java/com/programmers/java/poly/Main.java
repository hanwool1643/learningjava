package com.programmers.java.poly;

public class Main {
    public static void main(String[] args) {
        new Main().run(LoginType.Naver);
    }

    void run(LoginType loginType) {
        Login user = getLogin(loginType);
        //interface type을 사용하여 loginType에 들어오는 arg에 따라 결과값 달라짐. 특정 class와 결합 X
        user.login();
    }
    private Login getLogin(LoginType loginType) {
        if(loginType==LoginType.Kakao) return new KakaoLogin();
        return new NaverLogin();
    }
}
