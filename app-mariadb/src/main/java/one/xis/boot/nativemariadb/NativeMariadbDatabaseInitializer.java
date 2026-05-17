package one.xis.boot.nativemariadb;

import one.xis.context.Component;
import one.xis.context.Init;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
class NativeMariadbDatabaseInitializer {

    private final DataSource dataSource;

    NativeMariadbDatabaseInitializer(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Init
    void initialize() throws SQLException {
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            statement.execute("drop table if exists native_database_entries");
            statement.execute("create table native_database_entries (id bigint primary key, label varchar(100) not null)");
            statement.execute("insert into native_database_entries values (1, 'mariadb')");
        }
    }
}
