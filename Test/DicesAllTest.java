import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DicesAllTest {
    DicesAll dicesAll = new DicesAll();

    @Test
    void getDicesArray() {
        int size = dicesAll.getDicesArray().size();
        // check if the array contains six elements:
        assertEquals(6, size);
        Dice dice_01 = dicesAll.getDicesArray().get(0);
        // check if an entity in the array is of class "Dice"
        assertEquals(Dice.class, dicesAll.getDicesArray().get(0).getClass());
    }

    @Test
    void getDies() {
        dicesAll.getDies();
        for (int i : dicesAll.getDies()){
            assertEquals(0, i);
        }
    }

    @Test
    void throwDices() {
        // By creating a new dice, the die is set to 0 (i.e. undefined) by default.
        ArrayList<Integer> diesArrayOne = new ArrayList<Integer>();
        ArrayList<Integer> diesArrayTwo = new ArrayList<Integer>();
        diesArrayOne = dicesAll.getDies();
        dicesAll.throwDices();
        // The dies should change to a number between 1 and 6 and thus not be indifferent to the first array of dies.
        diesArrayTwo = dicesAll.getDies();
        assertNotEquals(diesArrayTwo, diesArrayOne);
    }

    @Test
    void contains() {
        ArrayList<Integer> diesArray = new ArrayList<Integer>();
        diesArray = dicesAll.getDies();
        for (int i = 0; i < 6; i++){
            if(diesArray.contains(i)){
                assertEquals(Boolean.TRUE, dicesAll.contains(i));
            }
            else {
                assertEquals(Boolean.FALSE, dicesAll.contains(i));
            }
        }

    }


    @Test
    void count() {
        assertEquals(6, dicesAll.count(0) );
    }

    @Test
    void moveOut() {
    }

    @Test
    void tutto() {
        assertEquals(6, dicesAll.dicesOut.getDies().size());
    }

    @Test
    void straight() {
        int[] straightArray = {1,2,3,4,5,6};

        assertEquals(Boolean.TRUE, dicesAll.contains(straightArray));
    }
}