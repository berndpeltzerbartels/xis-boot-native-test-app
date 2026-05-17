package one.xis.boot.nativecatalog;

import one.xis.boot.nativeimage.NativeAppContextBuilder;
import one.xis.boot.nativeimage.NativeRunner;
import one.xis.boot.nativeimage.XisGeneratedBootFrameworkComponents;
import one.xis.boot.nativelib.NativeLibraryGreeting;
import one.xis.boot.netty.NettyServer;
import one.xis.generated.XisGeneratedApplicationComponents;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NativeBootCatalogIntegrationTest {

    @Test
    void generatedApplicationCatalogContainsPackagePrivateApplicationComponents() {
        var registry = new XisGeneratedApplicationComponents();

        assertThat(registry.componentClasses())
                .contains(NativeCatalogConfiguration.class, NativeCatalogDatabaseInitializer.class,
                        NativeCatalogPage.class, NativeCatalogRepository.class, NativeCatalogTextProvider.class)
                .doesNotContain(NativeCatalogService.class, NativeCatalogServiceImpl.class);
    }

    @Test
    void generatedCatalogsCanBuildBootContextWithoutPackageScanning() {
        var context = new NativeAppContextBuilder()
                .withRegistry(new XisGeneratedBootFrameworkComponents())
                .withRegistry(new XisGeneratedApplicationComponents())
                .build();

        assertThat(context.getSingleton(NativeCatalogService.class).message())
                .isEqualTo("native boot catalog works via bean service and h2 sql");
        assertThat(context.getSingleton(NativeCatalogBeanConsumer.class).message())
                .isEqualTo("formatted bean interface");
        assertThat(context.getSingleton(NativeCatalogPage.class).message())
                .isEqualTo("native boot catalog works via bean service and h2 sql and library component from maven local");
        assertThat(context.getSingleton(NativeLibraryGreeting.class).message())
                .isEqualTo("library component from maven local");
        assertThat(context.getSingleton(NettyServer.class)).isNotNull();
    }

    @Test
    void nativeRunnerIsGeneratedForBootApplication() throws NoSuchMethodException {
        assertThat(NativeRunner.class.getMethod("main", String[].class)).isNotNull();
    }
}
