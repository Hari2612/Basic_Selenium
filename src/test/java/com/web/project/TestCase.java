package com.web.project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import STTA.MavenP.*;
public class TestCase extends App {
  @Test(priority =1)
  public void f() {
	  searchText.sendKeys("Selenium");
  }
}
