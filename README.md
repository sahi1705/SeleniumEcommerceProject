# Selenium E-commerce Automation Project

## 🧾 Project Title
**Automation Test Store – Selenium E-commerce Testing**

![AS_logo](https://github.com/user-attachments/assets/52268e5f-6f2b-46d0-9bcf-634c9f54ee80)

---

## 🎯 Objective
Automate and validate key functionalities of the [Automation Test Store](https://automationteststore.com/) using Selenium WebDriver with Java and TestNG. This project simulates a real-world automation framework using best practices such as Page Object Model (POM), Maven, and TestNG.

---

## Tech Stack used in this Project

<img alt="GitHub" src="https://automationteststore.com/resources/image/18/7a/8.png" />

**Version Control and Testing tools used:**

<img alt="GitHub" src="https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white&style=flat" />

**Operating System and browsers used:**

<img alt="Windows" src="https://img.shields.io/badge/Windows-00ADEF?logo=windows&logoColor=white&style=flat" />
<img alt="Edge" src="https://img.shields.io/badge/Edge-5C2D91?logo=microsoft-edge&logoColor=white&style=flat" />
<img alt="Firefox" src="https://img.shields.io/badge/Firefox-FF9500?logo=firefox-browser&logoColor=white&style=flat" />
<img alt="Chrome" src="https://img.shields.io/badge/Chrome-4285F4?logo=google-chrome&logoColor=white&style=flat" />


## Directory Structure
AutomationStoreProject/
├─ AutomationStore2.0_Test Plan
├─ AutomationStore2.0_Test scenarios
├─ AutomationStore2.0_MindMap.png
├─ AutomationStore2.0_BugReport
├─AutomationStore2.0_SummaryReport.

## Application Under Test 

AUT URL: https://automationteststore.com/

## 🧪 Manual Testing Summary
- **Total Test Cases Executed:** 45
- ✅ Passed: 37
- ❌ Failed: 8
- 🐞 Defects Logged: 8

### 📌 Test Scenarios Covered
- Login (valid and invalid credentials)
- Product search and validation
- Add to cart functionality
- Checkout process
- Contact Us form validation
- WishList Functionality



---

## 🤖 Automation Testing Summary
### 🔧 Tech Stack
- **Language:** Java
- **Framework:** TestNG
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)
- **Browser:** Chrome

### ✅ Automated Test Scenarios
- Login
- Product Search
- Add to Cart
- Checkout Process
- Contact Us Form

### 📂 Project Structure
```bash
SeleniumEcommerceProject/
├── pom.xml
├── testng.xml
├── ExtentReport.html
├── src/
│   ├── main/java/pages/
│   │   ├── LoginPage.java
│   │   ├── HomePage.java
│   │   ├── ProductPage.java
│   │   ├── CheckoutPage.java
│   │   └── WishList.java                
│
│   └── test/java/tests/
│       ├── LoginTest.java
│       ├── SearchTest.java
│       ├── AddToCartTest.java
│       ├── CheckoutTest.java
│       ├── ContactUsTest.java
│       └── WishListTest.java           
│
├── src/main/java/utilities/
│   ├── ExtentReportManager.java        
│   └── package-info.java
│
├── src/test/java/tests/
│   └── BaseTest.java                
├── test-output/                        <
│
└── README.md
```

---
## Attachments

![1](https://github.com/user-attachments/assets/d5e12611-7576-4187-9bc6-2700abd49f09)
![2](https://github.com/user-attachments/assets/2a5c012d-512e-4621-bcd0-7ddeb0107a6b)
![4](https://github.com/user-attachments/assets/ab4cc1e9-e671-4e8d-9a75-8f3d2bcccbaa)

## 📊 Key Features
- Page Object Model for modular and scalable code
- Structured test flow using TestNG
- Browser automation with WebDriver
- Assertions to verify UI and functional elements
- Maven for dependency management and test execution

---

## 🔍 Manual Testing Insights
- Some elements lacked hover/visual feedback
- Wishlist button worked but lacked visual confirmation
- Contact form submission had no confirmation popup

---

## 📢 Outcome
Built an end-to-end Selenium automation framework and complemented it with thorough manual testing. The project demonstrates the ability to:
- Identify and test key user flows manually
- Translate them into automated scripts
- Organize tests professionally using TestNG + POM


## Recommendations & Suggestions

Based on the evaluation of Web Application, the following improvements are recommended:

1. **Wishlist Behavior**
-	Users can add to wishlist without any confirmation or visual feedback.
-	 Suggestion: Show a toast message like “Added to Wishlist” or animate the wishlist icon.
-	Also, no option to remove items from wishlist.

2. **Cart & Checkout Logic**
-	No confirmation message before proceeding to checkout
-	 Suggestion: Add a summary popup before redirecting to checkout.

3. **Search Suggestions** 
-	As-you-type suggestions are missing in the search bar.


---

Feel free to modify or add any specific details related to your implementation or other context-specific information.

## 🚀 About Me

I'm an  aspiring student in Software Engineer in Development & Testing (SDET) currently building a strong foundation in both manual testing and Automation Testing.. I focus on delivering high-quality solutions through Manual testing and Automation testing practices.

## Feedback

If you have any feedback, please reach out to me at sahilshirale324@gmail.com


