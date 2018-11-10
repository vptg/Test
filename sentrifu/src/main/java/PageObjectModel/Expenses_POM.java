package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilites.Helpers;

public class Expenses_POM extends Helpers{


	public static WebElement tab_expenses()
	{
		return driver.findElement(By.xpath("(//*[text()='Expenses'])[1]"));
	}
	
	public static WebElement btn_ADD()
	{
		return driver.findElement(By.xpath("(//*[text()=' Add'])[1]"));
	}
	
	
	public static WebElement list_Receipts()
	{
		return driver.findElement(By.xpath("(//*[@id='addbtna']/li/a)[3]"));
	}
	
	public static WebElement list_Expenses()
	{
		return driver.findElement(By.xpath("(//*[@id='addbtna']/li/a)[1]"));
	}

	public static WebElement txt_box_expense_name()
	{
		return driver.findElement(By.xpath("//*[@id='expense_name']"));
	}
	
	public static WebElement cateogry()
	{
		return driver.findElement(By.xpath("//*[@id='s2id_category_id']"));
	}
	
	public static WebElement upload_button()
	{
		return driver.findElement(By.xpath("//*[@class='dropdown-button uploadbtn']"));
	}
	
	public static WebElement list_from_computer()
	{
		return driver.findElement(By.xpath("//*[@id='fileuploaddummy']"));
	}
}
