package stackWithArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStackB2 {
	StackB<String> aStack;
	StackB <String> secondStack;
	
	@BeforeEach
	void setUp() throws Exception {
		aStack = new StackB<String>();
	}

	@Test
	void testStackB() {
        assertTrue(aStack.isEmpty());
		
		assertThrows(NullPointerException.class, 
				()-> secondStack.isEmpty());
	}

	@Test
	void testPush() {
		assertTrue(aStack.isEmpty());
		aStack.push("Adina");
		assertFalse(aStack.isEmpty());
		assertFalse (aStack.isFull());
		assertEquals("Adina",aStack.top());
		aStack.push("Batya");
		aStack.push("Chava");
		aStack.push("Dina");
		aStack.push("Eva");
		assertFalse(aStack.isFull());
		
	}

	@Test
	void testTop() {
		aStack.push("Adina");
		assertEquals("Adina", aStack.top());
		aStack.push("Batya");
		assertEquals("Batya", aStack.top());
		aStack.push("Chava");
		assertEquals("Chava", aStack.top());
		aStack.pop();
		assertEquals("Batya",aStack.top());
		aStack.pop();
		assertEquals("Adina", aStack.top());
		aStack.pop();
		assertThrows (StackUnderFlowException.class,
				()-> aStack.top()
				);
	}

	@Test
	void testPop() {
		aStack.push("Adina");
		assertEquals("Adina", aStack.top());
		aStack.push("Batya");
		assertEquals("Batya", aStack.top());
		aStack.pop();
		assertEquals("Adina", aStack.top());
		aStack.pop();
		assertTrue(aStack.isEmpty());
		assertThrows(StackUnderFlowException.class,
				()-> aStack.top()
				);
	}

	@Test
	void testIsFull() {
		assertFalse(aStack.isFull());
	}

	@Test
	void testIsEmpty() {
		assertTrue(aStack.isEmpty());
		aStack.push("Adina");
		assertFalse(aStack.isEmpty());
	}

	@Test
	void testToString() {
		aStack.push("Adina");
		aStack.push("Batya");
		aStack.push("Chava");
		aStack.push("Dina");
		aStack.push("Eva");
		
		assertEquals("[Eva, Dina, Chava, Batya, Adina]",aStack.toString());
		
	}

}
