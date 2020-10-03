package basics;

import basics.Board;
import basics.Ttt;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TttTest {

    private static final char PLAYER1 = 'X';
    private static Ttt t = new Ttt();
//    private static TttSolution t = new TttSolution();

    @Test
    public void testR0() {
        Board b = new Board();
        b.setMove(0, 0, PLAYER1);
        b.setMove(0, 1, PLAYER1);
        b.setMove(0, 2, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testR1() {
        Board b = new Board();
        b.setMove(1, 0, PLAYER1);
        b.setMove(1, 1, PLAYER1);
        b.setMove(1, 2, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testR2() {
        Board b = new Board();
        b.setMove(2, 0, PLAYER1);
        b.setMove(2, 1, PLAYER1);
        b.setMove(2, 2, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testC0() {
        Board b = new Board();
        b.setMove(0, 0, PLAYER1);
        b.setMove(1, 0, PLAYER1);
        b.setMove(2, 0, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testC1() {
        Board b = new Board();
        b.setMove(0, 1, PLAYER1);
        b.setMove(1, 1, PLAYER1);
        b.setMove(2, 1, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testC2() {
        Board b = new Board();
        b.setMove(0, 2, PLAYER1);
        b.setMove(1, 2, PLAYER1);
        b.setMove(2, 2, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testD1() {
        Board b = new Board();
        b.setMove(0, 0, PLAYER1);
        b.setMove(1, 1, PLAYER1);
        b.setMove(2, 2, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testD2() {
        Board b = new Board();
        b.setMove(0, 2, PLAYER1);
        b.setMove(1, 1, PLAYER1);
        b.setMove(2, 0, PLAYER1);
        assertTrue(t.isVictory(b, PLAYER1));
    }

    @Test
    public void testFail() {
        Board b = new Board();
        b.setMove(0, 2, PLAYER1);
        b.setMove(1, 1, PLAYER1);
        b.setMove(2, 2, PLAYER1);
        assertFalse(t.isVictory(b, PLAYER1));
    }
}
