package net.renemoser.libjsms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import net.renemoser.libjsms.service.*;

/**
 * Unit test for Orange.
 */
public class OrangeCHTest 
    extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public OrangeCHTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( OrangeCHTest.class );
    }
  
    public void testLoginEmpty() 
    {
	    try {
	    	ShortMessageService Service = new OrangeCH();
    	    Service.doLogin("","");
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
    
    public void testLoginWrong() 
    {
	    try {
	    	ShortMessageService Service = new OrangeCH();
    	    Service.doLogin("unknownUser","wrongPassword");
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
    
    public void testSendMessageEmptyMessage() 
    {
	    try {
	    	ShortMessageService Service = new OrangeCH();
    	    Service.sendShortMessage("0761234567", "");
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
    
    public void testSendMessageMessageTooLong() 
    {
	    try {
	    	ShortMessageService Service = new OrangeCH();
	    	String message = "";
	    	for(int i = 0; i < 145; i++) {
	    		message += "x";
	    	}    	
    	    Service.sendShortMessage("0761234567", message);
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
    
    public void testSendMessagePhoneNumberWrong1() 
    {
	    try {
	    	ShortMessageService Service = new OrangeCH();
    	    Service.sendShortMessage("076 123 45 67", "test message");
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
    
    public void testSendMessagePhoneNumberWrong2() 
    {
	    try {
	    	ShortMessageService Service = new OrangeCH();
    	    Service.sendShortMessage("+41 076 123 45 67", "test message");
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
    
    public void testGetAvailableMessages() {
	    try {
	    	ShortMessageService Service = new OrangeCH();
	    	Service.getAvailableMessages();   
    	    fail("Should have thrown exception");
    	} catch(Exception e) {
    	    
    	}
    }
}