/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-12 15:24:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.example.Models.Personne;
import com.example.Models.Users;
import java.util.HashSet;
import com.example.Models.Companyes;
import com.example.Models.User;

public final class basic_002dtable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <!-- plugins:css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/vendors/css/vendor.bundle.base.css\">\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Plugin css for this page -->\n");
      out.write("    <!-- End plugin css for this page -->\n");
      out.write("    <!-- inject:css -->\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Layout styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("    <!-- End layout styles -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./assets/images/favicon.png\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<div class=\"container-scroller\">\n");
      out.write("    <!-- partial:../partials/_sidebar.jsp -->\n");
      out.write("    <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("        <div class=\"sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top\">\n");
      out.write("            <a class=\"sidebar-brand brand-logo\" href=\"/\">\n");
      out.write("                <h2 class=\" text-white\">AK Bank</h2>\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("            <a class=\"sidebar-brand brand-logo-mini\" href=\"/\">\n");
      out.write("                <h2 class=\" text-white\">AK</h2>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li class=\"nav-item profile\">\n");
      out.write("                <div class=\"profile-desc\">\n");
      out.write("                    <div class=\"profile-pic\">\n");
      out.write("                        <div class=\"count-indicator\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <img class=\"img-xs rounded-circle \" src=\"./assets/images/faces/face15.jpg\" alt=\"img\">\n");
      out.write("                            <span class=\"count bg-success\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"profile-name\">\n");
      out.write("                            <h5 class=\"mb-0 font-weight-normal\">KHOUILID</h5>\n");
      out.write("                            <span>Admin</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#\" id=\"profile-dropdown\" data-toggle=\"dropdown\"><i class=\"mdi mdi-dots-vertical\"></i></a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right sidebar-dropdown preview-list\"\n");
      out.write("                         aria-labelledby=\"profile-dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item preview-item\">\n");
      out.write("                            <div class=\"preview-thumbnail\">\n");
      out.write("                                <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                    <i class=\"mdi mdi-settings text-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"preview-item-content\">\n");
      out.write("                                <p class=\"preview-subject ellipsis mb-1 text-small\">Account settings</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item preview-item\">\n");
      out.write("                            <div class=\"preview-thumbnail\">\n");
      out.write("                                <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                    <i class=\"mdi mdi-onepassword  text-info\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"preview-item-content\">\n");
      out.write("                                <p class=\"preview-subject ellipsis mb-1 text-small\">Change Password</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item preview-item\">\n");
      out.write("                            <div class=\"preview-thumbnail\">\n");
      out.write("                                <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                    <i class=\"mdi mdi-calendar-today text-success\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"preview-item-content\">\n");
      out.write("                                <p class=\"preview-subject ellipsis mb-1 text-small\">Log out</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item nav-category\">\n");
      out.write("                <span class=\"nav-link\">Navigation</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item menu-items\">\n");
      out.write("                <a class=\"nav-link\" href=\"/\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-speedometer\"></i>\n");
      out.write("              </span>\n");
      out.write("                    <span class=\"menu-title\">Dashboard</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item menu-items\">\n");
      out.write("                <a class=\"nav-link\" href=\"/Customers\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-table-large\"></i>\n");
      out.write("              </span>\n");
      out.write("                    <span class=\"menu-title\">Customers</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item menu-items\">\n");
      out.write("                <a class=\"nav-link\" href=\"/charts\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-chart-bar\"></i>\n");
      out.write("              </span>\n");
      out.write("                    <span class=\"menu-title\">Charts</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item menu-items\">\n");
      out.write("                <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#auth\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-security\"></i>\n");
      out.write("              </span>\n");
      out.write("                    <span class=\"menu-title\">New account</span>\n");
      out.write("                    <i class=\"menu-arrow\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"collapse\" id=\"auth\">\n");
      out.write("                    <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"/createNewAccountPersonal\"> Personal account </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"/CreateNewAccountEnterprise\"> Enterprise </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- partial -->\n");
      out.write("    <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("        <!-- partial:../partials/_navbar.jsp -->\n");
      out.write("        <nav class=\"navbar p-0 fixed-top d-flex flex-row\">\n");
      out.write("            <div class=\"navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center\">\n");
      out.write("                <a class=\"navbar-brand brand-logo-mini\" href=\"Views/index.jsp\"><img src=\"./assets/images/logo-mini.svg\"\n");
      out.write("                                                                                    alt=\"logo\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-menu-wrapper flex-grow d-flex align-items-stretch\">\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("                    <span class=\"mdi mdi-menu\"></span>\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"navbar-nav w-100\">\n");
      out.write("                    <li class=\"nav-item w-100\">\n");
      out.write("                        <form class=\"nav-link mt-2 mt-md-0 d-none d-lg-flex search\">\n");
      out.write("                            <input id=\"myInput\" type=\"text\" class=\"form-control\" placeholder=\"Search products\">\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\"\n");
      out.write("                        data-toggle=\"offcanvas\">\n");
      out.write("                    <span class=\"mdi mdi-format-line-spacing\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- partial -->\n");
      out.write("        <div class=\"main-panel\">\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h3 class=\"page-title\"> Basic Tables </h3>\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Tables</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\" aria-current=\"page\">Basic tables</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\"> Personal Accounts</h4>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>First name</th>\n");
      out.write("                                            <th>Last name</th>\n");
      out.write("                                            <th>Created</th>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody id=\"myTable\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        ");


                                            Users<Personne> users = (Users<Personne>) request.getAttribute("personnes");
                                            ArrayList<Personne> personnes = users.getUsers();


                                            for (int i = 0; i < personnes.size(); i++) {


                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(personnes.get(i).getFirt_name());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>");
      out.print(personnes.get(i).getLast_name());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>");
      out.print(personnes.get(i).getCreated());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <form action=\"deleteAccount\" method=\"get\">\n");
      out.write("                                                    <input hidden name=\"accountOf\" value=\"person\" >\n");
      out.write("\n");
      out.write("                                                    <div>\n");
      out.write("                                                        <input hidden name=\"person_id\"\n");
      out.write("                                                               value=\"");
      out.print(personnes.get(i).getId());
      out.write("\">\n");
      out.write("                                                        <input hidden name=\"user_id\"\n");
      out.write("                                                               value=\"");
      out.print(personnes.get(i).getUser_id());
      out.write("\">\n");
      out.write("                                                        <input type=\"submit\" name=\"Action\" class=\"btn btn-danger\"\n");
      out.write("                                                               value=\"Delete\">\n");
      out.write("                                                        ");

                                                            if (!personnes.get(i).getStatus()) {
                                                        
      out.write("\n");
      out.write("                                                        <input name=\"Action\" type=\"submit\" class=\"btn btn-secondary\"\n");
      out.write("                                                               value=\"Block\">\n");
      out.write("\n");
      out.write("                                                        ");

                                                            }else{
                                                                
      out.write("\n");
      out.write("                                                        <input name=\"Action\" type=\"submit\" class=\"btn btn-secondary\"\n");
      out.write("                                                               value=\"Unblock\">\n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\"> Enterprise Accounts</h4>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("                                            <th>Sold</th>\n");
      out.write("                                            <th>Created</th>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody id=\"myTable1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        ");


                                            Users<Companyes> companyesUsers = (Users<Companyes>) request.getAttribute("companyes");
                                            ArrayList<Companyes> companyes = companyesUsers.getUsers();


                                            for (int i = 0; i < companyes.size(); i++) {


                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(companyes.get(i).getName());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>$");
      out.print(companyes.get(i).getSold());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>");
      out.print(companyes.get(i).getCreated());
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <form action=\"deleteAccount\" method=\"get\">\n");
      out.write("                                                    <input hidden name=\"accountOf\" value=\"enterprise\" >\n");
      out.write("                                                    <input hidden name=\"user_id\"\n");
      out.write("                                                           value=\"");
      out.print(companyes.get(i).getUser_id());
      out.write("\">\n");
      out.write("                                                    <div>\n");
      out.write("                                                        <input hidden name=\"person_id\"\n");
      out.write("                                                               value=\"");
      out.print(companyes.get(i).getId());
      out.write("\">\n");
      out.write("                                                        <input type=\"submit\" name=\"Action\" class=\"btn btn-danger\"\n");
      out.write("                                                               value=\"Delete\">\n");
      out.write("                                                        ");

                                                            //check if this account is blocked or not
                                                            if (!companyes.get(i).getStatus()) {
                                                        
      out.write("\n");
      out.write("                                                        <input name=\"Action\" type=\"submit\" class=\"btn btn-secondary\"\n");
      out.write("                                                               value=\"Block\">\n");
      out.write("\n");
      out.write("                                                        ");

                                                        }else{
                                                        
      out.write("\n");
      out.write("                                                        <input name=\"Action\" type=\"submit\" class=\"btn btn-secondary\"\n");
      out.write("                                                               value=\"Unblock\">\n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- content-wrapper ends -->\n");
      out.write("            <!-- partial:../partials/_footer.jsp -->\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\n");
      out.write("                    <span class=\"text-muted d-block text-center text-sm-left d-sm-inline-block\">Copyright Â© bootstrapdash.com 2020</span>\n");
      out.write("                    <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\"> Free <a\n");
      out.write("                            href=\"https://www.bootstrapdash.com/bootstrap-admin-template/\" target=\"_blank\">Bootstrap admin templates</a> from Bootstrapdash.com</span>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- partial -->\n");
      out.write("        </div>\n");
      out.write("        <!-- main-panel ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- page-body-wrapper ends -->\n");
      out.write("</div>\n");
      out.write("<!-- container-scroller -->\n");
      out.write("<!-- plugins:js -->\n");
      out.write("<script src=\"./assets/vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Plugin js for this page -->\n");
      out.write("<!-- End plugin js for this page -->\n");
      out.write("<!-- inject:js -->\n");
      out.write("<script src=\"./assets/js/off-canvas.js\"></script>\n");
      out.write("<script src=\"./assets/js/hoverable-collapse.js\"></script>\n");
      out.write("<script src=\"./assets/js/misc.js\"></script>\n");
      out.write("<script src=\"./assets/js/settings.js\"></script>\n");
      out.write("<script src=\"./assets/js/todolist.js\"></script>\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Custom js for this page -->\n");
      out.write("<!-- End custom js for this page -->\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"#myInput\").on(\"keyup\", function () {\n");
      out.write("            var value = $(this).val().toLowerCase();\n");
      out.write("            $(\"#myTable tr\").filter(function () {\n");
      out.write("                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"#myInput\").on(\"keyup\", function () {\n");
      out.write("            var value = $(this).val().toLowerCase();\n");
      out.write("            $(\"#myTable1 tr\").filter(function () {\n");
      out.write("                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
