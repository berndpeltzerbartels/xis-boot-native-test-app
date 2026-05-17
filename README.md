# XIS Boot Native Test Apps

Small XIS Boot Native applications used to verify that native component catalogs work from a standalone application,
from a separate library module, with runtime properties, and with native database modules.

Useful tasks:

```bash
./gradlew :app:test
./gradlew :app:xisNativeSmokeTest
./gradlew :app:nativeCatalogE2e
./gradlew :app-value:nativeValueE2e
./gradlew :app-postgresql:nativePostgresqlE2e
./gradlew :app-mariadb:nativeMariadbE2e
./gradlew :app-mongodb:nativeMongodbE2e
```
