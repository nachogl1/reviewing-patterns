package com.nachogl1.reviewingpatterns.behavioural.visitor.kata.visitor;

import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client.*;
import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.plugins.MessageService;

import java.util.List;

public class CoolMessageVisitorService implements CoolVisitor {

    private final MessageService display;

    public CoolMessageVisitorService(MessageService display) {
        this.display = display;
    }

    public void sendMessageToClients(List<CoolClient> clients) {
        clients.forEach(client -> client.accept(this));
    }

    @Override
    public void visit(IndividualClient individualClient) {
        String message = String.format("Dear %s, We hope you and your family are enjoying your " +
                "holidays, this is a %d%% discount coupon", individualClient.name(), Discounts.INDIVIDUALS.getDiscount());
        this.display.send(message);
    }

    @Override
    public void visit(PrivateInstitution privateInstitution) {
        String message = String.format("Dear %s, You have been a loyal client of this service, and we want to award you with this %d%% discount coupon", privateInstitution.name(), Discounts.PRIVATE_INSTITUTION.getDiscount());
        this.display.send(message);
    }

    @Override
    public void visit(PublicInstitution publicInstitution) {
        String message = String.format("Dear %s, please find kindly attached a %d%% discount coupon", publicInstitution.name(), Discounts.PUBLIC_INSTITUTION.getDiscount());
        this.display.send(message);
    }

    @Override
    public void visit(InternationalEntity internationalEntity) {
        String message = String.format("Dear %s, thanks for trusting our services. This is a %d%% discount coupon on your next purchase", internationalEntity.name(), Discounts.INTERNATIONAL_ENTITY.getDiscount());
        this.display.send(message);
    }


}
