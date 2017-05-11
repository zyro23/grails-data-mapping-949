package myapp

import org.grails.datastore.gorm.GormEnhancer
import org.grails.orm.hibernate.AbstractHibernateGormStaticApi

class BootStrap {

    def init = { servletContext ->
        ((AbstractHibernateGormStaticApi) GormEnhancer.findStaticApi(Dummy)).findAllWithSql("select * from Dummy", [max: 10])
    }
    def destroy = {
    }
}
