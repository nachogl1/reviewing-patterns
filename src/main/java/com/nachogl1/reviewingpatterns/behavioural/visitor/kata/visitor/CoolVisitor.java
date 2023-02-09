package com.nachogl1.reviewingpatterns.behavioural.visitor.kata.visitor;

import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client.IndividualClient;
import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client.InternationalEntity;
import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client.PrivateInstitution;
import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client.PublicInstitution;

public interface CoolVisitor {
    void visit(IndividualClient individualClient);

    void visit(PrivateInstitution privateInstitution);

    void visit(PublicInstitution publicInstitution);

    void visit(InternationalEntity internationalEntity);
}
