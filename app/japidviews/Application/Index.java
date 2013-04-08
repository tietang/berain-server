package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/Index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Index extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/Index.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public Index() {
		super(null);
	}
	public Index(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/ };
	public static final String[] argTypes = new String[] {/* arg types of the template*/ };
	public static final Object[] argDefaults= new Object[] { };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.Index.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} 
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners, sourceTemplate);
	}
	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1
 // line 1
		p("<div class=\"row\">\n" + 
"	<div class=\"span4\">\n" + 
"\n" + 
"		<button type=\"button\" id=\"Refresh\" class=\"btn\">Refresh</button>\n" + 
"		<hr />\n" + 
"		<div class=\" treecontainer\" id=\"left\"></div>\n" + 
"		<!--/.well -->\n" + 
"	</div>\n" + 
"	<!--/span-->\n" + 
"	<div class=\"span4\">\n" + 
"		<div class=\"well padding3\">\n" + 
"\n" + 
"\n" + 
"			<h4  >Add</h4>\n" + 
"			<hr />\n" + 
"\n" + 
"			<form action=\"/add/node\" id=\"form2\" method=\"post\">\n" + 
"				<input id=\"pid\" name=\"pid\" type=\"hidden\" placeholder=\"pId\" />\n" + 
"				<p class=\"control-group \">\n" + 
"					<label for=\"key\">Key</label> <input id=\"key\" name=\"key\" type=\"text\" placeholder=\"Key\" />\n" + 
"				</p>\n" + 
"				<p class=\"control-group \">\n" + 
"					<label for=\"value\">Value</label> <input id=\"value\" name=\"value\" type=\"text\" placeholder=\"Value\" />\n" + 
"				</p>\n" + 
"				<p>\n" + 
"					<input type=\"submit\" value=\"Add Child\" class=\"btn\" />\n" + 
"				</p>\n" + 
"			</form>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"\n" + 
"	<div class=\"span4\">\n" + 
"		<div class=\"well padding3\">\n" + 
"			<h4>Remove</h4>\n" + 
"			<hr />\n" + 
"			<form action=\"/del/node\" id=\"form1\" method=\"post\">\n" + 
"\n" + 
"				<input id=\"id\" name=\"id\" type=\"hidden\" placeholder=\"id\" />\n" + 
"\n" + 
"				<p class=\"control-group \">\n" + 
"					<label for=\"pkey\">Parent Node Key</label><input id=\"pkey\" name=\"pkey\" type=\"text\" placeholder=\"pKey\" disabled=\"disabled\" />\n" + 
"				</p>\n" + 
"				<p class=\"control-group \">\n" + 
"					<label for=\"pvalue\">Parent Node Value</label> <input id=\"pvalue\" name=\"pvalue\" type=\"text\" placeholder=\"Value\" />\n" + 
"				</p>\n" + 
"				<p>\n" + 
"					<input type=\"button\" value=\"Edit\" class=\"btn\" id=\"edit\" /> <input type=\"button\" value=\"Remove\" class=\"btn\" id=\"remove\" />\n" + 
"				</p>\n" + 
"			</form>\n" + 
"\n" + 
"		</div>\n" + 
"	</div>	\n" + 
"	\n" + 
"	<div class=\"span4\">\n" + 
"		<div class=\"well padding3\">\n" + 
"			<h4>Copy</h4>\n" + 
"			<hr />\n" + 
"			<form action=\"/copy/node\" id=\"form0\" method=\"post\">\n" + 
"\n" + 
"				<input id=\"cp_id\" name=\"id\" type=\"hidden\" placeholder=\"id\" />\n" + 
"\n" + 
"				<p class=\"control-group \">\n" + 
"					<label for=\"pkey\">From path</label><input id=\"fpath\" name=\"fpath\" type=\"text\" placeholder=\"from path\" disabled=\"disabled\" />\n" + 
"				</p>\n" + 
"				<p class=\"control-group \">\n" + 
"					<label for=\"pvalue\">To path</label> <input id=\"tpath\" name=\"tpath\" type=\"text\" placeholder=\"to path\" />\n" + 
"				</p>\n" + 
"				<p>\n" + 
"					<input type=\"button\" value=\"Copy\" class=\"btn\" id=\"copy\" />\n" + 
"				</p>\n" + 
"			</form>\n" + 
"\n" + 
"		</div>\n" + 
"	</div>\n" + 
"\n" + 
"</div>");// line 14
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("Berain Home Page");;
	}
	@Override protected void css() {
		// line 1
		p("<script src=\"");// line 1
		p(lookupStatic("/public/app/app.js"));// line 2
		p("\" type=\"text/javascript\"></script>\n" + 
"<style>\n" + 
"<!--\n" + 
".padding3 {\n" + 
"	padding-top: 10px;\n" + 
"}\n" + 
"\n" + 
"hr {\n" + 
"	margin: 10px 0px;\n" + 
"}\n" + 
"-->\n" + 
"</style>\n");// line 2
		;
	}
}