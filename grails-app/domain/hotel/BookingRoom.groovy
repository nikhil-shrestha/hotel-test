package hotel

import grails.compiler.GrailsCompileStatic
import grails.gorm.MultiTenant
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
@GrailsCompileStatic
class BookingRoom implements MultiTenant<Booking> {
  Booking booking
  Room room
  String username

  static mapping = {
    tenantId name: 'username'
  }

  static constraints = {
    booking nullable: false
    room nullable: false
  }
}
