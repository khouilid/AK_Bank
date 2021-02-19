<%@ page import="com.example.Models.Personne" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.Models.Companyes" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Corona Admin</title>
    <!-- plugins:css -->
    <%--    <link rel="stylesheet" href=".././../../assets/vendors/mdi/css/materialdesignicons.min.css">--%>
    <link rel="stylesheet" href="../../assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../../assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="../../assets/vendors/jvectormap/jquery-jvectormap.css">
    <link rel="stylesheet" href="../../assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="../../assets/vendors/owl-carousel-2/owl.carousel.min.css">
    <link rel="stylesheet" href="../../assets/vendors/owl-carousel-2/owl.theme.default.min.css">
    <link rel="stylesheet" href="../../assets/css/style.css">

    <link rel="shortcut icon" href="../../assets/images/favicon.png"/>
</head>
<body>


<%

   long[] personnalAccountsDATA = (long[]) request.getAttribute("personnalAccountsDATA");
   long[] companyAccountsDATA = (long[]) request.getAttribute("companyAccountsDATA");


%>
<div class="container-scroller">
    <!-- partial:partials/_sidebar.jsp -->
    <%@ include file = "Lyouts/sidebar.jsp" %>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_navbar.jsp -->
        <nav class="navbar p-0 fixed-top d-flex flex-row">
            <div class="navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center">
                <a class="navbar-brand brand-logo-mini" href="/">
                    <h2 class=" text-white">AK</h2>
                </a>
            </div>
            <div class="navbar-menu-wrapper flex-grow d-flex align-items-stretch">
                <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
                    <span class="mdi mdi-menu"></span>
                </button>
                <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button"
                        data-toggle="offcanvas">
                    <span class="mdi mdi-format-line-spacing"></span>
                </button>
            </div>
        </nav>
        <!-- partial -->
        <div class="main-panel">
            <div class="content-wrapper">

                <div class="row">
                    <div class="col-sm-4 grid-margin">
                        <div class="card">
                            <div class="card-body">
                                <h5>Total</h5>
                                <div class="row">
                                    <div class="col-8 col-sm-12 col-xl-8 my-auto">
                                        <div class="d-flex d-sm-block d-md-flex align-items-center">
                                            <h2 class="mb-0">$<%=personnalAccountsDATA[0] + companyAccountsDATA[0]%></h2>
                                            <p class="text-success ml-2 mb-0 font-weight-medium">+3.5%</p>
                                        </div>
                                        <h6 class="text-muted font-weight-normal"><%=String.format("%,.2f", ( (double) personnalAccountsDATA[0] / (double) ( companyAccountsDATA[0] + personnalAccountsDATA[0]) ) * 100) %>% comes from personnal accounts</h6>
                                    </div>
                                    <div class="col-4 col-sm-12 col-xl-4 text-center text-xl-right">
                                        <i class="icon-lg mdi mdi-codepen text-primary ml-auto"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4 grid-margin">
                        <div class="card">
                            <div class="card-body">
                                <h5>Total enterprise accounts</h5>
                                <div class="row">
                                    <div class="col-8 col-sm-12 col-xl-8 my-auto">
                                        <div class="d-flex d-sm-block d-md-flex align-items-center">
                                            <h2 class="mb-0"><%=companyAccountsDATA[1] %></h2>
                                            <p class="text-success ml-2 mb-0 font-weight-medium">+8.3%</p>
                                        </div>
                                        <h6 class="text-muted font-weight-normal"> 9.61% Since last month</h6>
                                    </div>
                                    <div class="col-4 col-sm-12 col-xl-4 text-center text-xl-right">
                                        <i class="icon-lg mdi mdi-wallet-travel text-danger ml-auto"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4 grid-margin">
                        <div class="card">
                            <div class="card-body">
                                <h5>Total personnal accounts</h5>
                                <div class="row">
                                    <div class="col-8 col-sm-12 col-xl-8 my-auto">
                                        <div class="d-flex d-sm-block d-md-flex align-items-center">
                                            <h2 class="mb-0"><%=personnalAccountsDATA[1]%></h2>
                                            <p class="text-danger ml-2 mb-0 font-weight-medium">-2.1% </p>
                                        </div>
                                        <h6 class="text-muted font-weight-normal">2.27% Since last month</h6>
                                    </div>
                                    <div class="col-4 col-sm-12 col-xl-4 text-center text-xl-right">
                                        <i class="icon-lg mdi mdi-monitor text-success ml-auto"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row ">
                    <div class="col-12 grid-margin">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Top enterprise accounts</h4>
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th> Company Name</th>
                                            <th> Sold</th>
                                            <th> Created</th>
                                            <th> Account N°:</th>
                                            <th> CVC</th>

                                        </tr>
                                        </thead>
                                        <tbody>

                                        <%
                                            ArrayList<Companyes> companyes = (ArrayList<Companyes>) request.getAttribute("getRichesCompany");
                                            int limite =  companyes.size() < 5 ?  companyes.size(): 5;

                                            for (int i = 0; i < limite; i++) {


                                        %>
                                        <tr>

                                            <td>
                                                <img src="../../assets/images/faces/face5.jpg" alt="image"/>
                                                <span class="pl-2"><%=companyes.get(i).getName()%></span>
                                            </td>
                                            <td>$<%=companyes.get(i).getSold() %></td>
                                            <td><%=companyes.get(i).getCreated().toString() %></td>
                                            <td><%=companyes.get(i).getAccount_number() %></td>
                                            <td><%=companyes.get(i).getCvc() %></td>

                                        </tr>
                                        <%
                                            }
                                        %>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row ">
                    <div class="col-12 grid-margin">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Top personal accounts</h4>
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th> First Name</th>
                                            <th> Last Name</th>
                                            <th> Sold</th>
                                            <th> Created</th>
                                            <th> Account N°:</th>
                                            <th> CVC</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <%
                                            ArrayList<Personne> personnes = (ArrayList<Personne>) request.getAttribute("RichesPersonnes");

                                            int limit =  personnes.size() < 5 ?  personnes.size(): 5;

                                            for (int i = 0; i < limit; i++) {



                                        %>
                                        <tr>
                                            <td>
                                                <img src="/../../assets/images/faces/face5.jpg" alt="image"/>
                                                <span class="pl-2"><%=personnes.get(i).getFirt_name()%></span>
                                            </td>
                                            <td><%=personnes.get(i).getLast_name() %></td>
                                            <td>$<%=personnes.get(i).getSold() %></td>
                                            <td><%=personnes.get(i).getCreated()%></td>
                                            <td><%=personnes.get(i).getAccount_number()%></td>
                                            <td><%=personnes.get(i).getCvc()%></td>
                                        </tr>
                                        <%
                                            }
                                        %>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Customers by Countries</h4>
                                <div class="row">
                                    <div class="col-md-5">
                                        <div class="table-responsive">
                                            <table class="table">
                                                <tbody>
                                                <tr>
                                                    <td>
                                                        <i class="flag-icon flag-icon-us"></i>
                                                    </td>
                                                    <td>USA</td>
                                                    <td class="text-right"> 1500</td>
                                                    <td class="text-right font-weight-medium"> 56.35%</td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <i class="flag-icon flag-icon-de"></i>
                                                    </td>
                                                    <td>Germany</td>
                                                    <td class="text-right"> 800</td>
                                                    <td class="text-right font-weight-medium"> 33.25%</td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <i class="flag-icon flag-icon-au"></i>
                                                    </td>
                                                    <td>Australia</td>
                                                    <td class="text-right"> 760</td>
                                                    <td class="text-right font-weight-medium"> 15.45%</td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <i class="flag-icon flag-icon-gb"></i>
                                                    </td>
                                                    <td>United Kingdom</td>
                                                    <td class="text-right"> 450</td>
                                                    <td class="text-right font-weight-medium"> 25.00%</td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <i class="flag-icon flag-icon-ro"></i>
                                                    </td>
                                                    <td>Romania</td>
                                                    <td class="text-right"> 620</td>
                                                    <td class="text-right font-weight-medium"> 10.25%</td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <i class="flag-icon flag-icon-br"></i>
                                                    </td>
                                                    <td>Brasil</td>
                                                    <td class="text-right"> 230</td>
                                                    <td class="text-right font-weight-medium"> 75.00%</td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    <div class="col-md-7">
                                        <div id="audience-map" class="vector-map"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- content-wrapper ends -->
            <!-- partial:partials/_footer.jsp -->
            <footer class="footer">
                <div class="d-sm-flex justify-content-center justify-content-sm-between">
                    <span class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright © bootstrapdash.com 2020</span>
                    <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center"> Free <a
                            href="https://www.bootstrapdash.com/bootstrap-admin-template/" target="_blank">Bootstrap admin templates</a> from Bootstrapdash.com</span>
                </div>
            </footer>
            <!-- partial -->
        </div>
        <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<!-- container-scroller -->
<!-- plugins:js -->
<script src="../../assets/vendors/js/vendor.bundle.base.js"></script>
<!-- endinject -->
<!-- Plugin js for this page -->
<script src="../../assets/vendors/chart.js/Chart.min.js"></script>
<script src="../../assets/vendors/progressbar.js/progressbar.min.js"></script>
<script src="../../assets/vendors/jvectormap/jquery-jvectormap.min.js"></script>
<script src="../../assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="../../assets/vendors/owl-carousel-2/owl.carousel.min.js"></script>
<!-- End plugin js for this page -->
<!-- inject:js -->
<script src="../../assets/js/off-canvas.js"></script>
<script src="../../assets/js/hoverable-collapse.js"></script>
<script src="../../assets/js/misc.js"></script>
<script src="../../assets/js/settings.js"></script>
<script src="../../assets/js/todolist.js"></script>
<!-- endinject -->
<!-- Custom js for this page -->
<script src="../../assets/js/dashboard.js"></script>
<!-- End custom js for this page -->
</body>
</html>