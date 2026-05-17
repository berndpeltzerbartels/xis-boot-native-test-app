package one.xis.boot.nativemongodb;

import one.xis.mongodb.MongoDocument;

@MongoDocument("native_database_entries")
record NativeMongodbEntry(String id, String label) {
}
