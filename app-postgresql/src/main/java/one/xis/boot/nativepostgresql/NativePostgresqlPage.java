package one.xis.boot.nativepostgresql;

import one.xis.ModelData;
import one.xis.Page;
import one.xis.WelcomePage;

@Page("/native-postgresql.html")
@WelcomePage
class NativePostgresqlPage {

    private final NativePostgresqlRepository repository;

    NativePostgresqlPage(NativePostgresqlRepository repository) {
        this.repository = repository;
    }

    @ModelData("message")
    String message() {
        return "native " + repository.firstEntry().label() + " value from database";
    }
}
