package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialmedia.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User john = new Millenials("John");
        User henry = new YGeneration("Henry");
        User floyd = new ZGeneration("Floyd");

        //When
        String johnShare = john.sharePost();
        System.out.println("John uses " + johnShare);
        String henryShare = henry.sharePost();
        System.out.println("Henry uses " + henryShare);
        String floydShare = floyd.sharePost();
        System.out.println("Floyd uses " + floydShare);

        //Then
        assertEquals("Facebook Publisher", johnShare);
        assertEquals("Snapchat Publisher", henryShare);
        assertEquals("Twitter Publisher", floydShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");

        //When
        String johnShare = john.sharePost();
        System.out.println("John uses " + johnShare);
        john.setSocialPublisher(new TwitterPublisher());
        johnShare = john.sharePost();
        System.out.println("John uses " + johnShare);

        //Then
        assertEquals("Twitter Publisher", johnShare);
    }
}