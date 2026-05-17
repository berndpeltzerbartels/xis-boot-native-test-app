package one.xis.boot.nativemongodb;

import one.xis.context.Component;
import one.xis.context.Init;

@Component
class NativeMongodbDatabaseInitializer {

    private final NativeMongodbRepository repository;

    NativeMongodbDatabaseInitializer(NativeMongodbRepository repository) {
        this.repository = repository;
    }

    @Init
    void initialize() {
        repository.deleteById("native-mongodb");
        repository.save(new NativeMongodbEntry("native-mongodb", "mongodb"));
    }
}
