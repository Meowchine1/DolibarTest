package pages.defaultPages;

import com.codeborne.selenide.Selenide;
import pages.defaultPages.Page;
import pages.extraPages.BaseModule;
import webApplication.ApplicationConfig;

public class UsersAndGroupsPage extends Page  {
    public UsersAndGroupsPage(String href) {
        super(href);
    }

    public BaseModule getUserList() {
        Selenide.open(ApplicationConfig.USER_LIST_HREF);

        return null;
    }

    public BaseModule getGroupList() {
        Selenide.open(ApplicationConfig.GROUP_LIST_HREF);
        return null;
    }

    public BaseModule createUser() {
        Selenide.open(ApplicationConfig.CREATE_USER_HREF);
        return null;
    }

    public BaseModule createGroup() {
        Selenide.open(ApplicationConfig.CREATE_GROUP_HREF);
        return null;
    }

    public BaseModule updateUser() {
        Selenide.open(ApplicationConfig.USER_LIST_HREF);
        return null;
    }

    public BaseModule updateGroup() {
        Selenide.open(ApplicationConfig.GROUP_LIST_HREF);
        return null;
    }

    public BaseModule deleteUser() {
        Selenide.open(ApplicationConfig.USER_LIST_HREF);
        return null;
    }

    public BaseModule deleteGroup() {
        Selenide.open(ApplicationConfig.GROUP_LIST_HREF);
        return null;
    }

    public BaseModule getProperties() {
        return null;
    }
}
