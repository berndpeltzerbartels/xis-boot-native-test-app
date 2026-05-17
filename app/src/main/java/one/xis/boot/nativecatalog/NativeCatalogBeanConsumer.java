package one.xis.boot.nativecatalog;

class NativeCatalogBeanConsumer {

    private final NativeCatalogMessageSource messageSource;
    private final NativeCatalogBaseFormatter formatter;

    NativeCatalogBeanConsumer(NativeCatalogMessageSource messageSource, NativeCatalogBaseFormatter formatter) {
        this.messageSource = messageSource;
        this.formatter = formatter;
    }

    String message() {
        return formatter.format(messageSource.message());
    }
}
