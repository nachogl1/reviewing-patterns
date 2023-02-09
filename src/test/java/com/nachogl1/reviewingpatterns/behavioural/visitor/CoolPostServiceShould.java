package com.nachogl1.reviewingpatterns.behavioural.visitor;

import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client.*;
import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.plugins.MessageService;
import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.visitor.CoolMessageVisitorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoolPostServiceShould {

    private MessageService messageServiceMock;
    private CoolMessageVisitorService service;

    @BeforeEach
    void setUp() {
        messageServiceMock = mock(MessageService.class);
        service = new CoolMessageVisitorService(messageServiceMock);
    }

    @Test
    void sendCorrectMessageToIndividual() {
        String testClientName = "John Danaher";
        CoolClient individual = new IndividualClient(testClientName);

        List<CoolClient> clients = Arrays.asList(individual);
        service.sendMessageToClients(clients);

        String expectedResult = String.format("Dear %s, We hope you and your family are enjoying your holidays," +
                " this is a %d%% discount coupon", testClientName, Discounts.INDIVIDUALS.getDiscount());
        verify(messageServiceMock).send(expectedResult);
    }

    @Test
    void sendCorrectMessageToPrivateInstitution() {
        String testClientName = "Metals Company Co";
        CoolClient individual = new PrivateInstitution(testClientName);

        List<CoolClient> clients = Arrays.asList(individual);
        service.sendMessageToClients(clients);

        String expectedResult = String.format("Dear %s, You have been a loyal client of this service," +
                " and we want to award you with this %d%% discount coupon", testClientName, Discounts.PRIVATE_INSTITUTION.getDiscount());
        verify(messageServiceMock).send(expectedResult);
    }

    @Test
    void sendCorrectMessageToPublicInstitution() {
        String testClientName = "Country Administration";
        CoolClient individual = new PublicInstitution(testClientName);

        List<CoolClient> clients = Arrays.asList(individual);
        service.sendMessageToClients(clients);

        String expectedResult = String.format("Dear %s, please find kindly attached a %d%% discount coupon", testClientName, Discounts.PUBLIC_INSTITUTION.getDiscount());
        verify(messageServiceMock).send(expectedResult);
    }

    @Test
    void sendCorrectMessageToInternationalEntity() {
        String testClientName = "USA Administration";
        CoolClient individual = new InternationalEntity(testClientName);

        List<CoolClient> clients = Arrays.asList(individual);
        service.sendMessageToClients(clients);

        String expectedResult = String.format("Dear %s, thanks for trusting our services. " +
                "This is a %d%% discount coupon on your next purchase", testClientName, Discounts.INTERNATIONAL_ENTITY.getDiscount());
        verify(messageServiceMock).send(expectedResult);
    }
}
