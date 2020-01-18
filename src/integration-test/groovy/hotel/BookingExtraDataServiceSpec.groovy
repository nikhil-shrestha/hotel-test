package hotel

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BookingExtraDataServiceSpec extends Specification {

    BookingExtraDataService bookingExtraService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new BookingExtra(...).save(flush: true, failOnError: true)
        //new BookingExtra(...).save(flush: true, failOnError: true)
        //BookingExtra bookingExtra = new BookingExtra(...).save(flush: true, failOnError: true)
        //new BookingExtra(...).save(flush: true, failOnError: true)
        //new BookingExtra(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //bookingExtra.id
    }

    void "test get"() {
        setupData()

        expect:
        bookingExtraService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<BookingExtra> bookingExtraList = bookingExtraService.list(max: 2, offset: 2)

        then:
        bookingExtraList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        bookingExtraService.count() == 5
    }

    void "test delete"() {
        Long bookingExtraId = setupData()

        expect:
        bookingExtraService.count() == 5

        when:
        bookingExtraService.delete(bookingExtraId)
        sessionFactory.currentSession.flush()

        then:
        bookingExtraService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        BookingExtra bookingExtra = new BookingExtra()
        bookingExtraService.save(bookingExtra)

        then:
        bookingExtra.id != null
    }
}
