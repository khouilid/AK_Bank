<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.Models.Personne" %>
<%@ page import="com.example.Models.Users" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="com.example.Models.Companyes" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Admin</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="./assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="./assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
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
    <!-- partial:../partials/_sidebar.jsp -->
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
                        <li class="nav-item"><a class="nav-link" href="/createNewAccountPersonal"> Personal account </a>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="/CreateNewAccountEnterprise"> Enterprise </a>
                        </li>
                    </ul>
                </div>

            </li>
        </ul>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:../partials/_navbar.jsp -->
        <nav class="navbar p-0 fixed-top d-flex flex-row">
            <div class="navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center">
                <a class="navbar-brand brand-logo-mini" href="inde.jsp"><img src="./assets/images/logo-mini.svg"
                                                                             alt="logo"/></a>
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
                <div class="page-header">
                    <h3 class="page-title"> Basic Tables </h3>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">Tables</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Basic tables</li>
                        </ol>
                    </nav>
                </div>
                <div class="row">
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title"> Personal Accounts</h4>
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>First name</th>
                                            <th>Last name</th>
                                            <th>Created</th>
                                            <th>Status</th>
                                        </tr>
                                        </thead>
                                        <tbody>


                                        <%

                                            Users<Personne> users = (Users<Personne>) request.getAttribute("personnes");
                                            ArrayList<Personne> personnes = users.getUsers();


                                            for (int i = 0; i < personnes.size(); i++) {


                                        %>
                                        <tr>
                                            <td><%=personnes.get(i).getFirt_name()%>
                                            </td>
                                            <td><%=personnes.get(i).getFirt_name()%>
                                            </td>
                                            <td><%=personnes.get(i).getCreated()%>
                                            </td>
                                            <td>
                                                    <div>
                                                <form class="d-flex justify-content-between" action="deleteAccount" method="get">
                                                        <input hidden name="person_id" value="<%=personnes.get(i).getId()%>">
                                                        <button type="submit" class="btn btn-danger">Delete</button>
                                                </form>
                                                        <button class="btn btn-secondary">Block</button>
                                                        <button style="display: none;" class="btn badge-success">Inblock
                                                        </button>
                                                    </div>
                                            </td>
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
                    <div class="col-lg-6 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title"> Enterprise Accounts</h4>
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>Name</th>
                                            <th>Sold</th>
                                            <th>Created</th>
                                            <th>Status</th>
                                        </tr>
                                        </thead>
                                        <tbody>


                                        <%

                                            Users<Companyes> companyesUsers = (Users<Companyes>) request.getAttribute("companyes");
                                            ArrayList<Companyes> companyes = companyesUsers.getUsers();


                                            for (int i = 0; i < companyes.size(); i++) {


                                        %>
                                        <tr>
                                            <td><%=companyes.get(i).getName()%>
                                            </td>
                                            <td>$<%=companyes.get(i).getSold()%>
                                            </td>
                                            <td><%=companyes.get(i).getCreated()%>
                                            </td>
                                            <td>
                                                <div>
                                                    <button class="btn btn-danger">Delete</button>
                                                    <button class="btn btn-secondary">Block</button>
                                                    <button style="display: none;" class="btn badge-success">Inblock
                                                    </button>
                                                </div>
                                            </td>
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
            </div>
            <!-- content-wrapper ends -->
            <!-- partial:../partials/_footer.jsp -->
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
<!-- End plugin js for this page -->
<!-- inject:js -->
<script src="./assets/js/off-canvas.js"></script>
<script src="./assets/js/hoverable-collapse.js"></script>
<script src="./assets/js/misc.js"></script>
<script src="./assets/js/settings.js"></script>
<script src="./assets/js/todolist.js"></script>
<!-- endinject -->
<!-- Custom js for this page -->
<!-- End custom js for this page -->
</body>
</html>