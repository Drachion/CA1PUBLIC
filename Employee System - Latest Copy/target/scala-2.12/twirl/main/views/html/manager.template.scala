
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

object manager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Manager],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(managers: List[models.users.Manager],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Manager",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""

    """),_display_(/*4.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*4.100*/ {_display_(Seq[Any](format.raw/*4.102*/("""
    """),format.raw/*5.5*/("""<h1>Manager Management</h1>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<h1>Manager List</h1>
    """)))}),format.raw/*8.6*/("""

    """),format.raw/*10.71*/("""
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
		"""),format.raw/*12.3*/("""<div class="alert alert-success">
			"""),_display_(/*13.5*/flash/*13.10*/.get("success")),format.raw/*13.25*/("""
		"""),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""

    """),format.raw/*17.5*/("""<div class="col-sm-12">
        <h4>Here are all the current Managers on the system. </h4>

        <!-- """),_display_(/*20.15*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*20.109*/ {_display_(Seq[Any](format.raw/*20.111*/("""
            """),format.raw/*21.13*/("""<p>
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.HomeController.addManager()),format.raw/*22.61*/("""">
                    <button class="btn btn-primary">Add a new Manager</button>
                </a>
            </p>
        """)))}),format.raw/*26.10*/("""

        """),_display_(/*28.10*/if((user != null) && ("admin".equals(user.getRole())))/*28.64*/ {_display_(Seq[Any](format.raw/*28.66*/("""

            """),format.raw/*30.13*/("""<p>
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.HomeController.addManager()),format.raw/*31.61*/("""">
                    <button class="btn btn-primary">Add a new Manager</button>
                </a>
            </p>

        """)))}),format.raw/*36.10*/(""" """),format.raw/*36.11*/("""-->


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
       
            """),format.raw/*61.62*/("""
            """),_display_(/*62.14*/for(m<-managers) yield /*62.30*/ {_display_(Seq[Any](format.raw/*62.32*/("""
               """),format.raw/*63.16*/("""<tr>
                    """),_display_(/*64.22*/if(env.resource("public/images/productImages/" + m.getId + "thumb.jpg").isDefined)/*64.104*/ {_display_(Seq[Any](format.raw/*64.106*/("""
                        """),format.raw/*65.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*65.69*/(m.getId + "thumb.jpg")),format.raw/*65.92*/(""""/></td>
                    """)))}/*66.23*/else/*66.28*/{_display_(Seq[Any](format.raw/*66.29*/("""
                        """),format.raw/*67.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*68.2*/("""
                    """),format.raw/*69.21*/("""<td>"""),_display_(/*69.26*/m/*69.27*/.getId),format.raw/*69.33*/("""</td>
                    <td>"""),_display_(/*70.26*/m/*70.27*/.getName),format.raw/*70.35*/("""</td>
                    <td>"""),_display_(/*71.26*/m/*71.27*/.getJobRole),format.raw/*71.38*/("""</td>
                    <td>"""),_display_(/*72.26*/m/*72.27*/.getAddress().getStreet1),format.raw/*72.51*/("""</td>
                    <td>"""),_display_(/*73.26*/m/*73.27*/.getAddress().getStreet2),format.raw/*73.51*/("""</td>
                    <td>"""),_display_(/*74.26*/m/*74.27*/.getAddress().getTown),format.raw/*74.48*/("""</td>
                    <td>"""),_display_(/*75.26*/m/*75.27*/.getAddress().getPostCode),format.raw/*75.52*/("""</td>
                    <!-- <td>"""),_display_(/*76.31*/m/*76.32*/.getDepartment),format.raw/*76.46*/("""</td> -->
                    <td>"""),_display_(/*77.26*/m/*77.27*/.getEmail),format.raw/*77.36*/("""</td>
                    <td>"""),_display_(/*78.26*/m/*78.27*/.getDateOfBirthString),format.raw/*78.48*/("""</td>

                    """),_display_(/*80.22*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*80.116*/ {_display_(Seq[Any](format.raw/*80.118*/("""
                  """),format.raw/*81.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*83.18*/routes/*83.24*/.HomeController.updateManager(m.getEmail)),format.raw/*83.65*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*89.18*/routes/*89.24*/.HomeController.deleteManager(m.getEmail)),format.raw/*89.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*94.14*/(""" """),format.raw/*94.57*/("""
            
        """)))}),format.raw/*96.10*/("""
        
        """),format.raw/*98.9*/("""</tbody>
    </table>

    """),_display_(/*101.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*101.100*/ {_display_(Seq[Any](format.raw/*101.102*/("""
    """),format.raw/*102.5*/("""<p>
        <a href=""""),_display_(/*103.19*/routes/*103.25*/.HomeController.addManager()),format.raw/*103.53*/("""">
            <button class="btn btn-primary">Add a new Manager</button>
        </a>
    </p>
    """)))}),format.raw/*107.6*/("""
"""),format.raw/*108.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(managers:List[models.users.Manager],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(managers,user,env)

  def f:((List[models.users.Manager],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (managers,user,env) => apply(managers,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 13:53:52 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/CA1 - Electric Bugaloo/Software-CA1/Employee System - Latest Copy/app/views/manager.scala.html
                  HASH: c4a82d2b2ffa414123df1b9c2ebaa8bcc331945e
                  MATRIX: 1009->1|1192->92|1220->112|1258->113|1290->120|1393->214|1433->216|1464->221|1514->255|1526->260|1564->261|1595->266|1651->293|1685->365|1714->368|1755->400|1795->402|1825->405|1889->443|1903->448|1939->463|1969->466|2007->474|2040->480|2173->586|2277->680|2318->682|2359->695|2416->725|2431->731|2480->759|2640->888|2678->899|2741->953|2781->955|2823->969|2880->999|2895->1005|2944->1033|3105->1163|3134->1164|3831->1882|3872->1896|3904->1912|3944->1914|3988->1930|4041->1956|4133->2038|4174->2040|4227->2065|4298->2109|4342->2132|4391->2163|4404->2168|4443->2169|4496->2194|4590->2258|4639->2279|4671->2284|4681->2285|4708->2291|4766->2322|4776->2323|4805->2331|4863->2362|4873->2363|4905->2374|4963->2405|4973->2406|5018->2430|5076->2461|5086->2462|5131->2486|5189->2517|5199->2518|5241->2539|5299->2570|5309->2571|5355->2596|5418->2632|5428->2633|5463->2647|5525->2682|5535->2683|5565->2692|5623->2723|5633->2724|5675->2745|5730->2773|5834->2867|5875->2869|5922->2888|6000->2939|6015->2945|6077->2986|6304->3186|6319->3192|6381->3233|6607->3428|6636->3471|6690->3494|6735->3512|6790->3540|6895->3634|6937->3636|6970->3641|7020->3663|7036->3669|7086->3697|7218->3798|7247->3799
                  LINES: 28->1|33->2|33->2|33->2|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|51->20|51->20|51->20|52->21|53->22|53->22|53->22|57->26|59->28|59->28|59->28|61->30|62->31|62->31|62->31|67->36|67->36|92->61|93->62|93->62|93->62|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|111->80|111->80|111->80|112->81|114->83|114->83|114->83|120->89|120->89|120->89|125->94|125->94|127->96|129->98|132->101|132->101|132->101|133->102|134->103|134->103|134->103|138->107|139->108
                  -- GENERATED --
              */
          