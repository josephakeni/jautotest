$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddComputerKit.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart functionality",
  "description": "",
  "id": "add-to-cart-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Add a computer kit complete",
  "description": "",
  "id": "add-to-cart-functionality;add-a-computer-kit-complete",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "That I am On The Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click Shop",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click one of the availble computer kits",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click Buy Now.",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The computer kit should be added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.that_I_am_On_The_Landing_Page()"
});
formatter.result({
  "duration": 26814157109,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.i_click_Shop()"
});
formatter.result({
  "duration": 1145750902,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027primary-nav-items\u0027]/li[3]/a/span\"}\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.14 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Joseph\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\AKINTU~1\\AppData\\Local\\Temp\\scoped_dir25512_1462}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d64.0.3282.186, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 073d9dd8c2e6a21d0f8b8721432d0d50\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027primary-nav-items\u0027]/li[3]/a/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat step_Definitions.AddToCart.i_click_Shop(AddToCart.java:23)\r\n\tat ✽.And I click Shop(AddComputerKit.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddToCart.i_click_one_of_the_availble_computer_kits()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCart.i_click_Buy_Now()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCart.the_computer_kit_should_be_added_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Kano_Projects.feature");
formatter.feature({
  "line": 1,
  "name": "Kano Projects Menu \u0026 Footer Contents Verification",
  "description": "",
  "id": "kano-projects-menu-\u0026-footer-contents-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "I want to check that the menus and footer contents are correct",
  "description": "",
  "id": "kano-projects-menu-\u0026-footer-contents-verification;i-want-to-check-that-the-menus-and-footer-contents-are-correct",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Kano_Projects"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "That I am On The Projects Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I see World Link displayed",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I see Make Link displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see Shop Link displayed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see Connected Kanos",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see Online Today",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I see Lines of codes",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see Creations shared",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I know the Footer contents are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "ProjectsPage.that_I_am_On_The_Projects_Page()"
});
formatter.result({
  "duration": 7020821558,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_World_Link_displayed()"
});
formatter.result({
  "duration": 3281371,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_Make_Link_displayed()"
});
formatter.result({
  "duration": 86961,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_Shop_Link_displayed()"
});
formatter.result({
  "duration": 84598,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_Connected_Kanos()"
});
formatter.result({
  "duration": 86016,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_Online_Today()"
});
formatter.result({
  "duration": 86016,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_Lines_of_codes()"
});
formatter.result({
  "duration": 85543,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_see_Creations_shared()"
});
formatter.result({
  "duration": 81763,
  "status": "passed"
});
formatter.match({
  "location": "ProjectsPage.i_know_the_Footer_contents_are_correct()"
});
formatter.result({
  "duration": 86016,
  "status": "passed"
});
});