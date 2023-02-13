package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.CoolAuthService;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.DBConn;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers.Handler;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers.RoleCheckerHandler;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers.UserExistsHandler;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers.ValidPasswordHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CoolLoginShould {

    @Test
    void loginUsingOnlyUsername() {
        DBConn dbConn = mock(DBConn.class);
        Handler handler = new UserExistsHandler(dbConn);
        when(dbConn.isValidUser("testUsername")).thenReturn(true);

        CoolAuthService service = new CoolAuthService(handler);

        assertTrue(service.login("testUsername", "testPassword"));
    }

    @Test
    void loginWhenCorrectCredentialsAndAdminRole() {
        DBConn dbConn = mock(DBConn.class);
        Handler handler = new UserExistsHandler(dbConn);
        handler.cycleHandler(new ValidPasswordHandler(dbConn))
                .cycleHandler(new RoleCheckerHandler(dbConn));
        when(dbConn.isValidUser("testUsername")).thenReturn(true);
        when(dbConn.isValidPasswordForUser("testUsername", "testPassword")).thenReturn(true);
        when(dbConn.isUserAdmin("testUsername")).thenReturn(true);

        CoolAuthService service = new CoolAuthService(handler);

        assertTrue(service.login("testUsername", "testPassword"));
    }

    @Test
    void loginWhenCorrectCredentialsForAnyRole() {
        DBConn dbConn = mock(DBConn.class);
        Handler handler = new UserExistsHandler(dbConn);
        handler.cycleHandler(new ValidPasswordHandler(dbConn));
        when(dbConn.isValidUser("testUsername")).thenReturn(true);
        when(dbConn.isValidPasswordForUser("testUsername", "testPassword")).thenReturn(true);

        CoolAuthService service = new CoolAuthService(handler);

        assertTrue(service.login("testUsername", "testPassword"));
    }
}
