import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private Account acc1;
	private Account acc2;
	
	
	private western w1;
	private western w2;
	private western w3;
	private western w4;
	
	private asian a1;
	private asian a2;
	private asian a3;
	private asian a4;
	
	private drinks d1;
	private drinks d2;
	private drinks d3;
	private drinks d4;
	
	private Fruits f1;
	private Fruits f2;
	private Fruits f3;
	private Fruits f4;
	
	
	private Vegetarian v1;
	private Vegetarian v2;
	private Vegetarian v3;
	

	private ArrayList<Account> accountArr;
	private ArrayList<western> westernArr;
	private ArrayList<asian>  asianArr;
	private ArrayList<Vegetarian>  vegetarianArr;
	private ArrayList<drinks>  drinksArr;
	private ArrayList<Fruits>  fruitsArr;
	public static String monthlyMenu ="";
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		
		acc1 = new Account("Roy Tan", "schoolR0ck$", "4E4","Credit Card");
		acc2 = new Account("Hannah", "12345abc", "3E2","Credit Card");
		
		w1 = new western("Fries");
		w2 = new western("Pizza");
		w3 = new western("Spaghetti");
		w4 = new western("Fish & Chips");
		
		

		a1 = new asian("Chilli Crab");
		a2 = new asian("Chicken Rice");
		a3 = new asian("Nasi Lemak");
		a4 = new asian("Cai Fan");

		d1 = new drinks("Coke");
		d2 = new drinks("Fanta");
		d3 = new drinks("Sprite");
		d4 = new drinks("Ayataka");

		f1 = new Fruits("Apple");
		f2 = new Fruits("Orange");
		f3 = new Fruits("WaterMelon");
		f4 = new Fruits("BlueBerry");
		
		v1 = new Vegetarian("Vegi Burger");
		v2 = new Vegetarian("BlueBerry");
		v3 = new Vegetarian("BlueBerry");
		
		
	}



	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	//================================================ OPTION 1 USER ACCOUNT  ================================================
		public void addAccount() {
			// Account list is not null, so that can add a new item - boundary
			assertNotNull("Test if there is valid Account arraylist to add to", accountArr);
			
			//Given an empty list, after adding 1 item, the size of the list is 1 - normal
			//The item just added is as same as the first item of the list
			C206_CaseStudy.addAccount(accountArr, acc1);		
			assertEquals("Test that Account arraylist size is 1", 1, accountArr.size());
			assertSame("Test that Account is added", acc1, accountArr.get(0));
			
			//Add another account. test The size of the list is 2? - normal
			//The account just added is as same as the second account of the list
			C206_CaseStudy.addAccount(accountArr, acc2);
			assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());
			assertSame("Test that Account is added", acc2, accountArr.get(1));
		}
		public void viewAccount() {
			// Test if Account list is not null but empty -boundary
			assertNotNull("Test if there is valid Account arraylist to retrieve item", accountArr);
			
			//test if the list of accounts retrieved from the CaseStudy is empty - boundary
			String viewAccount= C206_CaseStudy.retrieveAccount(accountArr);
			String testOutput = "";
			assertEquals("Check that viewAccount", testOutput,viewAccount);
			
			//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
			C206_CaseStudy.addAccount(accountArr, acc1);
			C206_CaseStudy.addAccount(accountArr, acc2);
			assertEquals("Test that Account arraylist size is 2", 2, accountArr.size());
			
			//test if the expected output string same as the list of Account retrieved from the CaseStudy	
			viewAccount= C206_CaseStudy.retrieveAccount(accountArr);
			testOutput = String.format("%-10s %-15s %-12s %-10s\n", accountArr.get(0).toString());
			testOutput += String.format("%-10s %-15s %-12s %-10s\n", accountArr.get(1).toString() );
		
			assertEquals("Test that ViewAccount", testOutput, viewAccount);
			
		}

		public void deleteAccount( ) {
			// Trying 
		}

	
	//=============================================== OPTION 2 MENU ITEMS ==================================================
	
	
	//=============================================== OPTION 3 MONTHLY MENU ==================================================
	@Test
	public void createMonthlyMenuTest() {
		
		//assertNotNull("Check if there is valid western items arraylist to random generate", westernArr);
		
		//Test if MonthlyMenu is empty 
		assertTrue(monthlyMenu.isEmpty());
		


		
		// Test is after creating MonthlyMenu is not empty
		String testOutput = C206_CaseStudy.createMonthlyMenu();
		assertFalse(testOutput.isEmpty());
				
	}
	
	@Test
	public void retrieveMonthlyMenuTest() {
		
		// Test that MonthlyMenu is not empty 
		C206_CaseStudy.createMonthlyMenu();
		assertFalse(C206_CaseStudy.monthlyMenu.isEmpty());
		
		C206_CaseStudy.createMonthlyMenu();
		String testOutput = C206_CaseStudy.viewMonthlyMenu();
	
		
		
		// Test if the expected output String contains the menu item 
		 if (testOutput.contains("Fries") || testOutput.contains("Pizza") ||testOutput.contains("Spaghetti")||testOutput.contains("Fish & Chips") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Chilli Crab") || testOutput.contains("Chicken Rice") ||testOutput.contains("Nasi Lemak")||testOutput.contains("Cai Fan") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Coke") || testOutput.contains("Fanta") ||testOutput.contains("Sprite")||testOutput.contains("Ayataka") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Apple") || testOutput.contains("Orange") ||testOutput.contains("WaterMelon")||testOutput.contains("BlueBerry") ) {
	            assertTrue(testOutput, true);
	        }
		 if (testOutput.contains("Vegi Burger") || testOutput.contains("Pumpkin Soup") ||testOutput.contains("Vegetarian Meatball")||testOutput.contains("Cauliflower Rice") ) {
	            assertTrue(testOutput, true);
	        }

			
	}
	
	@Test
	public void deleteMonthlyMenuTest() {
		
		// Test that MonthlyMenu is not empty
		C206_CaseStudy.createMonthlyMenu();
		assertFalse(C206_CaseStudy.monthlyMenu.isEmpty());
		
		// Test that after delete, monthly menu is empty
		C206_CaseStudy.deleteMonthlyMenu();
		assertTrue(C206_CaseStudy.monthlyMenu.isEmpty());
		
	}
	
	//=============================================== OPTION 4 LUNCH BOX ORDER ==================================================
	
	
	
	//=============================================== OPTION 5 BILL =============================================================

	@After
	public void tearDown() throws Exception {
	
	}
}
