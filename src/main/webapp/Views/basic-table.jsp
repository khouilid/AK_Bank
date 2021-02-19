<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.Models.Personne" %>
<%@ page import="com.example.Models.Users" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="com.example.Models.Companyes" %>
<%@ page import="com.example.Models.User" %>
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
<%--<%--%>
<%--    Users[] data = (Users[]) request.getAttribute("personnes");--%>

<%--%>--%>
<div class="container-scroller">
    <!-- partial:../partials/_sidebar.jsp -->
    <%@ include file = "Lyouts/sidebar.jsp" %>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:../partials/_navbar.jsp -->
        <nav class="navbar p-0 fixed-top d-flex flex-row">
            <div class="navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center">
                <a class="navbar-brand brand-logo-mini" href="Views/index.jsp"><img src="./assets/images/logo-mini.svg"
                                                                                    alt="logo"/></a>
            </div>
            <div class="navbar-menu-wrapper flex-grow d-flex align-items-stretch">
                <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
                    <span class="mdi mdi-menu"></span>
                </button>
                <ul class="navbar-nav w-100">
                    <li class="nav-item w-100">
                        <form class="nav-link mt-2 mt-md-0 d-none d-lg-flex search">
                            <input id="myInput" type="text" class="form-control" placeholder="Search products">
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
                                        <tbody id="myTable">


                                        <%

                                            Users<Personne> users = (Users<Personne>) request.getAttribute("personnes");
                                            ArrayList<Personne> personnes = users.getUsers();


                                            for (int i = 0; i < personnes.size(); i++) {


                                        %>
                                        <tr>
                                            <td><%=personnes.get(i).getFirt_name()%>
                                            </td>
                                            <td><%=personnes.get(i).getLast_name()%>
                                            </td>
                                            <td><%=personnes.get(i).getCreated()%>
                                            </td>
                                            <td>
                                                <form action="deleteAccount" method="get">
                                                    <input hidden name="accountOf" value="person" >

                                                    <div>
                                                        <input hidden name="person_id"
                                                               value="<%=personnes.get(i).getId()%>">
                                                        <input hidden name="user_id"
                                                               value="<%=personnes.get(i).getUser_id()%>">
                                                        <input type="submit" name="Action" class="btn btn-danger"
                                                               value="Delete">
                                                        <%
                                                            if (!personnes.get(i).getStatus()) {
                                                        %>
                                                        <input name="Action" type="submit" class="btn btn-secondary"
                                                               value="Block">

                                                        <%
                                                            }else{
                                                                %>
                                                        <input name="Action" type="submit" class="btn btn-secondary"
                                                               value="Unblock">
                                                        <%
                                                            }
                                                        %>
                                                    </div>
                                                </form>
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
                                        <tbody id="myTable1">


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
                                                <form action="deleteAccount" method="get">
                                                    <input hidden name="accountOf" value="enterprise" >
                                                    <input hidden name="user_id"
                                                           value="<%=companyes.get(i).getUser_id()%>">
                                                    <div>
                                                        <input hidden name="person_id"
                                                               value="<%=companyes.get(i).getId()%>">
                                                        <input type="submit" name="Action" class="btn btn-danger"
                                                               value="Delete">
                                                        <%
                                                            //check if this account is blocked or not
                                                            if (!companyes.get(i).getStatus()) {
                                                        %>
                                                        <input name="Action" type="submit" class="btn btn-secondary"
                                                               value="Block">

                                                        <%
                                                        }else{
                                                        %>
                                                        <input name="Action" type="submit" class="btn btn-secondary"
                                                               value="Unblock">
                                                        <%
                                                            }
                                                        %>
                                                    </div>
                                                </form>
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
<script>
    $(document).ready(function () {
        $("#myInput").on("keyup", function () {
            var value = $(this).val().toLowerCase();
            $("#myTable tr").filter(function () {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    });
    $(document).ready(function () {
        $("#myInput").on("keyup", function () {
            var value = $(this).val().toLowerCase();
            $("#myTable1 tr").filter(function () {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    });

</script>
</body>
</html>