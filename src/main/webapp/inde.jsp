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
    <%--    <link rel="stylesheet" href="../assets/vendors/mdi/css/materialdesignicons.min.css">--%>
    <link rel="stylesheet" href="./assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="./assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="./assets/vendors/jvectormap/jquery-jvectormap.css">
    <link rel="stylesheet" href="./assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="./assets/vendors/owl-carousel-2/owl.carousel.min.css">
    <link rel="stylesheet" href="./assets/vendors/owl-carousel-2/owl.theme.default.min.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="./assets/css/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="./assets/images/favicon.png"/>
</head>
<body>
<div class="container-scroller">
    <!-- partial:partials/_sidebar.jsp -->
    <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <div class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
            <a class="sidebar-brand brand-logo" href="/">
                <h2 class=" text-white">AK Bank</h2>

            </a>
            <a class="sidebar-brand brand-logo-mini" href="/">
                <h2 class=" text-white">AK</h2>
            </a>
        </div>
        <ul class="nav">
            <li class="nav-item profile">
                <div class="profile-desc">
                    <div class="profile-pic">
                        <div class="count-indicator">
                            <%--                  <img class="img-xs rounded-circle " src="./assets/images/faces/face15.jpg" alt="img">--%>
                            <img class="img-xs rounded-circle " src="./assets/images/faces/face15.jpg" alt="img">
                            <span class="count bg-success"></span>
                        </div>
                        <div class="profile-name">
                            <h5 class="mb-0 font-weight-normal">KHOUILID</h5>
                            <span>Admin</span>
                        </div>
                    </div>
                    <a href="#" id="profile-dropdown" data-toggle="dropdown"><i class="mdi mdi-dots-vertical"></i></a>
                    <div class="dropdown-menu dropdown-menu-right sidebar-dropdown preview-list"
                         aria-labelledby="profile-dropdown">
                        <a href="#" class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <div class="preview-icon bg-dark rounded-circle">
                                    <i class="mdi mdi-settings text-primary"></i>
                                </div>
                            </div>
                            <div class="preview-item-content">
                                <p class="preview-subject ellipsis mb-1 text-small">Account settings</p>
                            </div>
                        </a>
                        <div class="dropdown-divider"></div>
                        <a href="#" class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <div class="preview-icon bg-dark rounded-circle">
                                    <i class="mdi mdi-onepassword  text-info"></i>
                                </div>
                            </div>
                            <div class="preview-item-content">
                                <p class="preview-subject ellipsis mb-1 text-small">Change Password</p>
                            </div>
                        </a>
                        <div class="dropdown-divider"></div>
                        <a href="#" class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <div class="preview-icon bg-dark rounded-circle">
                                    <i class="mdi mdi-calendar-today text-success"></i>
                                </div>
                            </div>
                            <div class="preview-item-content">
                                <p class="preview-subject ellipsis mb-1 text-small">Log out</p>
                            </div>
                        </a>
                    </div>
                </div>
            </li>
            <li class="nav-item nav-category">
                <span class="nav-link">Navigation</span>
            </li>
            <li class="nav-item menu-items">
                <a class="nav-link" href="/">
              <span class="menu-icon">
                <i class="mdi mdi-speedometer"></i>
              </span>
                    <span class="menu-title">Dashboard</span>
                </a>
            </li>

            <li class="nav-item menu-items">
                <a class="nav-link" href="Customers">
              <span class="menu-icon">
                <i class="mdi mdi-table-large"></i>
              </span>
                    <span class="menu-title">Customers</span>
                </a>
            </li>

            <li class="nav-item menu-items">
                <a class="nav-link" href="/charts">
              <span class="menu-icon">
                <i class="mdi mdi-chart-bar"></i>
              </span>
                    <span class="menu-title">Charts</span>
                </a>
            </li>

            <li class="nav-item menu-items">
                <a class="nav-link" data-toggle="collapse" href="#auth" aria-expanded="false" aria-controls="auth">
              <span class="menu-icon">
                <i class="mdi mdi-security"></i>
              </span>
                    <span class="menu-title">New account</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="auth">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"><a class="nav-link" href="/createNewAccountPersonal"> Personal account </a></li>
                        <li class="nav-item"><a class="nav-link" href="/CreateNewAccountEnterprise"> Enterprise </a></li>
                    </ul>
                </div>

            </li>
        </ul>
    </nav>
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
                <ul class="navbar-nav w-100">
                    <li class="nav-item w-100">
                        <form class="nav-link mt-2 mt-md-0 d-none d-lg-flex search">
                            <input type="text" class="form-control" placeholder="Search products">
                        </form>
                    </li>
                </ul>

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
                                <h5>Revenue</h5>
                                <div class="row">
                                    <div class="col-8 col-sm-12 col-xl-8 my-auto">
                                        <div class="d-flex d-sm-block d-md-flex align-items-center">
                                            <h2 class="mb-0">$32123</h2>
                                            <p class="text-success ml-2 mb-0 font-weight-medium">+3.5%</p>
                                        </div>
                                        <h6 class="text-muted font-weight-normal">11.38% Since last month</h6>
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
                                <h5>Sales</h5>
                                <div class="row">
                                    <div class="col-8 col-sm-12 col-xl-8 my-auto">
                                        <div class="d-flex d-sm-block d-md-flex align-items-center">
                                            <h2 class="mb-0">$45850</h2>
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
                                <h5>Purchase</h5>
                                <div class="row">
                                    <div class="col-8 col-sm-12 col-xl-8 my-auto">
                                        <div class="d-flex d-sm-block d-md-flex align-items-center">
                                            <h2 class="mb-0">$2039</h2>
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
                                            int limite;
                                            if (companyes.size() < 5){
                                                limite = companyes.size();
                                            }else {
                                                limite = 5;
                                            }

                                            for (int i = 0; i < limite; i++) {


                                        %>
                                        <tr>

                                            <td>
                                                <img src="./assets/images/faces/face5.jpg" alt="image"/>
                                                <span class="pl-2"><%=companyes.get(i).getName()%></span>
                                            </td>
                                            <td>$<%=companyes.get(i).getSold() %></td>
                                            <td><%=companyes.get(i).getCreated().toString() %></td>
                                            <td> Not set</td>
                                            <td> Not set</td>

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
                                            int limit;
                                            if (personnes.size() < 5){
                                                limit = personnes.size();
                                            }else {
                                                limit = 5;
                                            }

                                            for (int i = 0; i < limit; i++) {


                                        %>
                                        <tr>

                                            <td>
                                                <img src="./assets/images/faces/face5.jpg" alt="image"/>
                                                <span class="pl-2"><%=personnes.get(i).getFirt_name()%></span>
                                            </td>
                                            <td><%=personnes.get(i).getLast_name() %></td>
                                            <td>$<%=personnes.get(i).getSold() %></td>
                                            <td><%=personnes.get(i).getCreated()%></td>
                                            <td> App design</td>
                                            <td> App design</td>

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
<script src="./assets/vendors/js/vendor.bundle.base.js"></script>
<!-- endinject -->
<!-- Plugin js for this page -->
<script src="./assets/vendors/chart.js/Chart.min.js"></script>
<script src="./assets/vendors/progressbar.js/progressbar.min.js"></script>
<script src="./assets/vendors/jvectormap/jquery-jvectormap.min.js"></script>
<script src="./assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="./assets/vendors/owl-carousel-2/owl.carousel.min.js"></script>
<!-- End plugin js for this page -->
<!-- inject:js -->
<script src="./assets/js/off-canvas.js"></script>
<script src="./assets/js/hoverable-collapse.js"></script>
<script src="./assets/js/misc.js"></script>
<script src="./assets/js/settings.js"></script>
<script src="./assets/js/todolist.js"></script>
<!-- endinject -->
<!-- Custom js for this page -->
<script src="./assets/js/dashboard.js"></script>
<!-- End custom js for this page -->
</body>
</html>