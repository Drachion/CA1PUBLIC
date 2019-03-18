
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], projects: List[models.project.Project],
user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Projects",user)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""

    """),_display_(/*5.6*/if((user != null) && ("employee".equals(user.getRole())))/*5.63*/ {_display_(Seq[Any](format.raw/*5.65*/("""
        """),format.raw/*6.9*/("""<h1>Your Current Projects</h1>
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        """),format.raw/*8.9*/("""<h1>Currently Active Projects</h1>
    """)))}),format.raw/*9.6*/("""


    """),format.raw/*12.74*/("""
	"""),_display_(/*13.3*/if(flash.containsKey("success"))/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
		"""),format.raw/*14.3*/("""<div class="alert alert-success">
			"""),_display_(/*15.5*/flash/*15.10*/.get("success")),format.raw/*15.25*/("""
		"""),format.raw/*16.3*/("""</div>
""")))}),format.raw/*17.2*/("""
    """),format.raw/*18.5*/("""<div class="col-sm-3">
        <h4>Project List</h4>
            <ul class="list-group">
                <a href = """"),_display_(/*21.29*/routes/*21.35*/.HomeController.projects(0)),format.raw/*21.62*/("""" class="list-group-item">All Projects</a>
            """),_display_(/*22.14*/for(p<-projects) yield /*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
                """),format.raw/*23.17*/("""<a href = """"),_display_(/*23.29*/routes/*23.35*/.HomeController.projects(p.getId())),format.raw/*23.70*/("""" class="list-group-item catheight">"""),_display_(/*23.107*/p/*23.108*/.getName),format.raw/*23.116*/("""
                    """),format.raw/*24.21*/("""<span class="badge">"""),_display_(/*24.42*/p/*24.43*/.getEmployees.size),format.raw/*24.61*/("""</span> 
                </a>
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</ul>
    </div>

    <div class="col-sm-9">

        """),_display_(/*32.10*/if((user != null) && ("employee".equals(user.getRole())))/*32.67*/ {_display_(Seq[Any](format.raw/*32.69*/("""
            """),format.raw/*33.13*/("""<h4>Select from your assigned projects from the list to view full list of colleagues active on it.</h4>
        """)))}/*34.11*/else/*34.16*/{_display_(Seq[Any](format.raw/*34.17*/("""
            """),format.raw/*35.13*/("""<h4>Select a project from the list to view all employees currently assigned to it.</h4>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""<table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Job Role</th>
            <th>Address</th>
            <th>Department</th>
            <th>Email</th>
            <th>DOB</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*54.66*/("""
            """),_display_(/*55.14*/for(e<-employees) yield /*55.31*/ {_display_(Seq[Any](format.raw/*55.33*/("""
               """),format.raw/*56.16*/("""<tr>
                    """),_display_(/*57.22*/if(env.resource("public/images/productImages/" + e.getId + "thumb.jpg").isDefined)/*57.104*/ {_display_(Seq[Any](format.raw/*57.106*/("""
                        """),format.raw/*58.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*58.69*/(e.getId + "thumb.jpg")),format.raw/*58.92*/(""""/></td>
                    """)))}/*59.23*/else/*59.28*/{_display_(Seq[Any](format.raw/*59.29*/("""
                        """),format.raw/*60.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*61.22*/("""
                  """),format.raw/*62.19*/("""<td>"""),_display_(/*62.24*/e/*62.25*/.getId),format.raw/*62.31*/("""</td>
                  <td>"""),_display_(/*63.24*/e/*63.25*/.getName),format.raw/*63.33*/("""</td>
                  <td>"""),_display_(/*64.24*/e/*64.25*/.getJobRole),format.raw/*64.36*/("""</td>
                  <td>"""),_display_(/*65.24*/e/*65.25*/.getAddress),format.raw/*65.36*/("""</td>
                  <td>"""),_display_(/*66.24*/e/*66.25*/.getDepartment),format.raw/*66.39*/("""</td>
                  <td>"""),_display_(/*67.24*/e/*67.25*/.getEmail),format.raw/*67.34*/("""</td>
                  <td>"""),_display_(/*68.24*/e/*68.25*/.getDateOfBirth),format.raw/*68.40*/("""</td>

                  """),_display_(/*70.20*/if((user != null) && ("manager".equals(user.getRole())))/*70.76*/ {_display_(Seq[Any](format.raw/*70.78*/("""
                  """),format.raw/*71.19*/("""<!-- Update button -->

			    <td>
					<a href=""""),_display_(/*74.16*/routes/*74.22*/.HomeController.updateEmployee(e.getEmail)),format.raw/*74.64*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
                        </td> 
                  <!-- Delete button -->

				<td>
					<a href=""""),_display_(/*81.16*/routes/*81.22*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*81.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
                </td>
                  """)))}),format.raw/*85.20*/(""" 

                """)))}),format.raw/*87.18*/("""
               """),format.raw/*88.16*/("""</tr>
            """)))}),format.raw/*89.14*/("""
        
        """),format.raw/*91.9*/("""</tbody>
    </table>
    """),_display_(/*93.6*/if((user != null) && ("manager".equals(user.getRole())))/*93.62*/ {_display_(Seq[Any](format.raw/*93.64*/("""
    """),format.raw/*94.5*/("""<p>
        <a href=""""),_display_(/*95.19*/routes/*95.25*/.HomeController.usersEmployees()),format.raw/*95.57*/("""">
            <button class="btn btn-primary">Manage Employees</button>
        </a>
    </p>
    """)))}),format.raw/*99.6*/("""
"""),format.raw/*100.1*/("""</div>
 """))
      }
    }
  }

  def render(employees:List[models.users.Employee],projects:List[models.project.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 13:53:52 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/app/views/projects.scala.html
                  HASH: 27236594a9e6984ee696adb65ddf9276cc53ff3f
                  MATRIX: 1040->1|1265->134|1294->155|1332->156|1364->163|1429->220|1468->222|1503->231|1556->268|1568->273|1606->274|1641->283|1710->323|1745->399|1774->402|1815->434|1855->436|1885->439|1949->477|1963->482|1999->497|2029->500|2067->508|2099->513|2243->630|2258->636|2306->663|2389->719|2421->735|2461->737|2506->754|2545->766|2560->772|2616->807|2681->844|2692->845|2722->853|2771->874|2819->895|2829->896|2868->914|2942->957|2978->966|3060->1021|3126->1078|3166->1080|3207->1093|3339->1207|3352->1212|3391->1213|3432->1226|3560->1323|3596->1332|4072->1833|4113->1847|4146->1864|4186->1866|4230->1882|4283->1908|4375->1990|4416->1992|4469->2017|4540->2061|4584->2084|4633->2115|4646->2120|4685->2121|4738->2146|4853->2230|4900->2249|4932->2254|4942->2255|4969->2261|5025->2290|5035->2291|5064->2299|5120->2328|5130->2329|5162->2340|5218->2369|5228->2370|5260->2381|5316->2410|5326->2411|5361->2425|5417->2454|5427->2455|5457->2464|5513->2493|5523->2494|5559->2509|5612->2535|5677->2591|5717->2593|5764->2612|5842->2663|5857->2669|5920->2711|6141->2905|6156->2911|6219->2953|6418->3121|6469->3141|6513->3157|6563->3176|6608->3194|6661->3221|6726->3277|6766->3279|6798->3284|6847->3306|6862->3312|6915->3344|7045->3444|7074->3445
                  LINES: 28->1|34->3|34->3|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|57->26|58->27|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|67->36|68->37|85->54|86->55|86->55|86->55|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|92->61|93->62|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|101->70|101->70|101->70|102->71|105->74|105->74|105->74|112->81|112->81|112->81|116->85|118->87|119->88|120->89|122->91|124->93|124->93|124->93|125->94|126->95|126->95|126->95|130->99|131->100
                  -- GENERATED --
              */
          