package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Check_Controller;
import com.pom.Choosing_Tshirts;
import com.pom.Home_Page;
import com.pom.My_Account;
import com.pom.Order_Check;
import com.pom.Order_Confirm;
import com.pom.Order_Multi_Shipping;
import com.pom.Order_Step1;
import com.pom.Reg_Account;
import com.pom.Shipping;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Home_Page home;
	private My_Account account;
	private Reg_Account acc;
	private Choosing_Tshirts tshirt;
	private Check_Controller check;
	private Order_Check order;
	private Order_Step1 step1;
	private Order_Multi_Shipping multiship;
	private Shipping ship;
	private Order_Confirm confirm;
	
	
	public Home_Page getInstanceHome() {
		if(home==null) {
			home=new Home_Page(driver);
		}
		
		return home;
	}
	
	public My_Account getInstanceAccount() {
		if(account==null) {
			account=new My_Account(driver);
		}
		return account;
			
	}
	
	public Reg_Account getInstanceAcc() {
		if(acc==null) {
			acc=new Reg_Account(driver);
		}
		return acc;
	}
	
	public Choosing_Tshirts getInstanceTshirts() {
		if(tshirt==null) {
			tshirt =new Choosing_Tshirts(driver);
		}
		return tshirt;
	}
	 
	public Check_Controller getInstanceCheck() {
		if(check==null) {
			check=new Check_Controller(driver);
		}
		return check;
	}
	
	public Check_Controller getInstanceOrder() {
		if(order==null){
			order =new Order_Check(driver);
		}
		return check;
	}
	 public Order_Step1 getInstanceStep1() {
		 if(step1==null) {
			 step1=new Order_Step1(driver);
		 }
		 return step1;
	 }
	public Shipping getInstanceShip() {
		if(ship==null) {
		  ship=new Shipping(driver);
			}
		return ship;
	}
	
	public Order_Multi_Shipping getInstanceMultiship() {
		if(multiship==null) {
			multiship=new Order_Multi_Shipping(driver);
		}
		return multiship;
	}
	
	public Order_Confirm getInstanceConfirm() {
		if(confirm==null) {
			confirm= new Order_Confirm(driver);
		}
		return confirm;
	}
	
	

}
