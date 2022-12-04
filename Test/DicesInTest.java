import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DicesInTest {
    DicesIn dicesIn = new DicesIn();

    @Test
    void getDicesArray() {
        int size = dicesIn.getDicesArray().size();
        // check if the array contains six elements:
        assertEquals(6, size);
        Dice dice_01 = dicesIn.getDicesArray().get(0);
        // check if an entity in the array is of class "Dice"
        assertEquals(Dice.class, dicesIn.getDicesArray().get(0).getClass());
    }

    @Test
    void getDies() {
        dicesIn.getDies();
        for (int i : dicesIn.getDies()){
            assertEquals(0, i);
        }
    }

    @Test
    void throwDices() {
        // By creating a new dice, the die is set to 0 (i.e. undefined) by default.
        ArrayList<Integer> diesArrayOne = new ArrayList<Integer>();
        ArrayList<Integer> diesArrayTwo = new ArrayList<Integer>();
        diesArrayOne = dicesIn.getDies();
        dicesIn.throwDices();
        // The dies should change to a number between 1 and 6 and thus not be indifferent to the first array of dies.
        diesArrayTwo = dicesIn.getDies();
        assertNotEquals(diesArrayTwo, diesArrayOne);
    }

    @Test
    void contains() {
        ArrayList<Integer> diesArray = new ArrayList<Integer>();
        diesArray = dicesIn.getDies();
        for (int i = 0; i < 6; i++){
            if(diesArray.contains(i)){
                assertEquals(Boolean.TRUE, dicesIn.contains(i));
            }
            else {
                assertEquals(Boolean.FALSE, dicesIn.contains(i));
            }
        }

    }


    @Test
    void count() {
        assertEquals(6, dicesIn.count(0) );
    }

    @Test
    void moveOut() {
    }
}