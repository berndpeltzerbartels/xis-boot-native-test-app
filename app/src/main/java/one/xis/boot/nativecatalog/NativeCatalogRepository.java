package one.xis.boot.nativecatalog;

import one.xis.sql.Repository;
import one.xis.sql.Select;

@Repository
interface NativeCatalogRepository {

    @Select("select * from native_catalog_entries order by id")
    NativeCatalogEntry firstEntry();
}
