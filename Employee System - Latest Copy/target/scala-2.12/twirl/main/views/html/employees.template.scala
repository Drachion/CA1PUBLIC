
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""

    """),_display_(/*4.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*4.100*/ {_display_(Seq[Any](format.raw/*4.102*/("""
    """),format.raw/*5.5*/("""<h1>Employee Management</h1>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<h1>Employee List</h1>
    """)))}),format.raw/*8.6*/("""

    """),format.raw/*10.71*/("""
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
		"""),format.raw/*12.3*/("""<div class="alert alert-success">
			"""),_display_(/*13.5*/flash/*13.10*/.get("success")),format.raw/*13.25*/("""
		"""),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""

    """),format.raw/*17.5*/("""<div class="col-sm-12">
        <h4>Here are all the current employees on the system. </h4>



        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
                <th>Image</th>
                <th>ID</th>
                <th>Name</th>
                <th>Job Role</th>
                <th>Street1</th>
                <th>Street2</th>
                <th>Town</th>
                <th>Post Code</th>
                <!-- <th>Department</th> -->
                <th>Email</th>
                <th>DOB</th>

            <!-- DO we also need to output their address here?  -->
        </tr>
        </thead>
        <tbody>
        <!-- Managers data -->
       
            """),format.raw/*44.62*/("""
            """),_display_(/*45.14*/for(e<-employees) yield /*45.31*/ {_display_(Seq[Any](format.raw/*45.33*/("""
               """),format.raw/*46.16*/("""<tr>
                    """),_display_(/*47.22*/if(env.resource("public/images/productImages/" + e.getId + "thumb.jpg").isDefined)/*47.104*/ {_display_(Seq[Any](format.raw/*47.106*/("""
                        """),format.raw/*48.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*48.69*/(e.getId + "thumb.jpg")),format.raw/*48.92*/(""""/></td>
                    """)))}/*49.23*/else/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                        """),format.raw/*50.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*51.2*/("""
                    """),format.raw/*52.21*/("""<td>"""),_display_(/*52.26*/e/*52.27*/.getId),format.raw/*52.33*/("""</td>
                    <td>"""),_display_(/*53.26*/e/*53.27*/.getName),format.raw/*53.35*/("""</td>
                    <td>"""),_display_(/*54.26*/e/*54.27*/.getJobRole),format.raw/*54.38*/("""</td>
                    <td>"""),_display_(/*55.26*/e/*55.27*/.getAddress().getStreet1),format.raw/*55.51*/("""</td>
                    <td>"""),_display_(/*56.26*/e/*56.27*/.getAddress().getStreet2),format.raw/*56.51*/("""</td>
                    <td>"""),_display_(/*57.26*/e/*57.27*/.getAddress().getTown),format.raw/*57.48*/("""</td>
                    <td>"""),_display_(/*58.26*/e/*58.27*/.getAddress().getPostCode),format.raw/*58.52*/("""</td>
                    <!-- <td>"""),_display_(/*59.31*/e/*59.32*/.getDepartment),format.raw/*59.46*/("""</td> -->
                    <td>"""),_display_(/*60.26*/e/*60.27*/.getEmail),format.raw/*60.36*/("""</td>
                    <td>"""),_display_(/*61.26*/e/*61.27*/.getDateOfBirthString),format.raw/*61.48*/("""</td>

                    """),_display_(/*63.22*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*63.116*/ {_display_(Seq[Any](format.raw/*63.118*/("""
                  """),format.raw/*64.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*66.18*/routes/*66.24*/.HomeController.updateEmployee(e.getEmail)),format.raw/*66.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*72.18*/routes/*72.24*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*72.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*77.14*/(""" """),format.raw/*77.57*/("""
            
        """)))}),format.raw/*79.10*/("""
        
        """),format.raw/*81.9*/("""</tbody>
    </table>

    """),_display_(/*84.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*84.100*/ {_display_(Seq[Any](format.raw/*84.102*/("""
    """),format.raw/*85.5*/("""<p>
        <a href=""""),_display_(/*86.19*/routes/*86.25*/.HomeController.addEmployee()),format.raw/*86.54*/("""">
            <button class="btn btn-primary">Add a new Employee</button>
        </a>
    </p>
    """)))}),format.raw/*90.6*/("""
"""),format.raw/*91.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,user,env)

  def f:((List[models.users.Employee],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,user,env) => apply(employees,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 13:53:52 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/app/views/employees.scala.html
                  HASH: 2ff37add2fc20f17cf719c15c65c94bf8fb1a6e2
                  MATRIX: 1012->1|1197->94|1227->116|1265->117|1297->124|1400->218|1440->220|1471->225|1522->260|1534->265|1572->266|1603->271|1660->299|1694->371|1723->374|1764->406|1804->408|1834->411|1898->449|1912->454|1948->469|1978->472|2016->480|2049->486|2835->1293|2876->1307|2909->1324|2949->1326|2993->1342|3046->1368|3138->1450|3179->1452|3232->1477|3303->1521|3347->1544|3396->1575|3409->1580|3448->1581|3501->1606|3595->1670|3644->1691|3676->1696|3686->1697|3713->1703|3771->1734|3781->1735|3810->1743|3868->1774|3878->1775|3910->1786|3968->1817|3978->1818|4023->1842|4081->1873|4091->1874|4136->1898|4194->1929|4204->1930|4246->1951|4304->1982|4314->1983|4360->2008|4423->2044|4433->2045|4468->2059|4530->2094|4540->2095|4570->2104|4628->2135|4638->2136|4680->2157|4735->2185|4839->2279|4880->2281|4927->2300|5005->2351|5020->2357|5083->2399|5310->2599|5325->2605|5388->2647|5614->2842|5643->2885|5697->2908|5742->2926|5796->2954|5900->3048|5941->3050|5973->3055|6022->3077|6037->3083|6087->3112|6219->3214|6247->3215
                  LINES: 28->1|33->2|33->2|33->2|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|94->63|94->63|94->63|95->64|97->66|97->66|97->66|103->72|103->72|103->72|108->77|108->77|110->79|112->81|115->84|115->84|115->84|116->85|117->86|117->86|117->86|121->90|122->91
                  -- GENERATED --
              */
          