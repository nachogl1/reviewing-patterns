package com.nachogl1.reviewingpatterns.behavioural.state.kata;

import com.nachogl1.reviewingpatterns.behavioural.state.kata.CoolRover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoolRoverShould {

    private CoolRover rover;

    @BeforeEach
    void setUp() {
        rover = new CoolRover();
    }

    @Test
    void startFacingNorth(){
        assertEquals(rover.getDirectionName(),"NORTH");
    }

    @Test
    void ifTurnRightFaceEast(){
        rover.turnRight();
        assertEquals(rover.getDirectionName(),"EAST");
    }

    @Test
    void ifTurnLeftFacesWest(){
        rover.turnLeft();
        assertEquals(rover.getDirectionName(),"WEST");
    }

    @Test
    void ifTurnRightRightRightLeftRightRightFacesNorth(){
        rover.turnRight();
        rover.turnRight();
        rover.turnRight();
        rover.turnLeft();
        rover.turnRight();
        rover.turnRight();
        assertEquals(rover.getDirectionName(),"NORTH");
    }
}
