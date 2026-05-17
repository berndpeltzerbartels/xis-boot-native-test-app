package one.xis.boot.nativecatalog;

import one.xis.ModelData;
import one.xis.boot.nativelib.NativeLibraryGreeting;
import one.xis.Page;
import one.xis.WelcomePage;

@Page("/native-catalog.html")
@WelcomePage
class NativeCatalogPage {

    private final NativeCatalogService service;
    private final NativeLibraryGreeting libraryGreeting;

    NativeCatalogPage(NativeCatalogService service, NativeLibraryGreeting libraryGreeting) {
        this.service = service;
        this.libraryGreeting = libraryGreeting;
    }

    @ModelData("message")
    String message() {
        return service.message() + " and " + libraryGreeting.message();
    }
}
