package com.nachogl1.reviewingpatterns.behavioural.observer.example;

import com.nachogl1.reviewingpatterns.behavioural.observer.example.observers.User;
import com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve.ArgosShop;
import com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve.SansburyShop;
import com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve.SubjectToObserved;
import com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve.TescoShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating virtual shops
        TescoShop tesco = new TescoShop();
        SansburyShop sansbury = new SansburyShop();
        ArgosShop argos = new ArgosShop();

        List<SubjectToObserved> subjects = new ArrayList<>();
        subjects.add(tesco);
        subjects.add(sansbury);
        subjects.add(argos);

        //Creating a subscribed user per virtual shop
        User userSubscribedToTesco = new User(tesco);
        User userSubscribedToSansbury = new User(sansbury);
        User userSubscribedToArgos = new User(argos);

        //Now Iphone 90 arrives to the shops with 75 new cameras. We use the same message for all of them in this example
        subjects.forEach(s->s.updateAll("New Iphone 90 arrived to our shop, it is only 9M quids"));

    }
}
