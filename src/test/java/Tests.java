import org.example.Elf;
import org.example.Main;
import org.example.Warrior;
import org.example.Wizard;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

public class Tests {

    @Test
    public void testGetOdds(){

        int n = 7;
        int[] result = Main.getOddsFromOneToN(n);

        for (int i : result) {
            assertNotEquals(0, i % 2);
        }

        assertTrue(result[result.length - 1] <= n);
    }



    @Test
    void testContinue() {
        assertTrue(Main.containsKeyword("If the value is even, the loop will continue to the next iteration."));
        assertFalse(Main.containsKeyword("The loop skips over values that are even."));
    }

    @Test
    void testFor() {
        assertTrue(Main.containsKeyword("Use a for loop to iterate through the array."));
        assertFalse(Main.containsKeyword("A loop is used to traverse the array."));
    }

    @Test
    void testNew() {
        assertTrue(Main.containsKeyword("Create a new object using the constructor."));
        assertFalse(Main.containsKeyword("Instantiate the object with the given parameters."));
    }

    @Test
    void testSwitch() {
        assertTrue(Main.containsKeyword("The switch statement handles multiple conditions."));
        assertFalse(Main.containsKeyword("Use conditional logic to check different values."));
    }


    @Test
    void testBoolean() {
        assertTrue(Main.containsKeyword("The boolean value indicates true or false."));
        assertFalse(Main.containsKeyword("The result can be either yes or no."));
    }

    @Test
    void testBreak() {
        assertTrue(Main.containsKeyword("Use break to exit the loop early."));
        assertFalse(Main.containsKeyword("Stop the loop when the condition is met."));
    }

    @Test
    void testDouble() {
        assertTrue(Main.containsKeyword("The result is stored in a double variable."));
        assertFalse(Main.containsKeyword("The result is stored as a floating-point value."));
    }

    @Test
    void testProtected() {
        assertTrue(Main.containsKeyword("Declare the method as protected for inheritance access."));
        assertFalse(Main.containsKeyword("Allow access to subclasses and the same package."));
    }

    @Test
    void testThrow() {
        assertTrue(Main.containsKeyword("Use throw to raise a custom exception."));
        assertFalse(Main.containsKeyword("Trigger an error when a condition is violated."));
    }



    @Test
    void testPublic() {
        assertTrue(Main.containsKeyword("The class is public and accessible to all."));
        assertFalse(Main.containsKeyword("The method can be accessed from anywhere."));
    }

    @Test
    void testCase() {
        assertTrue(Main.containsKeyword("Each case in the switch checks a different value."));
        assertFalse(Main.containsKeyword("Every condition is handled separately."));
    }

    @Test
    void testCatch() {
        assertTrue(Main.containsKeyword("Use catch to handle exceptions after try."));
        assertFalse(Main.containsKeyword("Trap any errors and process them safely."));
    }

    @Test
    void testExtends() {
        assertTrue(Main.containsKeyword("The class extends another to inherit its behavior."));
        assertFalse(Main.containsKeyword("It builds on another class’s functionality."));
    }

    @Test
    void testShort() {
        assertTrue(Main.containsKeyword("A short is a 16-bit integer type."));
        assertFalse(Main.containsKeyword("Use a small type to store limited-range numbers."));
    }

    @Test
    void testTry() {
        assertTrue(Main.containsKeyword("Wrap risky code in a try block."));
        assertFalse(Main.containsKeyword("Attempt to run code that may fail."));
    }

    @Test
    void testChar() {
        assertTrue(Main.containsKeyword("A char stores a single character."));
        assertFalse(Main.containsKeyword("Use a variable to hold one letter."));
    }

    @Test
    void testFinal() {
        assertTrue(Main.containsKeyword("Declare the variable as final to make it constant."));
        assertFalse(Main.containsKeyword("This value cannot be changed once assigned."));
    }

    @Test
    void testFloat() {
        assertTrue(Main.containsKeyword("Use a float to save decimal values."));
        assertFalse(Main.containsKeyword("A single-precision decimal number is needed."));
    }

    @Test
    void testNative() {
        assertTrue(Main.containsKeyword("native marks a method implemented in another language."));
        assertFalse(Main.containsKeyword("Declare a method that interacts with system code."));
    }

    @Test
    void testWhile() {
        assertTrue(Main.containsKeyword("Keep looping while the condition is true."));
        assertFalse(Main.containsKeyword("Repeat the process until the condition is false."));
    }


    @Test
    public void testDecrementLive() {
        Warrior warrior = new Warrior( 100, 10,5,2);
        warrior.decrementLive();
        assertEquals(4, warrior.getLives());
    }

    @Test
    public void testAttack() {
        Warrior warrior = new Warrior( 100, 10,5,2);
        Wizard wizard = new Wizard( 80, 15, 3, "Fireball");

        warrior.attack(wizard);

        assertEquals(70, wizard.getHealth());

    }

    @Test
    public void testCheckHealth() {
        Elf elf = new Elf( 10, 8, 2, 1);

        elf.setHealth(5);

        elf.checkHealth();

        assertEquals(5, elf.getHealth());

        elf.setHealth(0);

        elf.checkHealth();

        assertEquals(10, elf.getHealth());


    }

    @Test
    public void testConvertToElf() {
        Warrior warrior = new Warrior(100, 10, 5, 2);
        Elf elf = warrior.convertToElf();

        assertNotNull(elf);
        assertEquals(100, elf.getHealth());
        assertEquals(10, elf.getStrength());
        assertEquals(5, elf.getLives());

    }

    @Test
    public void testMockingWizard() {
        Wizard wizard = Mockito.mock(Wizard.class);
        Mockito.when(wizard.castSpell()).thenReturn("Casting Fireball");

        String spell = wizard.castSpell();

        Mockito.verify(wizard, times(1)).castSpell();
        assertEquals("Casting Fireball", spell);
    }

}

