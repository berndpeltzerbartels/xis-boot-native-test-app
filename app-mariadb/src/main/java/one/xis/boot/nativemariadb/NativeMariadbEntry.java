package one.xis.boot.nativemariadb;

import one.xis.sql.Entity;

@Entity("native_database_entries")
record NativeMariadbEntry(long id, String label) {
}
