package utils;

import pages.*;

public class PageInitializer {
    public static LoginPage login;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeSearchPage employeeSearchPage;
    public static EmployeeMembershipPage employeeMembershipPage;
    public static EmployeeMyInfoPage employeeMyInfoPage;
    public static LanguageProficiencyPage languageProficiencyPage;
    public static AddLanguagePage addLanguagePage;
    public static EmployeeDashboardPage employeeDashboardPage;


    public static AdminMembershipsPage adminMembershipsPage;
    public static void initializePageObjects(){
        login = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        employeeSearchPage = new EmployeeSearchPage();
        adminMembershipsPage = new AdminMembershipsPage();
        employeeMembershipPage = new EmployeeMembershipPage();
        employeeMyInfoPage = new EmployeeMyInfoPage();
        languageProficiencyPage = new LanguageProficiencyPage();
        addLanguagePage = new AddLanguagePage();
        employeeSearchPage= new EmployeeSearchPage();

    }
}
