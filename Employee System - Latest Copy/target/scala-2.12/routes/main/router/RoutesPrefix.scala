// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/conf/routes
// @DATE:Mon Mar 18 13:53:51 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
