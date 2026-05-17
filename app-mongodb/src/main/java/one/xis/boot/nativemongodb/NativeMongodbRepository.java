package one.xis.boot.nativemongodb;

import one.xis.mongodb.MongoCrudRepository;
import one.xis.mongodb.MongoRepository;

@MongoRepository
interface NativeMongodbRepository extends MongoCrudRepository<NativeMongodbEntry, String> {
}
