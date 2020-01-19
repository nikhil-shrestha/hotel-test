package hotel

import grails.gorm.MultiTenant
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
class Booking implements MultiTenant<Booking> {
  String name
  String email
  String telephone
  Date arrival
  Date departure
  int adults = 1
  int children = 0
  int babys = 0
  String username

  static mapping = {
    tenantId name: 'username'
  }

  static constraints = {
    name nullable: false, blank: false, maxSize: 255
    email nullable: false, blank: false, email: true, maxSize: 255
    telephone nullable: true, maxSize: 255
    arrival nullable: false
    departure nullable: false
    adults min: 1
    children min: 0
    babys min: 0
  }
}
