package com.programmers.java.poly;

public class UserService implements Login {

    private Login login;
    //의존성을 외부에 맡기어 의존성을 낮춘다.
    //의존성 주입받음(Dependency Injection, DI)
    //구상체와 겹합하면 의존성 높아짐, 추상체와 결합 시 의존성 낮아짐
    public UserService(Login login) {
        this.login = login;
    }

    @Override
    public void login() {
        login.login();
    }
}
