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
    public static UpdateEmployeePage updateEmployeePage;
    public static AdminMembershipsPage adminMembershipsPage;
    public static JobDetailsPage jobDetailsPage;
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
        updateEmployeePage = new UpdateEmployeePage();
        jobDetailsPage = new JobDetailsPage();

    }
}
