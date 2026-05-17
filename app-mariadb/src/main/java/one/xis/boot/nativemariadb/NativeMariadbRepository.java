package one.xis.boot.nativemariadb;

import one.xis.sql.Repository;
import one.xis.sql.Select;

@Repository
interface NativeMariadbRepository {

    @Select("select * from native_database_entries order by id")
    NativeMariadbEntry firstEntry();
}
