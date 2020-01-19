package hotel

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.services.Service
import groovy.transform.CompileStatic

@CompileStatic
@CurrentTenant
@Service(Booking)
interface BookingDataService {

    Booking get(Serializable id)

    List<Booking> list(Map args)

    Long count()

    void delete(Serializable id)

    Booking save(Booking booking)
}