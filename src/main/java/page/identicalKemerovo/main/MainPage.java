package page.identicalKemerovo.main;

import page.identicalKemerovo.header.HeaderElements;

public class MainPage {
    private HeaderElements headerElements;

    public HeaderElements getHeaderElements() {
        if (headerElements == null) {
            headerElements = new HeaderElements();
        }
        return headerElements;
    }
}
