/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setMessage method, of class Message.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        Message instance = new Message();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Message instance = new Message();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class Message.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        Message instance = new Message();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Message.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Message instance = new Message();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHash method, of class Message.
     */
    @Test
    public void testSetHash() {
        System.out.println("setHash");
        int hash = 0;
        Message instance = new Message();
        instance.setHash(hash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHash method, of class Message.
     */
    @Test
    public void testGetHash() {
        System.out.println("getHash");
        Message instance = new Message();
        int expResult = 0;
        int result = instance.getHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limitString method, of class Message.
     */
    @Test
    public void testLimitString() {
        System.out.println("limitString");
        String text = "";
        String expResult = "";
        String result = Message.limitString(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateUniqueID method, of class Message.
     */
    @Test
    public void testGenerateUniqueID() {
        System.out.println("generateUniqueID");
        String expResult = "";
        String result = Message.generateUniqueID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessegeID method, of class Message.
     */
    @Test
    public void testCheckMessegeID() {
        System.out.println("checkMessegeID");
        String message = "";
        String expResult = "";
        String result = Message.checkMessegeID(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String cel = "";
        Message instance = new Message();
        boolean expResult = false;
        boolean result = instance.checkRecipientCell(cel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageId = "";
        int messageNumber = 0;
        String messageText = "";
        String expResult = "";
        String result = Message.createMessageHash(messageId, messageNumber, messageText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SentMesage method, of class Message.
     */
    @Test
    public void testSentMesage() {
        System.out.println("SentMesage");
        String expResult = "";
        String result = Message.SentMesage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaildateMessage method, of class Message.
     */
    @Test
    public void testVaildateMessage() {
        System.out.println("vaildateMessage");
        String id = "";
        boolean expResult = false;
        boolean result = Message.vaildateMessage(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Message instance = new Message();
        instance.storeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
