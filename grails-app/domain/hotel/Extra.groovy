package hotel

import grails.compiler.GrailsCompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
@GrailsCompileStatic
class Extra {
  String name

  static constraints = {
    name nullable: false, blank: false, maxSize: 255
  }
}
