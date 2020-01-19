package hotel

import grails.gorm.services.Service
import groovy.transform.CompileStatic

@CompileStatic
@Service(User)
interface UserDataService {
    User save(String username,
              String password,
              boolean enabled,
              boolean accountExpired,
              boolean accountLocked,
              boolean passwordExpired)

    void delete(Serializable id)

    User findByUsername(String username)
}

