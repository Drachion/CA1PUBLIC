
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empForm: Form[models.users.Employee], addressForm: Form[models.users.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Employee",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Employee</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addEmployeeSubmit, 'class -> "form-horizontal", 'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*12.158*/ {_display_(Seq[Any](format.raw/*12.160*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(empForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.88*/("""
             """),_display_(/*17.15*/inputText(empForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.86*/("""
             """),_display_(/*18.15*/inputDate(empForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.122*/("""
             """),_display_(/*19.15*/inputText(empForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.94*/("""
             """),format.raw/*20.14*/("""<!-- """),_display_(/*20.20*/inputText(empForm("dept"), '_label -> "Department", 'class -> "form-control")),format.raw/*20.97*/("""          """),format.raw/*20.107*/("""-->
             """),_display_(/*21.15*/inputText(empForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*21.93*/("""
             
		"""),format.raw/*23.3*/("""<p><strong>Assign Projects</strong></p>
            """),_display_(/*24.14*/for((value, name) <- project.Project.options) yield /*24.59*/ {_display_(Seq[Any](format.raw/*24.61*/("""
                """),format.raw/*25.17*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*25.68*/value),format.raw/*25.73*/(""""  
                    """),_display_(/*26.22*/if(empForm("id").getValue.isPresent && empForm("id").getValue.get != "")/*26.94*/ {_display_(Seq[Any](format.raw/*26.96*/(""" 
                        """),_display_(/*27.26*/if(project.Project.inProject(value.toLong, empForm("id").getValue.get.toLong))/*27.104*/ {_display_(Seq[Any](format.raw/*27.106*/("""
                            """),format.raw/*28.29*/("""checked
                        """)))}),format.raw/*29.26*/("""
                    """)))}),format.raw/*30.22*/(""" 
                """),format.raw/*31.17*/("""/> """),_display_(/*31.21*/name),format.raw/*31.25*/(""" """),format.raw/*31.26*/("""</br>
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""</p>

	
"""),_display_(/*36.2*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*36.92*/("""
             """),_display_(/*37.15*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*37.105*/("""
             """),_display_(/*38.15*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*38.90*/("""
             """),_display_(/*39.15*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*39.98*/("""

             """),_display_(/*41.15*/inputText(empForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*41.105*/("""
             """),_display_(/*42.15*/inputText(addressForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*42.82*/("""



             """),format.raw/*46.14*/("""<label>Image Upload</label>
             <input class="btn-sm btn-default" type="file" name="upload"> 

            
            <!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            
            """),_display_(/*55.14*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*55.108*/ {_display_(Seq[Any](format.raw/*55.110*/("""
            """),format.raw/*56.13*/("""<div class="actions">
                <input type="submit" value="Add / Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.HomeController.usersEmployees()),format.raw/*58.65*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*62.10*/(""" """),format.raw/*63.24*/("""
""")))}),format.raw/*64.2*/(""" """),format.raw/*64.20*/("""
""")))}))
      }
    }
  }

  def render(empForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(empForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (empForm,addressForm,user) => apply(empForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 13:59:20 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/app/views/addEmployee.scala.html
                  HASH: 3744ac9094c52652e4a94fa9bd3002cb48d06814
                  MATRIX: 1020->1|1196->108|1240->105|1268->124|1295->126|1328->151|1366->152|1397->157|1720->454|1882->606|1923->608|1960->645|1997->744|2034->754|2047->758|2078->768|2120->783|2214->856|2256->871|2348->942|2390->957|2519->1064|2561->1079|2661->1158|2703->1172|2736->1178|2834->1255|2873->1265|2918->1283|3017->1361|3061->1378|3141->1431|3202->1476|3242->1478|3287->1495|3365->1546|3391->1551|3443->1576|3524->1648|3564->1650|3618->1677|3706->1755|3747->1757|3804->1786|3868->1819|3921->1841|3967->1859|3998->1863|4023->1867|4052->1868|4102->1887|4143->1900|4178->1909|4289->1999|4331->2014|4443->2104|4485->2119|4581->2194|4623->2209|4727->2292|4770->2308|4882->2398|4924->2413|5012->2480|5057->2497|5458->2871|5562->2965|5603->2967|5644->2980|5811->3120|5826->3126|5879->3158|6044->3292|6073->3371|6105->3373|6134->3391
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|51->20|51->20|52->21|52->21|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|61->30|62->31|62->31|62->31|62->31|63->32|64->33|67->36|67->36|68->37|68->37|69->38|69->38|70->39|70->39|72->41|72->41|73->42|73->42|77->46|86->55|86->55|86->55|87->56|89->58|89->58|89->58|93->62|93->63|94->64|94->64
                  -- GENERATED --
              */
          