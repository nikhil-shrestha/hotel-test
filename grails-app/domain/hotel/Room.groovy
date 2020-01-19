package hotel

import grails.compiler.GrailsCompileStatic
import grails.gorm.MultiTenant
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
@GrailsCompileStatic
class Room implements MultiTenant<Booking> {
  String name
  String username

  static mapping = {
    tenantId name: 'username'
  }

  static constraints = {
    name nullable: false, blank: false, maxSize: 255
  }
}
