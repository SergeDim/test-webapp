package testgroup.junit;

import static org.junit.Assert.*;

import org.junit.*;

import testgroup.Vehicle;

public class VechileRegNoTest
{
    private Vehicle vehicle;
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before VechileRegNoTest.class");
    }
 
    @AfterClass
    public  static void afterClass() {
        System.out.println("After VechileRegNoTest.class");
    }
 
    @Before
    public void initTest() {
        vehicle = new Vehicle();
    }
 
    @After
    public void afterTest() {
        vehicle = null;
    }
 
    @Test
    public void testSetRegNo() throws Exception
    {
    	String n="STLM8888";
    	vehicle.setRegNo(n);
        assertEquals(vehicle.getRegNo(), n);
    }
}
