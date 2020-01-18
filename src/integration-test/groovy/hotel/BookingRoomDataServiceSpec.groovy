package hotel

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BookingRoomDataServiceSpec extends Specification {

    BookingRoomDataService bookingRoomService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new BookingRoom(...).save(flush: true, failOnError: true)
        //new BookingRoom(...).save(flush: true, failOnError: true)
        //BookingRoom bookingRoom = new BookingRoom(...).save(flush: true, failOnError: true)
        //new BookingRoom(...).save(flush: true, failOnError: true)
        //new BookingRoom(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //bookingRoom.id
    }

    void "test get"() {
        setupData()

        expect:
        bookingRoomService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<BookingRoom> bookingRoomList = bookingRoomService.list(max: 2, offset: 2)

        then:
        bookingRoomList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        bookingRoomService.count() == 5
    }

    void "test delete"() {
        Long bookingRoomId = setupData()

        expect:
        bookingRoomService.count() == 5

        when:
        bookingRoomService.delete(bookingRoomId)
        sessionFactory.currentSession.flush()

        then:
        bookingRoomService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        BookingRoom bookingRoom = new BookingRoom()
        bookingRoomService.save(bookingRoom)

        then:
        bookingRoom.id != null
    }
}
