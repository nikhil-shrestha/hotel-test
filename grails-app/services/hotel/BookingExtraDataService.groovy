package hotel

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.services.Query
import grails.gorm.services.Service
import groovy.transform.CompileStatic

@SuppressWarnings('ComparisonWithSelf')
@CompileStatic
@CurrentTenant
@Service(BookingExtra)
interface BookingExtraDataService {
    BookingExtra save(Booking booking, Extra extra)

    void delete(Booking booking, Extra extra)

    Number delete(Serializable id)

    List<Extra> findBookingExtraExtra(Booking booking)

    @Query("""
        select $bookingExtra.id 
        from ${BookingExtra bookingExtra} 
        inner join ${Booking b = bookingExtra.booking}  
        where $b.id = $bookingId
    """)
    List<Serializable> findBookingExtraIdByBookingId(Serializable bookingId)

    @Query("""
        select $extra.name 
        from ${BookingExtra bookingExtra} 
        inner join ${Extra extra = bookingExtra.extra}  
        inner join ${Booking b = bookingExtra.booking}  
        where $b = $booking
    """)
    List<String> findBookingExtraName(Booking booking)

}