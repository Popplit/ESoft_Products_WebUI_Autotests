package page.kaver.main;

import page.kaver.header.HeaderElements;

public class MainPage {
    private HeaderElements headerElements;

    public HeaderElements getHeaderElements() {
        if (headerElements == null) {
            headerElements = new HeaderElements();
        }
        return headerElements;
    }
}
