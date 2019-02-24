
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

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(headerBar: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*3.2*/session()),format.raw/*3.11*/("""



"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">

    <head>
        <meta charset="UTF-8">
        <title>Dollar Luxury Home</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/confirmAndLoginCustomer.js")),format.raw/*17.88*/(""""></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/confirm_password.js")),format.raw/*18.81*/(""""></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/confirm_email_login.js")),format.raw/*19.84*/(""""></script>


    </head>


    <script>
            window.fbAsyncInit = function () """),format.raw/*26.46*/("""{"""),format.raw/*26.47*/("""
                """),format.raw/*27.17*/("""FB.init("""),format.raw/*27.25*/("""{"""),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""appId: '311623609267600',
                    autoLogAppEvents: true,
                    xfbml: true,
                    version: 'v2.10'
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/(""");
                FB.AppEvents.logPageView();
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/(""";
            (function (d, s, id) """),format.raw/*35.34*/("""{"""),format.raw/*35.35*/("""
                """),format.raw/*36.17*/("""var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id)) """),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""
                    """),format.raw/*38.21*/("""return;
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
                """),format.raw/*40.17*/("""js = d.createElement(s);
                js.id = id;
                js.src = "//connect.facebook.net/en_US/sdk.js";
                fjs.parentNode.insertBefore(js, fjs);
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""(document, 'script', 'facebook-jssdk'));
    </script>
    <body>

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Dollar Luxury</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href=""""),_display_(/*54.50*/routes/*54.56*/.HomeController.index()),format.raw/*54.79*/("""">Home Of Bargains</a></li>
                </ul>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">How Our Auctions Work</a></li>
                </ul>
                """),format.raw/*59.45*/("""
                """),_display_(/*60.18*/if(session().get("firstName") == null || session.isEmpty || session == null)/*60.94*/ {_display_(Seq[Any](format.raw/*60.96*/("""
                    """),format.raw/*61.21*/("""<ul class="nav navbar-nav navbar-right">

                        <li><a data-toggle="modal" href="#myModalSignUp"><span class="glyphicon glyphicon-user"></span>
                            Sign Up</a>
                        </li>
                        <li><a data-toggle="modal" href="#myModalLogin"><span class="glyphicon glyphicon-log-in"></span>
                            Login</a>
                        </li>
                    </ul>
                """)))}/*70.19*/else/*70.24*/{_display_(Seq[Any](format.raw/*70.25*/("""
                    """),format.raw/*71.21*/("""<ul class="nav navbar-nav navbar-right">

                        <li><a><span class="glyphicon glyphicon-user"></span>
                            Welcome back """),_display_(/*74.43*/session()/*74.52*/.get("firstName")),format.raw/*74.69*/(""" """),format.raw/*74.70*/("""</a>
                        </li>
                        <li><a href=""><span class="glyphicon glyphicon-log-out"></span>
                            Logout</a>
                        </li>
                    </ul>
                """)))}),format.raw/*80.18*/("""
                """),format.raw/*81.39*/("""
            """),format.raw/*82.13*/("""</div>
        </nav>


        """),format.raw/*86.60*/("""
        """),format.raw/*87.9*/("""<div class="container">

                <!-- Modal -->
            <div class="modal fade" id="myModalSignUp" role="dialog">
                <div class="modal-dialog">

                        <!-- Modal content-->

                    <div class="modal-content">

                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Sign up</h4>
                        </div>

                        <div class="col-md-6">

                            <div class="modal-body">
                                <form method="" name="signupForm" id="signupForm">
                                    <div class="form-group">
                                        """),_display_(/*107.42*/CSRF/*107.46*/.formField),format.raw/*107.56*/("""
                                        """),format.raw/*108.41*/("""<label for="fname">First Name:</label>
                                        <input type="text" class="form-control" id="firstName" name="firstName"
                                        data-fv-notempty="false">

                                        <label for="lname">Last Name:</label>
                                        <input type="text" class="form-control" id="lastName" name="lastName">

                                        <label for="email">Email:</label>
                                        <input type="email" class="form-control" id="email" name="email">

                                        <label for="password">Password:</label>
                                        <input type="password" class="form-control" id="password" name="password">

                                        <label for="confirm_password">Confirm Password:</label>
                                        <input type="password" class="form-control" id="confirm_password" name="confirm_password">

                                    </div>
                                </form>
                            </div>

                        </div>
                            <!-- Split the one Modal into two seections, this section is for using facebook to login-->
                        <div class="col-md-6">
                            <div class="modal-body">
                                <div class="form-group">
                                    <label for="fbook">Or, Signup with Facebook:</label>
                                    <br>
                                    <div class="fb-login-button" data-max-rows="1" data-size="large" data-button-type="continue_with" data-show-faces="false" data-auto-logout-link="false" data-use-continue-as="true"></div>
                                </div>
                            </div>

                        </div>


                        <div class="modal-footer">
                            <div class="col-md-12">

                                <div class="form-group">

                                    <button type="button" class="btn btn-default" id="submitBtn" name="submitBtn" onclick="validatePassword()">
                                        Submit</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                </div>

                            </div>
                        </div>

                    </div>

                </div>

            </div>

        </div>


        """),format.raw/*164.61*/("""

        """),format.raw/*166.9*/("""<div class="container">

                <!-- Modal -->
            <div class="modal fade" id="myModalLogin" role="dialog">
                <div class="modal-dialog">

                        <!-- Modal content-->

                    <div class="modal-content">

                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Sign up</h4>
                        </div>

                        <div class="col-md-6">

                            <div class="modal-body">
                                <form method="post" name="loginForm" id="loginForm" action="">
                                    <div class="form-group">
                                        """),_display_(/*186.42*/CSRF/*186.46*/.formField),format.raw/*186.56*/("""
                                        """),format.raw/*187.41*/("""<label for="email">Email:</label>
                                        <input type="email" class="form-control" id="emailFromLogin" name="emailFromLogin" required="true" onblur="myBlurFunction()">

                                        <label for="password">Password:</label>
                                        <input type="password" class="form-control" id="passwordFromLogin" name="passwordFromLogin" required="true" onblur="myBlurFunction()">



                                    </div>

                            </div>

                        </div>
                            <!-- Split the one Modal into two seections, this section is for using facebook to login-->
                        <div class="col-md-6">
                            <div class="modal-body">
                                <div class="form-group">
                                    <label for="fbook">Or, Signup with Facebook:</label>
                                    <br>
                                    <div class="fb-login-button" data-max-rows="1" data-size="large" data-button-type="continue_with" data-show-faces="false" data-auto-logout-link="false" data-use-continue-as="true"></div>
                                </div>
                            </div>

                        </div>


                        <div class="modal-footer">
                            <div class="col-md-12">

                                <div class="form-group">
                                    <button type="submit" class="btn btn-default" id="submitBtnFromLogin" name="">
                                        Submit</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>

                                </div>
                                </form>
                            </div>
                        </div>

                    </div>

                </div>

            </div>

        </div>


        <div class="container">

                <!-- Modal  for confirming sign in-->
            <div class="modal fade" id="myModalToAuctionPage" role="dialog" data-keyboard="false" data-backdrop="static">
                <div class="modal-dialog">

                        <!-- Modal content-->

                    <div class="modal-content">

                        <div class="modal-header">
                            <h4 class="modal-title">Sign up</h4>
                        </div>

                        <div class="col-md-6">

                            <div class="modal-body">
                                <p id="signedUpName">Thanks for signing up with us today, good luck with your bidding!</p>

                            </div>

                        </div>


                        <div class="modal-footer">
                            <div class="col-md-12">

                                <form method="get" id="auctionForm" action="">
                                    <div class="form-group">

                                        <button type="submit" class="btn btn-default" >
                                            Close</button>

                                    </div>
                                </form>
                            </div>
                        </div>

                    </div>

                </div>

            </div>

        </div>
"""))
      }
    }
  }

  def render(headerBar:Html): play.twirl.api.HtmlFormat.Appendable = apply(headerBar)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (headerBar) => apply(headerBar)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 24 16:29:15 NZDT 2019
                  SOURCE: C:/Users/domin/IdeaProjects/weekend/app/views/header.scala.html
                  HASH: 44a2101b102c593f3bc54bd59742128101bffabb
                  MATRIX: 947->1|1037->21|1082->18|1110->39|1139->48|1173->56|1693->549|1708->555|1788->614|1850->649|1865->655|1938->707|2000->742|2015->748|2091->803|2212->896|2241->897|2287->915|2323->923|2352->924|2402->946|2590->1106|2619->1107|2708->1168|2737->1169|2801->1205|2830->1206|2876->1224|2991->1311|3020->1312|3070->1334|3123->1359|3152->1360|3198->1378|3413->1565|3442->1566|3863->1960|3878->1966|3922->1989|4169->2236|4215->2255|4300->2331|4340->2333|4390->2355|4882->2829|4895->2834|4934->2835|4984->2857|5176->3022|5194->3031|5232->3048|5261->3049|5534->3291|5580->3331|5622->3345|5686->3432|5723->3442|6573->4264|6587->4268|6619->4278|6690->4320|9360->7013|9400->7025|10261->7858|10275->7862|10307->7872|10378->7914
                  LINES: 28->1|31->2|34->1|35->3|35->3|39->7|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|58->26|58->26|59->27|59->27|59->27|60->28|64->32|64->32|66->34|66->34|67->35|67->35|68->36|69->37|69->37|70->38|71->39|71->39|72->40|76->44|76->44|86->54|86->54|86->54|91->59|92->60|92->60|92->60|93->61|102->70|102->70|102->70|103->71|106->74|106->74|106->74|106->74|112->80|113->81|114->82|118->86|119->87|139->107|139->107|139->107|140->108|196->164|198->166|218->186|218->186|218->186|219->187
                  -- GENERATED --
              */
          