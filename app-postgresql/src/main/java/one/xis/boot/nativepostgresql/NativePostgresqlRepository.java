package one.xis.boot.nativepostgresql;

import one.xis.sql.Repository;
import one.xis.sql.Select;

@Repository
interface NativePostgresqlRepository {

    @Select("select * from native_database_entries order by id")
    NativePostgresqlEntry firstEntry();
}
