/*     */ package org.testrun;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Properties;
/*     */ import javax.mail.Address;
/*     */ import javax.mail.Authenticator;
/*     */ import javax.mail.Message;
/*     */ import javax.mail.MessagingException;
/*     */ import javax.mail.PasswordAuthentication;
/*     */ import javax.mail.Session;
/*     */ import javax.mail.Transport;
/*     */ import javax.mail.internet.AddressException;
/*     */ import javax.mail.internet.InternetAddress;
/*     */ import javax.mail.internet.MimeMessage;
/*     */ import org.openqa.selenium.By;
/*     */ import org.openqa.selenium.JavascriptExecutor;
/*     */ import org.openqa.selenium.Keys;
/*     */ import org.openqa.selenium.WebElement;
/*     */ import org.openqa.selenium.chrome.ChromeDriver;
/*     */ 
/*     */ public class testrun {
/*  33 */   static String message1 = "";
/*     */   
/*  34 */   static String message2 = "";
/*     */   
/*  35 */   static String message3 = "";
/*     */   
/*  36 */   static String message4 = "";
/*     */   
/*  37 */   static String message5 = "";
/*     */   
/*  38 */   static String message6 = "";
/*     */   
/*  39 */   static String message7 = "";
/*     */   
/*  40 */   static String message8 = "";
/*     */   
/*  42 */   static int count = 0;
/*     */   
/*  43 */   static int bcount = 0;
/*     */   
/*  44 */   static int rcount = 0;
/*     */   
/*  45 */   static int fcount = 0;
/*     */   
/*  46 */   static int ccount = 0;
/*     */   
/*  48 */   static int scount = 0;
/*     */   
/*  49 */   static int rrcount = 0;
/*     */   
/*  50 */   static int acount = 0;
/*     */   
/*     */   static String b1;
/*     */   
/*     */   static String fb1;
/*     */   
/*     */   static String cb1;
/*     */   
/*     */   static String sb1;
/*     */   
/*     */   static String ab1;
/*     */   
/*     */   static String name1;
/*     */   
/*     */   static String name2;
/*     */   
/*     */   static String n;
/*     */   
/*     */   String[] separated;
/*     */   
/*     */   static String title1;
/*     */   
/*     */   String passed211;
/*     */   
/*     */   String passed2;
/*     */   
/*     */   String passedp1;
/*     */   
/*     */   String passedp2;
/*     */   
/*     */   String Blocked1;
/*     */   
/*     */   String Blocked11;
/*     */   
/*     */   String Blockedp1;
/*     */   
/*     */   String Blockedp2;
/*     */   
/*     */   String Retest1;
/*     */   
/*     */   String Retest11;
/*     */   
/*     */   String Retestp1;
/*     */   
/*     */   String Retestp2;
/*     */   
/*     */   String Failed1;
/*     */   
/*     */   String Failed11;
/*     */   
/*     */   String Failedp1;
/*     */   
/*     */   String Failedp2;
/*     */   
/*     */   String Caution1;
/*     */   
/*     */   String Caution11;
/*     */   
/*     */   String Cautionp1;
/*     */   
/*     */   String Cautionp2;
/*     */   
/*     */   String Skipped1;
/*     */   
/*     */   String Skipped11;
/*     */   
/*     */   String Skippedp1;
/*     */   
/*     */   String Skippedp2;
/*     */   
/*     */   String Running1;
/*     */   
/*     */   String Running11;
/*     */   
/*     */   String Runningp1;
/*     */   
/*     */   String Runningp2;
/*     */   
/*     */   String Applicable1;
/*     */   
/*     */   String Applicable11;
/*     */   
/*     */   String Applicablep1;
/*     */   
/*     */   String Applicablep2;
/*     */   
/*     */   String Percent1;
/*     */   
/*     */   String Percent11;
/*     */   
/*     */   String k1;
/*     */   
/*     */   String k2;
/*     */   
/*     */   String s1;
/*     */   
/*     */   String ass;
/*     */   
/*     */   String r1;
/*     */   
/*     */   String ss1;
/*     */   
/*     */   String rr1;
/*     */   
/*     */   String p1;
/*     */   
/*     */   public void sendHtmlEmail(String host, String port, final String userName, final String password, String toAddress, String subject, String message) throws AddressException, MessagingException {
/* 117 */     Properties properties = new Properties();
/* 118 */     properties.put("mail.smtp.host", host);
/* 119 */     properties.put("mail.smtp.port", port);
/* 120 */     properties.put("mail.smtp.auth", "true");
/* 121 */     properties.put("mail.smtp.starttls.enable", "true");
/* 124 */     Authenticator auth = new Authenticator() {
/*     */         public PasswordAuthentication getPasswordAuthentication() {
/* 126 */           return new PasswordAuthentication(userName, password);
/*     */         }
/*     */       };
/* 130 */     Session session = Session.getInstance(properties, auth);
/* 133 */     MimeMessage mimeMessage = new MimeMessage(session);
/* 135 */     mimeMessage.setFrom((Address)new InternetAddress(userName));
/* 136 */     InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
/* 137 */     mimeMessage.setRecipients(Message.RecipientType.TO, (Address[])toAddresses);
/* 144 */     mimeMessage.setSubject(subject);
/* 145 */     mimeMessage.setSentDate(new Date());
/* 147 */     mimeMessage.setContent(message, "text/html");
/* 150 */     Transport.send((Message)mimeMessage);
/*     */   }
/*     */   
/*     */   void samplemailtool(String FILEPath1, String FILEPath2, String FILEPath3, String FILEPath4, String FILEPath5, String FILEPath6) throws IOException, InterruptedException {
/* 166 */     String[] nn = { "user1@example.com", "user2@example.com", "user3@example.com", "user4@example.com"};
/* 169 */     File file = new File("chromedriver.exe");
/* 170 */     System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
/* 173 */     ChromeDriver chromeDriver = new ChromeDriver();
/* 177 */     chromeDriver.get("https://testrail.labcollab.net/testrail/index.php?/dashboard");
/* 179 */     String nn1 = FILEPath2;
/* 181 */     for (int u11 = 0; u11 < nn.length; u11++) {
/* 185 */       if (nn1.equals(nn[u11])) {
/* 191 */         WebElement username = chromeDriver.findElement(By.id("name"));
/* 192 */         username.sendKeys(new CharSequence[] { FILEPath2 });
/* 195 */         WebElement password1 = chromeDriver.findElement(By.id("password"));
/* 196 */         password1.sendKeys(new CharSequence[] { FILEPath5 });
/* 199 */         password1.submit();
/* 202 */         Thread.sleep(2000L);
/* 205 */         this.separated = FILEPath1.split(" ");
/* 208 */         for (int k = 0; k < this.separated.length; k++) {
/* 212 */           System.out.println(this.separated[k]);
/* 229 */           chromeDriver.get(this.separated[k]);
/* 234 */           Thread.sleep(2000L);
/* 236 */           JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
/* 237 */           jse.executeScript("window.scrollBy(0,-10000)", new Object[] { "" });
/* 239 */           WebElement html = chromeDriver.findElement(By.tagName("html"));
/* 240 */           html.sendKeys(new CharSequence[] { Keys.chord(new CharSequence[] { (CharSequence)Keys.CONTROL, (CharSequence)Keys.SUBTRACT }) });
/* 243 */           Thread.sleep(3000L);
/* 248 */           WebElement fromname = chromeDriver.findElement(By.xpath("//div[@id=\"content\"]/div[2]/a"));
/* 249 */           name1 = fromname.getText();
/* 250 */           name2 = fromname.getAttribute("href");
/* 251 */           WebElement title = chromeDriver.findElement(By.xpath("//div[@id=\"content-header\"]/div/div[3]"));
/* 252 */           title1 = title.getText();
/* 254 */           WebElement pass2 = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[1]/div[2]/div/span[1]"));
/* 255 */           this.passed211 = pass2.getText();
/* 258 */           this.passed2 = this.passed211.replaceAll("[^0-9]", "");
/* 261 */           int p = Integer.parseInt(this.passed2);
/* 263 */           WebElement passp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[1]/div[2]/div/span[2]"));
/* 264 */           this.passedp1 = passp.getText();
/* 266 */           this.passedp2 = this.passedp1.replaceAll("[^0-9]", "");
/* 271 */           WebElement Blocked = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
/* 272 */           this.Blocked1 = Blocked.getText();
/* 274 */           this.Blocked11 = this.Blocked1.replaceAll("[^0-9]", "");
/* 276 */           int b = Integer.parseInt(this.Blocked11);
/* 278 */           WebElement Blockedp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[2]/div[2]/div/span[2]"));
/* 279 */           this.Blockedp1 = Blockedp.getText();
/* 281 */           this.Blockedp2 = this.Blockedp1.replaceAll("[^0-9]", "");
/* 285 */           WebElement Retest = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[3]/div[2]/div/span[1]"));
/* 286 */           this.Retest1 = Retest.getText();
/* 288 */           this.Retest11 = this.Retest1.replaceAll("[^0-9]", "");
/* 289 */           int R = Integer.parseInt(this.Retest11);
/* 291 */           WebElement Retestp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[3]/div[2]/div/span[2]"));
/* 292 */           this.Retestp1 = Retestp.getText();
/* 294 */           this.Retestp2 = this.Retestp1.replaceAll("[^0-9]", "");
/* 297 */           WebElement Failed = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[4]/div[2]/div/span[1]"));
/* 298 */           this.Failed1 = Failed.getText();
/* 300 */           this.Failed11 = this.Failed1.replaceAll("[^0-9]", "");
/* 302 */           int f = Integer.parseInt(this.Failed11);
/* 304 */           WebElement Failedp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[4]/div[2]/div/span[2]"));
/* 305 */           this.Failedp1 = Failedp.getText();
/* 307 */           this.Failedp2 = this.Failedp1.replaceAll("[^0-9]", "");
/* 309 */           WebElement Caution = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[5]/div[2]/div/span[1]"));
/* 310 */           this.Caution1 = Caution.getText();
/* 312 */           this.Caution11 = this.Caution1.replaceAll("[^0-9]", "");
/* 313 */           int c = Integer.parseInt(this.Caution11);
/* 315 */           WebElement Cautionp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[5]/div[2]/div/span[2]"));
/* 316 */           this.Cautionp1 = Cautionp.getText();
/* 318 */           this.Cautionp2 = this.Cautionp1.replaceAll("[^0-9]", "");
/* 320 */           WebElement Skipped = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[6]/div[2]/div/span[1]"));
/* 321 */           this.Skipped1 = Skipped.getText();
/* 323 */           this.Skipped11 = this.Skipped1.replaceAll("[^0-9]", "");
/* 324 */           int s = Integer.parseInt(this.Skipped11);
/* 327 */           WebElement Skippedp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[6]/div[2]/div/span[2]"));
/* 328 */           this.Skippedp1 = Skippedp.getText();
/* 330 */           this.Skippedp2 = this.Skippedp1.replaceAll("[^0-9]", "");
/* 332 */           WebElement Running = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[4]/div[2]/div/span[1]"));
/* 333 */           this.Running1 = Running.getText();
/* 335 */           this.Running11 = this.Running1.replaceAll("[^0-9]", "");
/* 336 */           int rr = Integer.parseInt(this.Running11);
/* 339 */           WebElement Runningp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[4]/div[2]/div/span[2]"));
/* 340 */           this.Runningp1 = Runningp.getText();
/* 342 */           this.Runningp2 = this.Runningp1.replaceAll("[^0-9]", "");
/* 344 */           WebElement Applicable = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[5]/div[2]/div/span[1]"));
/* 345 */           this.Applicable1 = Applicable.getText();
/* 347 */           this.Applicable11 = this.Applicable1.replaceAll("[^0-9]", "");
/* 348 */           int A = Integer.parseInt(this.Applicable11);
/* 352 */           WebElement Applicablep = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[5]/div[2]/div/span[2]"));
/* 353 */           this.Applicablep1 = Applicablep.getText();
/* 355 */           this.Applicablep2 = this.Applicablep1.replaceAll("[^0-9]", "");
/* 357 */           WebElement Percent = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[4]/div/div[1]"));
/* 358 */           this.Percent1 = Percent.getText();
/* 360 */           this.Percent11 = this.Percent1.replaceAll("[^0-9]", "");
/* 362 */           WebElement qq = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[4]/div/div[3]"));
/* 363 */           String f1 = qq.getText();
/* 366 */           String[] strs = f1.split(" ");
/* 369 */           String u1 = strs[0];
/* 370 */           String u2 = strs[2];
/* 372 */           String u3 = strs[4].replace(".", "");
/* 376 */           String u4 = u3.replace("(", "");
/* 378 */           String u5 = u4.replace("%)", "");
/* 380 */           int foo1 = Integer.parseInt(u5);
/* 382 */           System.out.println(u5);
/* 384 */           int com22 = 100 - foo1;
/* 386 */           System.out.println(com22);
/* 391 */           int foo = Integer.parseInt(u1);
/* 395 */           if (foo == 0) {
/* 397 */             System.out.println("completed");
/* 398 */             n = "<b><font color=green>Completed</font></b>";
/*     */           } else {
/* 404 */             System.out.println("inprocess");
/* 405 */             n = "<b><font color=#FFA500>In-Progress</font></b>";
/*     */           } 
/* 408 */           Thread.sleep(3000L);
/* 411 */           message1 = String.valueOf(message1) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + this.separated[k] + ">" + title1 + "</a></td>" + 
/*     */             
/* 413 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + n + "</td>" + 
/* 414 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.passed2 + "(" + this.passedp2 + "%" + ")" + "</td>" + 
/* 415 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Blocked11 + "(" + this.Blockedp2 + "%" + ")" + "</td>" + 
/* 416 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Retest11 + "(" + this.Retestp2 + "%" + ")" + "</td>" + 
/* 417 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Failed11 + "(" + this.Failedp2 + "%" + ")" + "</td>" + 
/* 418 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Caution11 + "(" + this.Cautionp2 + "%" + ")" + "</td>" + 
/* 419 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Skipped11 + "(" + this.Skippedp2 + "%" + ")" + "</td>" + 
/* 420 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Running11 + "(" + this.Runningp2 + "%" + ")" + "</td>" + 
/* 421 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Applicable11 + "(" + this.Applicablep2 + "%" + ")" + "</td>" + 
/*     */             
/* 423 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.Percent11 + "%" + "</td></tr>";
/*     */         } 
/* 428 */         chromeDriver.get("https://issues.labcollab.net/login.jsp?os_destination=%2Fissues%2F%3Ffilter%3D133364");
/* 431 */         String[] nammm = FILEPath2.split("@");
/* 433 */         WebElement username1 = chromeDriver.findElement(By.id("login-form-username"));
/* 434 */         username1.sendKeys(new CharSequence[] { nammm[0] });
/* 437 */         WebElement password2 = chromeDriver.findElement(By.id("login-form-password"));
/* 438 */         password2.sendKeys(new CharSequence[] { FILEPath6 });
/* 441 */         password2.submit();
/* 443 */         chromeDriver.get("https://issues.labcollab.net/issues/?filter=133364");
/* 446 */         List<WebElement> a1 = chromeDriver.findElements(By.xpath("//table[@id=\"issuetable\"]/tbody/tr"));
/* 447 */         System.out.println(a1.size());
/* 448 */         int jiras = a1.size();
/* 450 */         for (int a2 = 1; a2 <= a1.size(); a2++) {
/* 453 */           Thread.sleep(2000L);
/* 454 */           WebElement webElement1 = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[2]/a"));
/* 455 */           this.k1 = webElement1.getText();
/* 456 */           System.out.println(this.k1);
/* 458 */           this.k2 = webElement1.getAttribute("href");
/* 460 */           System.out.println(this.k2);
/* 463 */           WebElement s = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[3]/p/a"));
/* 464 */           this.s1 = s.getText();
/* 465 */           System.out.println(this.s1);
/* 468 */           WebElement as = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[4]"));
/* 469 */           this.ass = as.getText();
/* 470 */           System.out.println(this.ass);
/* 472 */           WebElement r = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[5]/span/a"));
/* 473 */           this.r1 = r.getText();
/* 474 */           System.out.println(this.r1);
/* 476 */           WebElement p = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[6]/img"));
/* 477 */           this.p1 = p.getAttribute("alt");
/* 478 */           System.out.println(this.p1);
/* 481 */           WebElement ss = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[7]/span"));
/* 482 */           this.ss1 = ss.getText();
/* 483 */           System.out.println(this.ss1);
/* 485 */           WebElement rr = chromeDriver.findElement(By.xpath("//table[@id=\"issuetable\"]/tbody/tr[" + a2 + "]/td[8]"));
/* 486 */           this.rr1 = rr.getText();
/* 487 */           System.out.println(this.rr1);
/* 491 */           message2 = String.valueOf(message2) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + this.k2 + ">" + this.k1 + "</a></td>" + 
/*     */             
/* 493 */             "<td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.s1 + "</td>" + 
/* 494 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.ass + "</td>" + 
/* 495 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.r1 + "</td>" + 
/* 496 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.p1 + "</td>" + 
/* 497 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.ss1 + "</td>" + 
/* 498 */             "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + this.rr1 + "</td></tr>";
/*     */         } 
/* 512 */         chromeDriver.close();
/* 543 */         String host = "smtp.amazon.com";
/* 544 */         String port = "25";
/* 549 */         String[] namelist9 = { "user1@example.com", "user2@example.com", "user3@example.com", "user4@example.com" };
/* 553 */         for (int uu = 0; uu < namelist9.length; uu++) {
/* 555 */           if (FILEPath2.equals(namelist9[uu])) {
/* 557 */             String mailFrom = FILEPath2;
/* 561 */             String password = FILEPath2;
/* 565 */             String mailTo = FILEPath2;
/* 569 */             String subject = "Tardis QSA Daily Status Report";
/* 575 */             String message = " <font face=\"Calibri\">Hi All,</font><br><br>";
/* 586 */             message = String.valueOf(message) + "<font face=\"Calibri\">Please find below task details.</font><br><br>";
/* 588 */             message = String.valueOf(message) + "<font face=\"Calibri\"><b>Regression Details</b></font><br><br>";
/* 591 */             message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 595 */             message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Run Name</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Status</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Passed</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Blocked</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Retest</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Failed</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Caution</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Skipped</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Running</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Not Applicable</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Pass Percent</b></td></tr>";
/* 611 */             message = String.valueOf(message) + message1;
/* 614 */             message = String.valueOf(message) + "</tr>";
/* 615 */             message = String.valueOf(message) + "</table><br><br>";
/* 618 */             message = String.valueOf(message) + "<font face=\"Calibri\"><b>New Jiras-" + jiras + "</b></font><br><br>";
/* 619 */             if (jiras != 0) {
/* 621 */               message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 625 */               message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Key</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Summary</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Assignee</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Reporter</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Priority</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Status</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Resolution</b></td></tr>";
/* 639 */               message = String.valueOf(message) + message2;
/* 642 */               message = String.valueOf(message) + "</tr>";
/* 643 */               message = String.valueOf(message) + "</table><br><br>";
/*     */             } 
/* 647 */             message = String.valueOf(message) + "<font face=\"Calibri\">Thanks,</font></br>";
/* 648 */             message = String.valueOf(message) + "<font face=\"Calibri\"> " + FILEPath4 + "</font></br>";
/* 651 */             testrun mailer = new testrun();
/*     */             try {
/* 656 */               mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo, subject, message);
/* 657 */               System.out.println("Email sent.");
/* 658 */             } catch (Exception ex) {
/* 659 */               System.out.println("Failed to sent email.");
/* 660 */               ex.printStackTrace();
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }
