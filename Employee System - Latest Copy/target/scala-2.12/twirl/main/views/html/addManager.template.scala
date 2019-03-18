
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Manager],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ManagerForm: Form[models.users.Manager], addressForm: Form[models.users.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Manager",user)/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Manager</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addManagerSubmit, 'class -> "form-horizontal", 'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*12.157*/ {_display_(Seq[Any](format.raw/*12.159*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(ManagerForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.92*/("""
             """),_display_(/*17.15*/inputText(ManagerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.90*/("""
             """),_display_(/*18.15*/inputDate(ManagerForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.126*/("""
             """),_display_(/*19.15*/inputText(ManagerForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.98*/("""
             """),format.raw/*20.14*/("""<!-- """),_display_(/*20.20*/inputText(ManagerForm("dept"), '_label -> "Department", 'class -> "form-control")),format.raw/*20.101*/("""          """),format.raw/*20.111*/("""-->
             """),_display_(/*21.15*/inputText(ManagerForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*21.97*/("""
             
		"""),format.raw/*23.3*/("""<p><strong>Assign Projects</strong></p>
            """),_display_(/*24.14*/for((value, name) <- project.Project.options) yield /*24.59*/ {_display_(Seq[Any](format.raw/*24.61*/("""
                """),format.raw/*25.17*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*25.68*/value),format.raw/*25.73*/(""""  
                    """),_display_(/*26.22*/if(ManagerForm("id").getValue.isPresent && ManagerForm("id").getValue.get != "")/*26.102*/ {_display_(Seq[Any](format.raw/*26.104*/(""" 
                        """),_display_(/*27.26*/if(project.Project.inProject(value.toLong, ManagerForm("id").getValue.get.toLong))/*27.108*/ {_display_(Seq[Any](format.raw/*27.110*/("""
                            """),format.raw/*28.29*/("""checked
                        """)))}),format.raw/*29.26*/("""
                    """)))}),format.raw/*30.22*/(""" 
                """),format.raw/*31.17*/("""/> """),_display_(/*31.21*/name),format.raw/*31.25*/(""" """),format.raw/*31.26*/("""</br>
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""</p>


             """),_display_(/*36.15*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*36.105*/("""
             """),_display_(/*37.15*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*37.105*/("""
             """),_display_(/*38.15*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*38.90*/("""
             """),_display_(/*39.15*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*39.98*/("""

             """),_display_(/*41.15*/inputText(ManagerForm("role").copy(value=Some("manager")), '_label -> "",'hidden -> "hidden")),format.raw/*41.108*/("""
             """),_display_(/*42.15*/inputText(addressForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*42.82*/("""



             """),format.raw/*46.14*/("""<label>Image Upload</label>
             <input class="btn-sm btn-default" type="file" name="upload"> 

            
            <!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            
            """),_display_(/*55.14*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*55.108*/ {_display_(Seq[Any](format.raw/*55.110*/("""
            """),format.raw/*56.13*/("""<div class="actions">
                <input type="submit" value="Add / Update Manager" class="btn btn-primary">
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.HomeController.usersManagers()),format.raw/*58.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*62.10*/(""" """),format.raw/*63.24*/("""
""")))}),format.raw/*64.2*/(""" """),format.raw/*64.20*/("""
""")))}))
      }
    }
  }

  def render(ManagerForm:Form[models.users.Manager],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(ManagerForm,addressForm,user)

  def f:((Form[models.users.Manager],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (ManagerForm,addressForm,user) => apply(ManagerForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 13:59:54 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/app/views/addManager.scala.html
                  HASH: 817aa5d8964f3ac30aba43e38a1ce598d015c033
                  MATRIX: 1018->1|1197->111|1241->108|1269->127|1296->129|1328->153|1366->154|1397->159|1719->455|1880->606|1921->608|1958->645|1995->744|2032->754|2045->758|2076->768|2118->783|2216->860|2258->875|2354->950|2396->965|2529->1076|2571->1091|2675->1174|2717->1188|2750->1194|2853->1275|2892->1285|2937->1303|3040->1385|3084->1402|3164->1455|3225->1500|3265->1502|3310->1519|3388->1570|3414->1575|3466->1600|3556->1680|3597->1682|3651->1709|3743->1791|3784->1793|3841->1822|3905->1855|3958->1877|4004->1895|4035->1899|4060->1903|4089->1904|4139->1923|4180->1936|4228->1957|4340->2047|4382->2062|4494->2152|4536->2167|4632->2242|4674->2257|4778->2340|4821->2356|4936->2449|4978->2464|5066->2531|5111->2548|5512->2922|5616->3016|5657->3018|5698->3031|5864->3170|5879->3176|5931->3207|6096->3341|6125->3419|6157->3421|6186->3439
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|51->20|51->20|52->21|52->21|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|61->30|62->31|62->31|62->31|62->31|63->32|64->33|67->36|67->36|68->37|68->37|69->38|69->38|70->39|70->39|72->41|72->41|73->42|73->42|77->46|86->55|86->55|86->55|87->56|89->58|89->58|89->58|93->62|93->63|94->64|94->64
                  -- GENERATED --
              */
          