package hotel

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.services.Query
import grails.gorm.services.Service
import groovy.transform.CompileStatic

@SuppressWarnings('ComparisonWithSelf')
@CompileStatic
@CurrentTenant
@Service(BookingRoom)
interface BookingRoomDataService {

    BookingRoom save(Booking booking, Room room)

    void delete(Booking booking, Room room)

    Number delete(Serializable id)

    List<Room> findBookingRoomRoom(Booking booking)

    @Query("""
        select $bookingRoom.id
        from ${BookingRoom bookingRoom}
        inner join ${Booking b = bookingRoom.booking}  
        where $b.id = $bookingId
    """)
    List<Serializable> findBookingRoomIdByBookingId(Serializable bookingId)


    @Query("""
        select $extra.name 
        from ${BookingRoom bookingRoom} 
        inner join ${Room extra = bookingRoom.room}  
        inner join ${Booking b = bookingRoom.booking}  
        where $b = $booking
    """)
    List<String> findBookingRoomName(Booking booking)
}