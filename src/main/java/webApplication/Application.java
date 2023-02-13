package webApplication;

import pages.defaultPages.AdminToolsPage;
import pages.defaultPages.InformationPanelPage;
import pages.defaultPages.LoginPage;
import pages.defaultPages.settings.CompanyPage;
import pages.defaultPages.settings.ModulesPage;
import pages.extraPages.HRPage;
import pages.extraPages.ProductsPage;
import pages.extraPages.ThirdPartiesPage;
import pages.defaultPages.UsersAndGroupsPage;

public class Application {
    public static final AdminToolsPage adminToolsPage = new AdminToolsPage(ApplicationConfig.ADMINTOOLS_PAGE_URL);
    public static final InformationPanelPage informationPanelPage = new InformationPanelPage(ApplicationConfig.INFORMATIONPANEL_PAGE_URL);
    public static final LoginPage loginPage = new LoginPage(ApplicationConfig.LOGIN_PAGE_URL);
    public static final HRPage hrPage  = new HRPage(ApplicationConfig.HR_PAGE_URL);
    public static final ProductsPage productsPage = new ProductsPage(ApplicationConfig.PRODUCTS_PAGE_URL);
    public static final ThirdPartiesPage thirdPartiesPage = new ThirdPartiesPage(ApplicationConfig.THIRDPARTIES_PAGE_URL);
    public static final UsersAndGroupsPage usersAndGroupsPage = new UsersAndGroupsPage(ApplicationConfig.USERS_AND_GROUPS_PAGE_URL);
    public static final CompanyPage companyPage = new CompanyPage(ApplicationConfig.COMPANY_PAGE_URL);
    public static final ModulesPage modulesPage = new ModulesPage(ApplicationConfig.MODULES_PAGE_URL);


}
