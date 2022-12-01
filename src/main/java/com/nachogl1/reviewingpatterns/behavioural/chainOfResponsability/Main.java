package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers.Handler;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers.RoleCheckerHandler;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers.UserExistsHandler;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers.ValidPasswordHandler;

public class Main {

    public static void main(String[] args) {

        DatabaseConnection con = new DatabaseConnection();

        Handler handler = new UserExistsHandler(con);
        handler.cycleHandler(new ValidPasswordHandler(con)).cycleHandler(new RoleCheckerHandler(con));

        AuthService service = new AuthService(handler);
        if (service.login("Nacho", "12345Unsafe")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login was unsuccessful");
        }
    }
}
