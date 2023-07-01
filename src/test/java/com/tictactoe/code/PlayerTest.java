package com.tictactoe.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("pradeep", MarkType.X);
    }

    @Test
    public void testPlayerCreation() {
        assertEquals("pradeep", player.getName());
        assertEquals(MarkType.X, player.getMark());
    }
}