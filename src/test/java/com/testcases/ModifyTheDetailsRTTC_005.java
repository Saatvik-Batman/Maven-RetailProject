package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.All.POM.LoginPOM;
import com.All.POM.ModifyTheDetailsPOM;
import com.All.POM.RegistrationPOM;

public class ModifyTheDetailsRTTC_005 {
	
	WebDriver driver;
	Select dropdown;
	@Test
	public void modifyDetails() throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String path = "E://Selenium Latest Software//chromedriver.exe";
		System.setProperty(key , path);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://retailm1.upskills.in/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPOM lp = new LoginPOM(driver);
		lp.enterEmail("xyza@gmail.com");
		lp.enterPassword("abcd");
		lp.clickLogin();
		
		ModifyTheDetailsPOM mtd = new ModifyTheDetailsPOM(driver);
		mtd.editAccount();
		
		RegistrationPOM rp = new RegistrationPOM(driver, dropdown);
		rp.firstName("saatvik");
		rp.lastName("sharma");
		rp.enterEmail("teamb@gmail.com");
		rp.enterTelephone(564646464);
		rp.clickContinue();
		String text = driver.findElement(By.cssSelector("body.account-account.tb_width_1200.tb_lang_ltr.tb_page_account_account.is_logged.head_glob_intro_glob_cont_glob_foot_glob_ar_head_glob_ar_intro__def_ar_cont_sys_account_account_ar_col_l_glob_ar_col_r_sys_account_account_ar_foot_glob_en-gb_733d2.no_touch:nth-child(2) div.container-fluid:nth-child(2) section.tb_area_content.row-wrap.lazyloaded:nth-child(4) div.row.tb_separate_columns.tb_ip_50 div.main.col.col-xs-12.col-sm-fill.col-md-fill div.row_Aj3wb.row-wrap.lazyloaded div.row.tb_gut_xs_30.tb_gut_sm_30.tb_gut_md_50.tb_gut_lg_50 div.col_Crki9.col.col-xs-12.col-sm-12.col-md-12.col-lg-12.col-align-default.col-valign-top.tb_pt_0.tb_pr_0.tb_pb_0.tb_pl_0 div.tb_wt.tb_wt_system.display-block.tb_system_page_content > div.alert.alert-success:nth-child(1)")).getText();
		Assert.assertEquals(text, "Success: Your account has been successfully updated.");
		System.out.println("String Matched: This message appears only if the string matched");
		rp.quit();
		
		

}
}
