// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/domin/IdeaProjects/weekend/conf/routes
// @DATE:Sun Feb 24 15:54:07 NZDT 2019


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
