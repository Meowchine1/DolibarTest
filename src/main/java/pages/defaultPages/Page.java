package pages.defaultPages;

import com.codeborne.selenide.Selenide;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Page {
    private String href;

    public void open(){
        Selenide.open(href);
    }
}
