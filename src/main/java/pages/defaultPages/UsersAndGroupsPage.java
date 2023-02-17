package pages.defaultPages;

import com.codeborne.selenide.Selenide;
import pages.Page;
import pages.extraPages.BaseModule;
import config.Hrefs;

public class UsersAndGroupsPage extends Page  {
    public UsersAndGroupsPage(String href) {
        super(href);
    }

    public BaseModule getUserList() {
        Selenide.open(Hrefs.USER_LIST_HREF);

        return null;
    }

    public BaseModule getGroupList() {
        Selenide.open(Hrefs.GROUP_LIST_HREF);
        return null;
    }

    public BaseModule createUser() {
        Selenide.open(Hrefs.CREATE_USER_HREF);
        return null;
    }

    public BaseModule createGroup() {
        Selenide.open(Hrefs.CREATE_GROUP_HREF);
        return null;
    }

    public BaseModule updateUser() {
        Selenide.open(Hrefs.USER_LIST_HREF);
        return null;
    }

    public BaseModule updateGroup() {
        Selenide.open(Hrefs.GROUP_LIST_HREF);
        return null;
    }

    public BaseModule deleteUser() {
        Selenide.open(Hrefs.USER_LIST_HREF);
        return null;
    }

    public BaseModule deleteGroup() {
        Selenide.open(Hrefs.GROUP_LIST_HREF);
        return null;
    }

    public BaseModule getProperties() {
        return null;
    }
}
