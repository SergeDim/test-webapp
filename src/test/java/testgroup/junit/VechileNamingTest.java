package testgroup.junit;

import static org.junit.Assert.*;

import org.junit.*;

import testgroup.Vehicle;

public class VechileNamingTest
{
    private Vehicle vehicle;
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before VechileNamingTest.class");
    }
 
    @AfterClass
    public  static void afterClass() {
        System.out.println("After VechileNamingTest.class");
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
    public void testToString() throws Exception
    {
    	String n="VOLVO", r="STLM600";
    	vehicle.setName(n);
    	vehicle.setRegNo(r);
        assertEquals(n+"/"+r, vehicle.toString());
    }

    @Test
    public void testSetName() throws Exception
    {
    	String n="VOLVO1";
    	vehicle.setName(n);
        assertEquals("VOLVO2", n);
    }
}
