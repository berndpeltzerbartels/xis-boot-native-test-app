package one.xis.boot.nativemongodb;

import one.xis.ModelData;
import one.xis.Page;
import one.xis.WelcomePage;

@Page("/native-mongodb.html")
@WelcomePage
class NativeMongodbPage {

    private final NativeMongodbRepository repository;

    NativeMongodbPage(NativeMongodbRepository repository) {
        this.repository = repository;
    }

    @ModelData("message")
    String message() {
        return "native " + repository.findById("native-mongodb").orElseThrow().label() + " value from database";
    }
}
