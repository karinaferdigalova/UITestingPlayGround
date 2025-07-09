package utils;

public enum HomePageMenuItem {
    DYNAMIC_ID("Dynamic ID"),
    CLASS_ATTRIBUTE("Class Attribute"),
    HIDDEN_LAYERS("Hidden layers"),
    LOAD_DELAY("Load delay");
    private final String locator;

    HomePageMenuItem(String locator) {
        this.locator = locator;

    }
public String getLocator(){
        return locator;
}


}
