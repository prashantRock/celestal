import javax.net.ssl.SSLSocketFactory

dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache = false
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
        dataSource {
            url = "jdbc:mysql://localhost/gorm?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "nextdefault"
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
        }
//        grails {
//            mongo {
//                url = "mongodb://cosmos-prashant-mongo:LOwFwijFWi3v3zC2iUP7oF51b0NSWBAMGodZrRXznwzX2O2kFd3ZOE3u7DGJedpHpG068JyGWMRFjBvVm8jnTg==@cosmos-prashant-mongo.documents.azure.com:10255/azure_session?ssl=true&replicaSet=globaldb"
//            }
//        }
    }
}