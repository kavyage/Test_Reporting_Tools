/*      */ package org.tar;
/*      */ 
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ import java.util.Properties;
/*      */ import javax.mail.Address;
/*      */ import javax.mail.Authenticator;
/*      */ import javax.mail.Message;
/*      */ import javax.mail.MessagingException;
/*      */ import javax.mail.PasswordAuthentication;
/*      */ import javax.mail.Session;
/*      */ import javax.mail.Transport;
/*      */ import javax.mail.internet.AddressException;
/*      */ import javax.mail.internet.InternetAddress;
/*      */ import javax.mail.internet.MimeMessage;
/*      */ import org.openqa.selenium.By;
/*      */ import org.openqa.selenium.JavascriptExecutor;
/*      */ import org.openqa.selenium.Keys;
/*      */ import org.openqa.selenium.WebElement;
/*      */ import org.openqa.selenium.chrome.ChromeDriver;
/*      */ 
/*      */ public class Tar {
/*   33 */   static String message1 = "";
/*      */   
/*   34 */   static String message2 = "";
/*      */   
/*   35 */   static String message3 = "";
/*      */   
/*   36 */   static String message4 = "";
/*      */   
/*   37 */   static String message5 = "";
/*      */   
/*   38 */   static String message6 = "";
/*      */   
/*   39 */   static String message7 = "";
/*      */   
/*   40 */   static String message8 = "";
/*      */   
/*   42 */   static int count = 0;
/*      */   
/*   43 */   static int bcount = 0;
/*      */   
/*   44 */   static int rcount = 0;
/*      */   
/*   45 */   static int fcount = 0;
/*      */   
/*   46 */   static int ccount = 0;
/*      */   
/*   48 */   static int scount = 0;
/*      */   
/*   49 */   static int rrcount = 0;
/*      */   
/*   50 */   static int acount = 0;
/*      */   
/*      */   static String b1;
/*      */   
/*      */   static String fb1;
/*      */   
/*      */   static String cb1;
/*      */   
/*      */   static String sb1;
/*      */   
/*      */   static String ab1;
/*      */   
/*      */   static String name1;
/*      */   
/*      */   static String name2;
/*      */   
/*      */   static String n;
/*      */   
/*      */   public void sendHtmlEmail(String host, String port, final String userName, final String password, String toAddress, String subject, String message) throws AddressException, MessagingException {
/*   68 */     Properties properties = new Properties();
/*   69 */     properties.put("mail.smtp.host", host);
/*   70 */     properties.put("mail.smtp.port", port);
/*   71 */     properties.put("mail.smtp.auth", "true");
/*   72 */     properties.put("mail.smtp.starttls.enable", "true");
/*   75 */     Authenticator auth = new Authenticator() {
/*      */         public PasswordAuthentication getPasswordAuthentication() {
/*   77 */           return new PasswordAuthentication(userName, password);
/*      */         }
/*      */       };
/*   81 */     Session session = Session.getInstance(properties, auth);
/*   84 */     MimeMessage mimeMessage = new MimeMessage(session);
/*   86 */     mimeMessage.setFrom((Address)new InternetAddress(userName));
/*   87 */     InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
/*   88 */     mimeMessage.setRecipients(Message.RecipientType.TO, (Address[])toAddresses);
/*   95 */     mimeMessage.setSubject(subject);
/*   96 */     mimeMessage.setSentDate(new Date());
/*   98 */     mimeMessage.setContent(message, "text/html");
/*  101 */     Transport.send((Message)mimeMessage);
/*      */   }
/*      */   
/*      */   void samplemailtool(String FILEPath1, String FILEPath2, String FILEPath3, String FILEPath4, String FILEPath5) throws IOException, InterruptedException {
/*  115 */     String[] nn = { 
/*  115 */         "user1@example.com", "user2@example.com", "user3@example.com", "user4@example.com"};
/*  121 */     File file = new File("chromedriver.exe");
/*  122 */     System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
/*  125 */     ChromeDriver chromeDriver = new ChromeDriver();
/*  130 */     chromeDriver.get(FILEPath1);
/*  147 */     String nn1 = FILEPath2;
/*  149 */     for (int u11 = 0; u11 < nn.length; u11++) {
/*  153 */       if (nn1.equals(nn[u11])) {
/*  157 */         WebElement username = chromeDriver.findElement(By.id("name"));
/*  158 */         username.sendKeys(new CharSequence[] { FILEPath2 });
/*  161 */         WebElement password1 = chromeDriver.findElement(By.id("password"));
/*  162 */         password1.sendKeys(new CharSequence[] { FILEPath5 });
/*  165 */         password1.submit();
/*  169 */         Thread.sleep(4000L);
/*  171 */         JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
/*  172 */         jse.executeScript("window.scrollBy(0,-10000)", new Object[] { "" });
/*  174 */         WebElement html = chromeDriver.findElement(By.tagName("html"));
/*  175 */         html.sendKeys(new CharSequence[] { Keys.chord(new CharSequence[] { (CharSequence)Keys.CONTROL, (CharSequence)Keys.SUBTRACT }) });
/*  178 */         Thread.sleep(3000L);
/*  183 */         WebElement fromname = chromeDriver.findElement(By.xpath("//div[@id=\"content\"]/div[2]/a"));
/*  184 */         name1 = fromname.getText();
/*  185 */         name2 = fromname.getAttribute("href");
/*  186 */         WebElement title = chromeDriver.findElement(By.xpath("//div[@id=\"content-header\"]/div/div[3]"));
/*  187 */         String title1 = title.getText();
/*  189 */         WebElement pass2 = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[1]/div[2]/div/span[1]"));
/*  190 */         String passed211 = pass2.getText();
/*  193 */         String passed2 = passed211.replaceAll("[^0-9]", "");
/*  196 */         int p = Integer.parseInt(passed2);
/*  198 */         WebElement passp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[1]/div[2]/div/span[2]"));
/*  199 */         String passedp1 = passp.getText();
/*  201 */         String passedp2 = passedp1.replaceAll("[^0-9]", "");
/*  206 */         WebElement Blocked = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
/*  207 */         String Blocked1 = Blocked.getText();
/*  209 */         String Blocked11 = Blocked1.replaceAll("[^0-9]", "");
/*  211 */         int b = Integer.parseInt(Blocked11);
/*  213 */         WebElement Blockedp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[2]/div[2]/div/span[2]"));
/*  214 */         String Blockedp1 = Blockedp.getText();
/*  216 */         String Blockedp2 = Blockedp1.replaceAll("[^0-9]", "");
/*  220 */         WebElement Retest = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[3]/div[2]/div/span[1]"));
/*  221 */         String Retest1 = Retest.getText();
/*  223 */         String Retest11 = Retest1.replaceAll("[^0-9]", "");
/*  224 */         int R = Integer.parseInt(Retest11);
/*  226 */         WebElement Retestp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[3]/div[2]/div/span[2]"));
/*  227 */         String Retestp1 = Retestp.getText();
/*  229 */         String Retestp2 = Retestp1.replaceAll("[^0-9]", "");
/*  232 */         WebElement Failed = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[4]/div[2]/div/span[1]"));
/*  233 */         String Failed1 = Failed.getText();
/*  235 */         String Failed11 = Failed1.replaceAll("[^0-9]", "");
/*  237 */         int f = Integer.parseInt(Failed11);
/*  239 */         WebElement Failedp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[4]/div[2]/div/span[2]"));
/*  240 */         String Failedp1 = Failedp.getText();
/*  242 */         String Failedp2 = Failedp1.replaceAll("[^0-9]", "");
/*  244 */         WebElement Caution = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[5]/div[2]/div/span[1]"));
/*  245 */         String Caution1 = Caution.getText();
/*  247 */         String Caution11 = Caution1.replaceAll("[^0-9]", "");
/*  248 */         int c = Integer.parseInt(Caution11);
/*  250 */         WebElement Cautionp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[5]/div[2]/div/span[2]"));
/*  251 */         String Cautionp1 = Cautionp.getText();
/*  253 */         String Cautionp2 = Cautionp1.replaceAll("[^0-9]", "");
/*  255 */         WebElement Skipped = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[6]/div[2]/div/span[1]"));
/*  256 */         String Skipped1 = Skipped.getText();
/*  258 */         String Skipped11 = Skipped1.replaceAll("[^0-9]", "");
/*  259 */         int s = Integer.parseInt(Skipped11);
/*  262 */         WebElement Skippedp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[2]/div/div[6]/div[2]/div/span[2]"));
/*  263 */         String Skippedp1 = Skippedp.getText();
/*  265 */         String Skippedp2 = Skippedp1.replaceAll("[^0-9]", "");
/*  267 */         WebElement Running = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[4]/div[2]/div/span[1]"));
/*  268 */         String Running1 = Running.getText();
/*  270 */         String Running11 = Running1.replaceAll("[^0-9]", "");
/*  271 */         int rr = Integer.parseInt(Running11);
/*  274 */         WebElement Runningp = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[4]/div[2]/div/span[2]"));
/*  275 */         String Runningp1 = Runningp.getText();
/*  277 */         String Runningp2 = Runningp1.replaceAll("[^0-9]", "");
/*  279 */         WebElement Applicable = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[5]/div[2]/div/span[1]"));
/*  280 */         String Applicable1 = Applicable.getText();
/*  282 */         String Applicable11 = Applicable1.replaceAll("[^0-9]", "");
/*  283 */         int A = Integer.parseInt(Applicable11);
/*  287 */         WebElement Applicablep = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[3]/div/div[5]/div[2]/div/span[2]"));
/*  288 */         String Applicablep1 = Applicablep.getText();
/*  290 */         String Applicablep2 = Applicablep1.replaceAll("[^0-9]", "");
/*  292 */         WebElement Percent = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[4]/div/div[1]"));
/*  293 */         String Percent1 = Percent.getText();
/*  295 */         String Percent11 = Percent1.replaceAll("[^0-9]", "");
/*  297 */         WebElement qq = chromeDriver.findElement(By.xpath("//div[@id=\"statsContainer\"]/div/div[1]/div[4]/div/div[3]"));
/*  298 */         String f1 = qq.getText();
/*  301 */         String[] strs = f1.split(" ");
/*  304 */         String u1 = strs[0];
/*  305 */         String u2 = strs[2];
/*  307 */         String u3 = strs[4].replace(".", "");
/*  311 */         String u4 = u3.replace("(", "");
/*  313 */         String u5 = u4.replace("%)", "");
/*  315 */         int foo1 = Integer.parseInt(u5);
/*  317 */         System.out.println(u5);
/*  319 */         int com22 = 100 - foo1;
/*  321 */         System.out.println(com22);
/*  326 */         int foo = Integer.parseInt(u1);
/*  330 */         if (foo == 0) {
/*  332 */           System.out.println("completed");
/*  333 */           n = "<b><font color=green>Completed</font></b>";
/*      */         } else {
/*  339 */           System.out.println("inprocess");
/*  340 */           n = "<b><font color=#FFA500>In-Progress</font></b>";
/*      */         } 
/*  345 */         message1 = String.valueOf(message1) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + FILEPath1 + ">" + title1 + "</a></td>" + 
/*      */           
/*  347 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + n + "</td>" + 
/*  348 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + passed2 + "(" + passedp2 + "%" + ")" + "</td>" + 
/*  349 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Blocked11 + "(" + Blockedp2 + "%" + ")" + "</td>" + 
/*  350 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Retest11 + "(" + Retestp2 + "%" + ")" + "</td>" + 
/*  351 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Failed11 + "(" + Failedp2 + "%" + ")" + "</td>" + 
/*  352 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Caution11 + "(" + Cautionp2 + "%" + ")" + "</td>" + 
/*  353 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Skipped11 + "(" + Skippedp2 + "%" + ")" + "</td>" + 
/*  354 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Running11 + "(" + Runningp2 + "%" + ")" + "</td>" + 
/*  355 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Applicable11 + "(" + Applicablep2 + "%" + ")" + "</td>" + 
/*      */           
/*  357 */           "<td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + Percent11 + "%" + "</td></tr>";
/*  537 */         if (b != 0) {
/*  540 */           WebElement blockbut = chromeDriver.findElement(By.xpath("//li[@id=\"node-2\"]/a"));
/*  541 */           String blockbutlink = blockbut.getAttribute("href");
/*  542 */           blockbut.click();
/*  545 */           Thread.sleep(2000L);
/*  547 */           List<WebElement> aa1 = chromeDriver.findElements(By.xpath("//div[@id=\"group-2\"]/table/tbody/tr"));
/*  548 */           System.out.println(aa1.size());
/*  550 */           for (int j = 2; j <= aa1.size(); j++) {
/*  553 */             WebElement bb = chromeDriver.findElement(By.xpath("//div[@id=\"group-2\"]/table/tbody/tr[" + j + "]/td[5]"));
/*  554 */             String bbb = bb.getText();
/*  558 */             String bcat = null;
/*  563 */             List<WebElement> baa11 = chromeDriver.findElements(By.xpath("//div[@id=\"group-2\"]/table/tbody/tr[" + j + "]/td[5]/a"));
/*  564 */             System.out.println(baa11.size());
/*  566 */             if (baa11.size() != 1) {
/*  568 */               for (int bt = 1; bt <= baa11.size(); bt++) {
/*  572 */                 WebElement cdd1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-2\"]/table/tbody/tr[" + j + "]/td[5]/a[" + bt + "]"));
/*  573 */                 String bddd1 = cdd1.getText();
/*  575 */                 String bd2 = cdd1.getAttribute("href");
/*  579 */                 String btr = "<a href=" + bd2 + ">" + bddd1 + "</a>";
/*  581 */                 if (bt == 1) {
/*  583 */                   bcat = btr;
/*      */                 } else {
/*  587 */                   bcat = String.valueOf(bcat) + "," + btr;
/*      */                 } 
/*      */               } 
/*      */             } else {
/*  598 */               WebElement dd1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-2\"]/table/tbody/tr[" + j + "]/td[5]/a"));
/*  599 */               String bddd1 = dd1.getText();
/*  601 */               String bd2 = dd1.getAttribute("href");
/*  606 */               String btr = "<a href=" + bd2 + ">" + bddd1 + "</a>";
/*  608 */               bcat = btr;
/*      */             } 
/*  632 */             WebElement b2 = chromeDriver.findElement(By.xpath("//div[@id=\"group-2\"]/table/tbody/tr[" + j + "]/td/a"));
/*  633 */             String b3 = b2.getText();
/*  635 */             String b4 = b2.getAttribute("href");
/*  638 */             Thread.sleep(2000L);
/*  692 */             message3 = String.valueOf(message3) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + b4 + ">" + b3 + "</a></td>" + 
/*  693 */               "<td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + bcat + "</td></tr>";
/*  697 */             bcount++;
/*      */           } 
/*      */         } 
/*  711 */         if (f != 0) {
/*  714 */           WebElement Failedbut = chromeDriver.findElement(By.xpath("//li[@id=\"node-5\"]/a"));
/*  715 */           String Failedbutlink = Failedbut.getAttribute("href");
/*  716 */           Failedbut.click();
/*  719 */           Thread.sleep(2000L);
/*  721 */           List<WebElement> aa3 = chromeDriver.findElements(By.xpath("//div[@id=\"group-5\"]/table/tbody/tr"));
/*  722 */           System.out.println(aa3.size());
/*  724 */           for (int ff = 2; ff <= aa3.size(); ff++) {
/*  727 */             WebElement fbb = chromeDriver.findElement(By.xpath("//div[@id=\"group-5\"]/table/tbody/tr[" + ff + "]/td[5]"));
/*  728 */             String fbbb = fbb.getText();
/*  733 */             String fcat = null;
/*  738 */             List<WebElement> faa11 = chromeDriver.findElements(By.xpath("//div[@id=\"group-5\"]/table/tbody/tr[" + ff + "]/td[5]/a"));
/*  739 */             System.out.println(faa11.size());
/*  741 */             if (faa11.size() != 1) {
/*  743 */               for (int ft = 1; ft <= faa11.size(); ft++) {
/*  746 */                 WebElement fdd1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-5\"]/table/tbody/tr[" + ff + "]/td[5]/a[" + ft + "]"));
/*  747 */                 String fddd1 = fdd1.getText();
/*  749 */                 String fd2 = fdd1.getAttribute("href");
/*  753 */                 String ftr = "<a href=" + fd2 + ">" + fddd1 + "</a>";
/*  755 */                 if (ft == 1) {
/*  757 */                   fcat = ftr;
/*      */                 } else {
/*  761 */                   fcat = String.valueOf(fcat) + "," + ftr;
/*      */                 } 
/*      */               } 
/*      */             } else {
/*  772 */               WebElement fdd1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-5\"]/table/tbody/tr[" + ff + "]/td[5]/a"));
/*  773 */               String fddd1 = fdd1.getText();
/*  775 */               String fd2 = fdd1.getAttribute("href");
/*  780 */               String ftr = "<a href=" + fd2 + ">" + fddd1 + "</a>";
/*  782 */               fcat = ftr;
/*      */             } 
/*  805 */             WebElement fb2 = chromeDriver.findElement(By.xpath("//div[@id=\"group-5\"]/table/tbody/tr[" + ff + "]/td/a"));
/*  806 */             String fb3 = fb2.getText();
/*  808 */             String fb4 = fb2.getAttribute("href");
/*  811 */             Thread.sleep(2000L);
/*  853 */             message4 = String.valueOf(message4) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + fb4 + ">" + fb3 + "</a></td>" + 
/*  854 */               "<td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + fcat + "</td></tr>";
/*  857 */             fcount++;
/*      */           } 
/*      */         } 
/*  866 */         if (c != 0) {
/*  872 */           WebElement Cautionbut = chromeDriver.findElement(By.xpath("//li[@id=\"node-11\"]/a"));
/*  873 */           String Cautionbutlink = Cautionbut.getAttribute("href");
/*  874 */           Cautionbut.click();
/*  877 */           Thread.sleep(2000L);
/*  880 */           List<WebElement> aa4 = chromeDriver.findElements(By.xpath("//div[@id=\"group-11\"]/table/tbody/tr"));
/*  881 */           System.out.println(aa4.size());
/*  883 */           for (int cc = 2; cc <= aa4.size(); cc++) {
/*  886 */             WebElement cbb = chromeDriver.findElement(By.xpath("//div[@id=\"group-11\"]/table/tbody/tr[" + cc + "]/td[5]"));
/*  887 */             String cbbb = cbb.getText();
/*  890 */             String ccat = null;
/*  891 */             List<WebElement> caa11 = chromeDriver.findElements(By.xpath("//div[@id=\"group-11\"]/table/tbody/tr[" + cc + "]/td[5]/a"));
/*  892 */             System.out.println(caa11.size());
/*  894 */             if (caa11.size() != 1) {
/*  896 */               for (int ct = 1; ct <= caa11.size(); ct++) {
/*  904 */                 WebElement cdd1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-11\"]/table/tbody/tr[" + cc + "]/td[5]/a[" + ct + "]"));
/*  905 */                 String cddd1 = cdd1.getText();
/*  907 */                 String cd2 = cdd1.getAttribute("href");
/*  911 */                 String ctr = "<a href=" + cd2 + ">" + cddd1 + "</a>";
/*  913 */                 if (ct == 1) {
/*  915 */                   ccat = ctr;
/*      */                 } else {
/*  919 */                   ccat = String.valueOf(ccat) + "," + ctr;
/*      */                 } 
/*      */               } 
/*      */             } else {
/*  930 */               WebElement dd1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-11\"]/table/tbody/tr[" + cc + "]/td[5]/a"));
/*  931 */               String cddd1 = dd1.getText();
/*  933 */               String cd2 = dd1.getAttribute("href");
/*  938 */               String ctr = "<a href=" + cd2 + ">" + cddd1 + "</a>";
/*  940 */               ccat = ctr;
/*      */             } 
/*  960 */             WebElement cb2 = chromeDriver.findElement(By.xpath("//div[@id=\"group-11\"]/table/tbody/tr[" + cc + "]/td/a"));
/*  961 */             String cb3 = cb2.getText();
/*  963 */             String cb4 = cb2.getAttribute("href");
/*  966 */             Thread.sleep(2000L);
/* 1008 */             message5 = String.valueOf(message5) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + cb4 + ">" + cb3 + "</a></td>" + 
/*      */               
/* 1010 */               "<td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + ccat + "</td></tr>";
/* 1013 */             ccount++;
/*      */           } 
/*      */         } 
/* 1020 */         if (s != 0) {
/* 1023 */           WebElement Skippedbut = chromeDriver.findElement(By.xpath("//li[@id=\"node-6\"]/a"));
/* 1024 */           String Skippedbutlink = Skippedbut.getAttribute("href");
/* 1025 */           Skippedbut.click();
/* 1028 */           Thread.sleep(2000L);
/* 1030 */           List<WebElement> aa5 = chromeDriver.findElements(By.xpath("//div[@id=\"group-6\"]/table/tbody/tr"));
/* 1031 */           System.out.println(aa5.size());
/* 1033 */           for (int ss = 2; ss <= aa5.size(); ss++) {
/*      */             String scomment;
/* 1036 */             WebElement sbb = chromeDriver.findElement(By.xpath("//div[@id=\"group-6\"]/table/tbody/tr[" + ss + "]/td[5]"));
/* 1037 */             String sbbb = sbb.getText();
/* 1054 */             WebElement sb2 = chromeDriver.findElement(By.xpath("//div[@id=\"group-6\"]/table/tbody/tr[" + ss + "]/td/a"));
/* 1055 */             String sb3 = sb2.getText();
/* 1057 */             String sb4 = sb2.getAttribute("href");
/* 1060 */             Thread.sleep(2000L);
/* 1062 */             chromeDriver.get(sb4);
/* 1064 */             Thread.sleep(4000L);
/* 1067 */             WebElement sbpre = chromeDriver.findElement(By.xpath("//div[@id=\"content-inner\"]/div[6]/span"));
/* 1068 */             String sbpr = sbpre.getText();
/* 1070 */             Thread.sleep(2000L);
/* 1073 */             if (sbpr.equals("Prerequisites")) {
/* 1076 */               jse.executeScript("window.scrollBy(0,10000)", new Object[0]);
/* 1077 */               Thread.sleep(3000L);
/* 1078 */               WebElement sbcom = chromeDriver.findElement(By.xpath("//div[@id=\"changes\"]/div/div/div/div[2]/div/p"));
/* 1081 */               String comment44 = sbcom.getText();
/* 1085 */               if (comment44.startsWith("This test")) {
/* 1087 */                 scomment = comment44.replaceAll(comment44, "-");
/* 1088 */                 System.out.println("new" + scomment);
/*      */               } else {
/* 1093 */                 scomment = comment44;
/*      */               } 
/*      */             } else {
/* 1104 */               WebElement sbcom = chromeDriver.findElement(By.xpath("//div[@id=\"content-inner\"]/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/p"));
/* 1107 */               String comment44 = sbcom.getText();
/* 1109 */               if (comment44.startsWith("This test")) {
/* 1111 */                 scomment = comment44.replaceAll(comment44, "-");
/* 1112 */                 System.out.println("new" + scomment);
/*      */               } else {
/* 1117 */                 scomment = comment44;
/*      */               } 
/*      */             } 
/* 1122 */             chromeDriver.navigate().back();
/* 1124 */             Thread.sleep(3000L);
/* 1127 */             message6 = String.valueOf(message6) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + sb4 + ">" + sb3 + "</a></td>" + 
/*      */               
/* 1129 */               "<td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + scomment + "</td></tr>";
/* 1131 */             scount++;
/*      */           } 
/*      */         } 
/* 1138 */         if (A != 0) {
/* 1141 */           WebElement Applicablebut = chromeDriver.findElement(By.xpath("//li[@id=\"node-12\"]/a"));
/* 1142 */           String Applicablebutlink = Applicablebut.getAttribute("href");
/* 1143 */           Applicablebut.click();
/* 1146 */           Thread.sleep(2000L);
/* 1148 */           List<WebElement> aa6 = chromeDriver.findElements(By.xpath("//div[@id=\"group-12\"]/table/tbody/tr"));
/* 1149 */           System.out.println(aa6.size());
/* 1151 */           for (int q = 2; q <= aa6.size(); q++) {
/* 1154 */             WebElement abb = chromeDriver.findElement(By.xpath("//div[@id=\"group-12\"]/table/tbody/tr[" + q + "]/td[5]"));
/* 1155 */             String abbb = abb.getText();
/* 1157 */             String acomment = null;
/* 1159 */             if (abbb.equals("")) {
/* 1163 */               WebElement abb1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-12\"]/table/tbody/tr[" + q + "]/td[5]"));
/* 1164 */               ab1 = abb1.getAttribute("href");
/*      */             } else {
/* 1171 */               WebElement abb1 = chromeDriver.findElement(By.xpath("//div[@id=\"group-12\"]/table/tbody/tr[" + q + "]/td[5]/a"));
/* 1172 */               ab1 = abb1.getAttribute("href");
/*      */             } 
/* 1175 */             WebElement ab2 = chromeDriver.findElement(By.xpath("//div[@id=\"group-12\"]/table/tbody/tr[" + q + "]/td/a"));
/* 1176 */             String ab3 = ab2.getText();
/* 1178 */             String ab4 = ab2.getAttribute("href");
/* 1181 */             Thread.sleep(4000L);
/* 1183 */             chromeDriver.get(ab4);
/* 1185 */             Thread.sleep(4000L);
/* 1188 */             WebElement abpre = chromeDriver.findElement(By.xpath("//div[@id=\"content-inner\"]/div[6]/span"));
/* 1189 */             String abpr = abpre.getText();
/* 1191 */             Thread.sleep(2000L);
/* 1194 */             if (abpr.equals("Prerequisites")) {
/* 1197 */               jse.executeScript("window.scrollBy(0,10000)", new Object[0]);
/* 1198 */               Thread.sleep(3000L);
/* 1199 */               WebElement abcom = chromeDriver.findElement(By.xpath("//div[@id=\"changes\"]/div/div/div/div[2]/div/p"));
/* 1202 */               String comment2 = abcom.getText();
/* 1204 */               if (comment2.startsWith("This test")) {
/* 1206 */                 acomment = comment2.replaceAll(comment2, "-");
/* 1207 */                 System.out.println("new" + acomment);
/*      */               } else {
/* 1212 */                 acomment = comment2;
/*      */               } 
/*      */             } else {
/* 1221 */               WebElement abcom = chromeDriver.findElement(By.xpath("//div[@id=\"content-inner\"]/div[13]/div[2]/div/div/div/div/div/div/div[2]/div/p"));
/* 1224 */               String comment2 = abcom.getText();
/* 1225 */               if (comment2.startsWith("This test")) {
/* 1227 */                 acomment = comment2.replaceAll(comment2, "-");
/* 1228 */                 System.out.println("new" + acomment);
/*      */               } else {
/* 1232 */                 acomment = comment2;
/*      */               } 
/*      */             } 
/* 1238 */             chromeDriver.navigate().back();
/* 1240 */             Thread.sleep(3000L);
/* 1243 */             message7 = String.valueOf(message7) + "<tr style='font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><a href=" + ab4 + ">" + ab3 + "</a></td>" + 
/*      */               
/* 1246 */               "<td style='padding: 8px;text-align:left;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'>" + acomment + "</td></tr>";
/* 1248 */             acount++;
/*      */           } 
/*      */         } 
/* 1263 */         chromeDriver.close();
/* 1294 */         String host = "smtp.example.com";
/* 1295 */         String port = "25";
/* 1299 */         String[] namelist9 = { 
/* 1299 */             "user1@example.com", "user2@example.com", "user3@example.com", "user4@example.com"};
/* 1303 */         for (int uu = 0; uu < namelist9.length; uu++) {
/* 1305 */           if (FILEPath2.equals(namelist9[uu])) {
/* 1308 */             String mailFrom = FILEPath2;
/* 1313 */             String password = FILEPath3;
/* 1317 */             String mailTo = FILEPath2;
/* 1321 */             String subject = "Execution Report";
/* 1327 */             String message = " <font face=\"Calibri\">Hi All,</font><br><br>";
/* 1338 */             message = String.valueOf(message) + "<font face=\"Calibri\">Please find the execution report for <a href=" + FILEPath1 + ">" + title1 + "</a> from <a href=" + name2 + ">" + name1 + "</a></font><br><br>";
/* 1341 */             message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 1345 */             message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Run Name</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Status</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Passed</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Blocked</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Retest</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Failed</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Caution</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Skipped</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Running</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Not Applicable</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Pass Percent</b></td></tr>";
/* 1361 */             message = String.valueOf(message) + message1;
/* 1364 */             message = String.valueOf(message) + "</tr>";
/* 1365 */             message = String.valueOf(message) + "</table><br><br>";
/* 1410 */             message = String.valueOf(message) + "<font face=\"Calibri\"><b><u>Defects List</u></b></font><br><br>";
/* 1439 */             if (b != 0) {
/* 1440 */               message = String.valueOf(message) + "<font face=\"Calibri\"><b>Blocked Cases :</b></font> " + bcount + " <br> <br>";
/* 1443 */               message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 1447 */               message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><span style=font face:\"Calibri\" font size:\"11\"><b>Blocked Case ID</b></span></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Defects</b></td></tr>";
/* 1455 */               message = String.valueOf(message) + message3;
/* 1458 */               message = String.valueOf(message) + "</tr>";
/* 1459 */               message = String.valueOf(message) + "</table><br><br>";
/*      */             } 
/* 1463 */             if (f != 0) {
/* 1465 */               message = String.valueOf(message) + "<font face=\"Calibri\"><b>Failed Cases :</b></font> " + fcount + " <br> <br>";
/* 1468 */               message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 1470 */               message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Failed Case ID</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Defects</b></td></tr>";
/* 1475 */               message = String.valueOf(message) + message4;
/* 1478 */               message = String.valueOf(message) + "</tr>";
/* 1479 */               message = String.valueOf(message) + "</table><br><br>";
/*      */             } 
/* 1483 */             if (c != 0) {
/* 1485 */               message = String.valueOf(message) + "<font face=\"Calibri\"><b>Caution Cases :</b> </font>" + ccount + " <br> <br>";
/* 1488 */               message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 1490 */               message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Caution Case ID</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Defects</b></td></tr>";
/* 1495 */               message = String.valueOf(message) + message5;
/* 1498 */               message = String.valueOf(message) + "</tr>";
/* 1499 */               message = String.valueOf(message) + "</table><br><br>";
/*      */             } 
/* 1503 */             if (s != 0) {
/* 1505 */               message = String.valueOf(message) + "<font face=\"Calibri\"><b>Skipped Cases :</b></font> " + scount + " <br> <br>";
/* 1508 */               message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 1510 */               message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Skipped Case ID</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Comments</b></td></tr>";
/* 1515 */               message = String.valueOf(message) + message6;
/* 1518 */               message = String.valueOf(message) + "</tr>";
/* 1519 */               message = String.valueOf(message) + "</table><br><br>";
/*      */             } 
/* 1522 */             if (A != 0) {
/* 1524 */               message = String.valueOf(message) + "<font face=\"Calibri\"><b>Not Applicable Cases :</b></font> " + acount + " <br> <br>";
/* 1527 */               message = String.valueOf(message) + "<table style='border-collapse: collapse;border: 1px solid black;'>";
/* 1529 */               message = String.valueOf(message) + "<tr style='background-color:lightblue; font-family: Calibri; font-size: 11pt'><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;bgcolor=\"#FFD933\"'><b>Not Applicable Case ID</b></td><td style='padding: 8px;text-align:center;vertical-align:middle;border-collapse: collapse;border: 1px solid black;'><b>Comments</b></td></tr>";
/* 1534 */               message = String.valueOf(message) + message7;
/* 1537 */               message = String.valueOf(message) + "</tr>";
/* 1538 */               message = String.valueOf(message) + "</table><br><br>";
/*      */             } 
/* 1546 */             message = String.valueOf(message) + "<font face=\"Calibri\">Thanks,</font></br>";
/* 1547 */             message = String.valueOf(message) + "<font face=\"Calibri\"> " + FILEPath4 + "</font></br>";
/* 1550 */             Tar mailer = new Tar();
/*      */             try {
/* 1555 */               mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo, subject, message);
/* 1556 */               System.out.println("Email sent.");
/* 1557 */             } catch (Exception ex) {
/* 1558 */               System.out.println("Failed to sent email.");
/* 1559 */               ex.printStackTrace();
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ }

