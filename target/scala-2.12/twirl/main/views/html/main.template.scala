
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*7.2*/import javax.swing.text.html.HTML

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.32*/("""
"""),_display_(/*9.2*/(headerBar: Html)),format.raw/*9.19*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
        """),_display_(/*20.10*/headerBar),format.raw/*20.19*/("""

        """),format.raw/*23.32*/("""
        """),_display_(/*24.10*/content),format.raw/*24.17*/("""




        """),format.raw/*29.9*/("""<script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.versioned("javascripts/main.js")),format.raw/*29.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 24 16:30:53 NZDT 2019
                  SOURCE: C:/Users/domin/IdeaProjects/weekend/app/views/main.scala.html
                  HASH: 1e8c209509a5129a455ab050878cb19e73d114a4
                  MATRIX: 651->266|993->302|1118->332|1146->335|1183->352|1214->356|1297->464|1334->474|1369->482|1395->487|1485->550|1500->556|1563->597|1652->659|1667->665|1728->704|1793->742|1823->751|1863->854|1901->865|1929->872|1974->890|2015->904|2030->910|2091->950
                  LINES: 24->7|29->8|34->8|35->9|35->9|37->11|40->14|41->15|41->15|41->15|42->16|42->16|42->16|43->17|43->17|43->17|46->20|46->20|48->23|49->24|49->24|54->29|54->29|54->29|54->29
                  -- GENERATED --
              */
          