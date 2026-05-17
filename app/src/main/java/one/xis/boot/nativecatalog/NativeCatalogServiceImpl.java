package one.xis.boot.nativecatalog;

class NativeCatalogServiceImpl implements NativeCatalogService {

    private final NativeCatalogTextProvider textProvider;
    private final NativeCatalogRepository repository;

    NativeCatalogServiceImpl(NativeCatalogTextProvider textProvider, NativeCatalogRepository repository) {
        this.textProvider = textProvider;
        this.repository = repository;
    }

    @Override
    public String message() {
        return textProvider.prefix() + " via bean service and " + repository.firstEntry().label();
    }
}
