package one.xis.boot.nativecatalog;

import one.xis.context.Bean;
import one.xis.context.Component;
import org.h2.jdbcx.JdbcDataSource;

import javax.sql.DataSource;

@Component
class NativeCatalogConfiguration {

    @Bean
    DataSource dataSource() {
        var dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:mem:native-catalog;DB_CLOSE_DELAY=-1");
        return dataSource;
    }

    @Bean
    NativeCatalogService nativeCatalogService(NativeCatalogTextProvider textProvider,
                                              NativeCatalogRepository repository) {
        return new NativeCatalogServiceImpl(textProvider, repository);
    }

    @Bean
    NativeCatalogMessageSource nativeCatalogMessageSource() {
        return new NativeCatalogMessageSourceImpl();
    }

    @Bean
    NativeCatalogBaseFormatter nativeCatalogBaseFormatter() {
        return new NativeCatalogFormatterImpl();
    }

    @Bean
    NativeCatalogBeanConsumer nativeCatalogBeanConsumer(NativeCatalogMessageSource messageSource,
                                                        NativeCatalogBaseFormatter formatter) {
        return new NativeCatalogBeanConsumer(messageSource, formatter);
    }
}
