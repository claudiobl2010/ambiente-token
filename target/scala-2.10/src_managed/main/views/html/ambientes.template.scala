
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object ambientes extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Ambiente],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(ambientes: List[Ambiente]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(Seq[Any](/*3.2*/main("Todo list")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    
    <ul>
        """),_display_(Seq[Any](/*6.10*/for(ambiente <- ambientes) yield /*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
            <li>
                """),_display_(Seq[Any](/*8.18*/ambiente/*8.26*/.label)),format.raw/*8.32*/("""
            </li>
        """)))})),format.raw/*10.10*/("""
    </ul>

""")))})))}
    }
    
    def render(ambientes:List[Ambiente]): play.api.templates.Html = apply(ambientes)
    
    def f:((List[Ambiente]) => play.api.templates.Html) = (ambientes) => apply(ambientes)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 16 19:58:37 BRT 2013
                    SOURCE: /Users/claudio.leite/Projetos/ambiente-token/app/views/ambientes.scala.html
                    HASH: 60025c541e382e0516eefeae623c13d1b65451e4
                    MATRIX: 735->1|839->28|876->31|901->48|940->50|999->74|1040->100|1079->102|1149->137|1165->145|1192->151|1252->179
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|36->8|36->8|38->10
                    -- GENERATED --
                */
            