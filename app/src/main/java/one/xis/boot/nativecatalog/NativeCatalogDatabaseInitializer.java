package one.xis.boot.nativecatalog;

import one.xis.context.Component;
import one.xis.context.Init;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
class NativeCatalogDatabaseInitializer {

    private final DataSource dataSource;

    NativeCatalogDatabaseInitializer(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Init
    void initialize() throws SQLException {
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            statement.execute("drop table if exists native_catalog_entries");
            statement.execute("create table native_catalog_entries (id bigint primary key, label varchar(100) not null)");
            statement.execute("insert into native_catalog_entries values (1, 'h2 sql')");
        }
    }
}
