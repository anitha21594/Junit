package org.hotel;

import java.util.Date;

import org.base.BaseClass1;
import org.base.LoginPage1;
import org.base.LoginPage2;
import org.base.LoginPage3;
import org.base.LoginPage4;
import org.base.LoginPage5;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Hotel extends BaseClass1 {
	
	@BeforeClass
	public static void beforeclass() {
		chromelaunch();
		wait(10);
	}
	@AfterClass
	public static void afterclass() {
		quit();
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("before..."+d);
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("after..."+d);
	}
	@Test
	public void test1() {
		LoginPage1 a=new LoginPage1();
		url("https://adactinhotelapp.com/");
		sendkeys(a.getUser(),"anitha94");
		sendkeys(a.getPass(),"012345");
		click(a.getBtn());
		LoginPage2 b=new LoginPage2();
		SelByIndex(b.getLoc(),4);
		SelByIndex(b.getHotel(),2);
		SelByIndex(b.getRoom(),1);
		SelByIndex(b.getNo(),2);
		sendkeys(b.getDateIn(),"26/12/2023");
		sendkeys(b.getDateOut(),"30/12/2023");
		SelByIndex(b.getAdult(),2);
		SelByIndex(b.getChild(),2);
		click(b.getSrch());
		LoginPage3 c= new LoginPage3();
		click(c.getSelect());
		click(c.getConti());
		LoginPage4 d=new LoginPage4();
		sendkeys(d.getName1(),"anitha");
		sendkeys(d.getName2(),"kanna");
		sendkeys(d.getAdd(),"32,walltaxroad pallikaranai,chennai600042.");
		sendkeys(d.getCardno(),"7240123478951234");
		SelByIndex(d.getCardtype(),2);
		SelByIndex(d.getExpMonth(),5);
		SelByIndex(d.getExpYear(),6);
		sendkeys(d.getCvv(),"678");
		click(d.getBook());
		String s= getAttribute(d.getOrderno());
		System.out.println(s);

		}
		@Test
		public void test2() {
			LoginPage1 a=new LoginPage1();
			url("https://adactinhotelapp.com/");
			sendkeys(a.getUser(),"anitha94");
			sendkeys(a.getPass(),"012345");
			click(a.getBtn());
			LoginPage2 b=new LoginPage2() ;
			SelByValue(b.getLoc(),"Sydney");
			SelByValue(b.getHotel(),"Hotel Hervey");
			SelByValue(b.getRoom(),"Super Deluxe");
			SelByValue(b.getNo(),"3");
			sendkeys(b.getDateIn(),"27/12/2023");
			sendkeys(b.getDateOut(),"31/12/2023");
			SelByIndex(b.getAdult(),2);
			SelByIndex(b.getChild(),2);
			click(b.getSrch());
			LoginPage3 c=new LoginPage3() ;
			click(c.getSelect());
			click(c.getConti());
			LoginPage4 d=new LoginPage4();
			sendkeys(d.getName1(),"anitha");
			sendkeys(d.getName2(),"kanna");
			sendkeys(d.getAdd(),"32 walltax road choolai,chennai600023");
			sendkeys(d.getCardno(),"1234567890123456");
			SelByIndex(d.getCardtype(),2);
			SelByIndex(d.getExpMonth(),5);
			SelByIndex(d.getExpYear(),6);
			sendkeys(d.getCvv(),"678");
			click(d.getBook());
			String s= getAttribute(d.getOrderno());
			System.out.println(s);
           LoginPage5 e=new LoginPage5() ;
           click(e.getHistory());
           click(e.getLastorder());
           click(e.getCancel());
           simpleAlert();
           screenshot("C:\\Users\\User\\eclipse-workspace\\junit.Hotel\\src\\test\\java\\org\\hotel\\proof.png");
			
			
		}

	}
	


