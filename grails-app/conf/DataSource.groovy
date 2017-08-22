dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
        dataSource {
            url = "jdbc:mysql://mysql-prashant.mysql.database.azure.com:3306/azure_session?verifyServerCertificate=true&useSSL=true&requireSSL=false"
            username = "mysql-prashant@mysql-prashant"
            password = "Fin@default1"
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
        }
        grails {
            mongo {
                url = "mongodb://cosmo-mongo-prashant:QrD0Wlg15JEP8Hp5matCiq5sAJdHKPbNdIsLwtkfzpsCyQZ4ImjyCKhKvTajeGucffQQEKzfAYYfP0FTkJIrZQ==@cosmo-mongo-prashant.documents.azure.com:10255/azure_session?ssl=true&replicaSet=globaldb"
                options {
                    autoConnectRetry = true
                    connectTimeout = 20000;
                    socketTimeout = 60000;
                    maxWaitTime = 120000;
                    connectionsPerHost = 100
                    threadsAllowedToBlockForConnectionMultiplier = 10
                }
            }
        }
    }
}