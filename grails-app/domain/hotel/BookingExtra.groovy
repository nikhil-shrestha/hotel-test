package hotel

import grails.compiler.GrailsCompileStatic
import grails.gorm.MultiTenant
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
@GrailsCompileStatic
class BookingExtra implements MultiTenant<Booking> {
  Booking booking
  Extra extra
  String username

  static mapping = {
    tenantId name: 'username'
  }

  static constraints = {
    booking nullable: false
    extra nullable: false
  }
}
