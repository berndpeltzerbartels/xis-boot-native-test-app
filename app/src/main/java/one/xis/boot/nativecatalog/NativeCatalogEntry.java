package one.xis.boot.nativecatalog;

import one.xis.sql.Entity;

@Entity("native_catalog_entries")
record NativeCatalogEntry(long id, String label) {
}
