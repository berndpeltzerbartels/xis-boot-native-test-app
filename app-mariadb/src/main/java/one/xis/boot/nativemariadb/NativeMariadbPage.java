package one.xis.boot.nativemariadb;

import one.xis.ModelData;
import one.xis.Page;
import one.xis.WelcomePage;

@Page("/native-mariadb.html")
@WelcomePage
class NativeMariadbPage {

    private final NativeMariadbRepository repository;

    NativeMariadbPage(NativeMariadbRepository repository) {
        this.repository = repository;
    }

    @ModelData("message")
    String message() {
        return "native " + repository.firstEntry().label() + " value from database";
    }
}
