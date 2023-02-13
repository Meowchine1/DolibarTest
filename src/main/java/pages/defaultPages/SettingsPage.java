package pages.defaultPages;

import pages.defaultPages.settings.CompanyPage;
import pages.defaultPages.settings.ModulesPage;
import webApplication.Application;

public class SettingsPage extends Page{
    public SettingsPage(String href) {
        super(href);
    }

    public CompanyPage moveToCompanySettings(){
        Application.companyPage.open();
        return Application.companyPage;
    }

    public ModulesPage moveToModulesSettings(){
        Application.modulesPage.open();
        return Application.modulesPage;
    }


}
