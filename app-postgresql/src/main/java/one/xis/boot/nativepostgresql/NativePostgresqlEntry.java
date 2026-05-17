package one.xis.boot.nativepostgresql;

import one.xis.sql.Entity;

@Entity("native_database_entries")
record NativePostgresqlEntry(long id, String label) {
}
