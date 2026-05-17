package one.xis.boot.nativecatalog;

class NativeCatalogFormatterImpl extends NativeCatalogBaseFormatter {

    @Override
    String format(String value) {
        return "formatted " + value;
    }
}
