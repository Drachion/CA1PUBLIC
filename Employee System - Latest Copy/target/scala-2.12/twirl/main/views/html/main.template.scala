
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color:#222; """),format.raw/*9.72*/("""}"""),format.raw/*9.73*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: rgb(2, 163, 83); border-width: thick; border-color: black"""),format.raw/*10.111*/("""}"""),format.raw/*10.112*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: darkred; """),format.raw/*14.33*/("""}"""),format.raw/*14.34*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>Software CA1 """),_display_(/*16.23*/pagename),format.raw/*16.31*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">Software CA1</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
			<li """),_display_(/*26.9*/if(pagename == "Projects")/*26.35*/ {_display_(Seq[Any](format.raw/*26.37*/("""class="active"""")))}),format.raw/*26.52*/("""><a href=""""),_display_(/*26.63*/routes/*26.69*/.HomeController.projects()),format.raw/*26.95*/("""">Projects</a></li>
			<li """),_display_(/*27.9*/if(pagename == "Employees")/*27.36*/ {_display_(Seq[Any](format.raw/*27.38*/("""class="active"""")))}),format.raw/*27.53*/("""><a href=""""),_display_(/*27.64*/routes/*27.70*/.HomeController.usersEmployees()),format.raw/*27.102*/("""">Employees</a></li>
			
			
			"""),_display_(/*30.5*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*30.99*/ {_display_(Seq[Any](format.raw/*30.101*/("""
				"""),format.raw/*31.5*/("""<li """),_display_(/*31.10*/if(pagename == "Managers")/*31.36*/ {_display_(Seq[Any](format.raw/*31.38*/("""class="active"""")))}),format.raw/*31.53*/("""><a href=""""),_display_(/*31.64*/routes/*31.70*/.HomeController.usersManagers()),format.raw/*31.101*/("""">View Managers</a></li>

			""")))}),format.raw/*33.5*/("""
		"""),format.raw/*34.3*/("""</ul>
			<ul class="nav navbar-nav navbar-right">
			<li """),_display_(/*36.9*/if(pagename == "Register")/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""class="active"""")))}),format.raw/*36.52*/("""><a href=""""),_display_(/*36.63*/routes/*36.69*/.LoginController.registerUser()),format.raw/*36.100*/(""""><span class="glyphicon glyphicon-user"></span> Register user</a></li>
			<li """),_display_(/*37.9*/if(pagename == "Log In")/*37.33*/ {_display_(Seq[Any](format.raw/*37.35*/("""class="active"""")))}),format.raw/*37.50*/(""">
				"""),_display_(/*38.6*/if(user != null)/*38.22*/ {_display_(Seq[Any](format.raw/*38.24*/("""
					"""),format.raw/*39.6*/("""<a href=""""),_display_(/*39.16*/routes/*39.22*/.LoginController.logout()),format.raw/*39.47*/(""""><span class="glyphicon glyphicon-log-in"></span> Log Out</a>
				""")))}/*40.7*/else/*40.12*/{_display_(Seq[Any](format.raw/*40.13*/("""
					"""),format.raw/*41.6*/("""<a href=""""),_display_(/*41.16*/routes/*41.22*/.LoginController.login()),format.raw/*41.46*/(""""><span class="glyphicon glyphicon-log-in"></span> Log In</a>
			</li>
			</ul>
""")))}),format.raw/*44.2*/(""" 
		
	    """),format.raw/*46.6*/("""</div>
	</nav>


	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Text pertaining to databases</h3>
			<p>This is a CA by James Lynam (X00073019) and Stephen Murphy(X00149904) and it <span class="redtext">will</span> be fixed before Monday!</p>
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*61.5*/content),format.raw/*61.12*/("""
		    """),format.raw/*62.7*/("""</div>
		</div>

	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by the lads.
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*74.17*/routes/*74.23*/.Assets.versioned("javascripts/main.js")),format.raw/*74.63*/(""""></script>


    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 13:53:52 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/app/views/main.scala.html
                  HASH: 67d20425273b91bc4173f5a527d047ba377dc649
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1540->370|1568->371|1601->377|1638->386|1667->387|1696->388|1819->482|1849->483|1882->489|1922->501|1951->502|1980->503|2027->522|2056->523|2089->529|2128->540|2157->541|2186->542|2253->581|2282->582|2315->588|2354->599|2383->600|2412->601|2478->639|2507->640|2540->646|2577->655|2606->656|2635->657|2679->673|2708->674|2737->676|2795->707|2824->715|3097->961|3128->983|3168->985|3214->1000|3252->1011|3267->1017|3311->1040|3361->1064|3396->1090|3436->1092|3482->1107|3520->1118|3535->1124|3582->1150|3636->1178|3672->1205|3712->1207|3758->1222|3796->1233|3811->1239|3865->1271|3924->1304|4027->1398|4068->1400|4100->1405|4132->1410|4167->1436|4207->1438|4253->1453|4291->1464|4306->1470|4359->1501|4419->1531|4449->1534|4533->1592|4568->1618|4608->1620|4654->1635|4692->1646|4707->1652|4760->1683|4866->1763|4899->1787|4939->1789|4985->1804|5018->1811|5043->1827|5083->1829|5116->1835|5153->1845|5168->1851|5214->1876|5300->1945|5313->1950|5352->1951|5385->1957|5422->1967|5437->1973|5482->1997|5593->2078|5630->2088|6066->2498|6094->2505|6128->2512|6355->2712|6370->2718|6431->2758
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|64->33|65->34|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|75->44|77->46|92->61|92->61|93->62|105->74|105->74|105->74
                  -- GENERATED --
              */
          