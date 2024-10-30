package stackWithArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStackA {
	StackA <String> aStack ;
	StackA <String> secondStack;

	@BeforeEach
	void setUp() throws Exception {
		aStack = new StackA<String>();
	}

	@Test
	void testStackA() {
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
		assertThrows(StackOverFlowException.class,
				()-> aStack.push("Fraida")
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
	void testIsEmpty() {
		assertTrue(aStack.isEmpty());
		aStack.push("Adina");
		assertFalse(aStack.isEmpty());
	}

	@Test
	void testIsFull() {
		assertTrue(aStack.isEmpty());
		aStack.push("Adina");
		assertFalse(aStack.isEmpty());
		assertFalse (aStack.isFull());
		aStack.push("Batya");
		assertFalse(aStack.isFull());
		aStack.push("Chava");
		assertFalse(aStack.isFull());
		aStack.push("Dina");
		assertFalse(aStack.isFull());
		aStack.push("Eva");
		assertTrue(aStack.isFull());
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
