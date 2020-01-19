package hotel

class BootStrap {

  UserDataService userDataService

  def init = { servletContext ->

    userDataService.save("sherlock", "123456", true, false, false, false)
    userDataService.save("watson", "123456", true, false, false, false)
  }
  def destroy = {
  }
}
