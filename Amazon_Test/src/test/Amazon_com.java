package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import components.launch_Browser;
import framework.BaseTest;

public class Amazon_com extends BaseTest {

	@Test
	public void executeTest() throws Exception{
		launch_Browser.run();
	
	}
	@AfterTest
	public void end(){
		close_Browser();
	}

}