package config;

public class Hrefs {
    public static final String BASE_PAGE_URL = "http://localhost/dolibarr-develop";
    public static final String ADMINTOOLS_PAGE_URL = "";
    public static final String INFORMATIONPANEL_PAGE_URL = "";
    public static final String LOGIN_PAGE_URL = "";
    public static final String HR_PAGE_URL = "";
    public static final String PRODUCTS_PAGE_URL = "";
    public static final String THIRDPARTIES_PAGE_URL = "";
    public static final String USERS_AND_GROUPS_PAGE_URL = "";
    public static final String COMPANY_PAGE_URL = "";
    public static final String MODULES_PAGE_URL = "";
    public static final String SETTINGS_PAGE_URL = "";

    // зачем href
    public static final String CREATE_USER_HREF =  BASE_PAGE_URL + "/htdocs/user/card.php?leftmenu=users&action=create";
    public static final String USER_LIST_HREF = BASE_PAGE_URL + "/htdocs/user/list.php?leftmenu=users";
    public static final String HIERARCHICAL_USER_VIEW_HREF = BASE_PAGE_URL + "/htdocs/user/hierarchy.php?leftmenu=users";
    public static final String CREATE_GROUP_HREF = BASE_PAGE_URL + "/htdocs/user/group/card.php?leftmenu=users&action=create";
    public static final String GROUP_LIST_HREF = BASE_PAGE_URL + "/htdocs/user/group/list.php?leftmenu=users"; // ERROR

}
