<%@include file="../header.jsp" %>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Course Management
                        <small>Add/Edit/Delete/List</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="${pageContext.request.contextPath}"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Course Management</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">

                    <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title"></h3>
                                </div><!-- /.box-header -->
                                <div class="box-body">
                                    <table class="table table-bordered table-striped">
                                        <tr>
                                            <th>Id</th>
                                            <th>Name</th>
                                            <th>Status</th>
                                            <th style="width: 40px">Action</th>
                                        </tr>
                                        <c:forEach var="course" items="${courses}">
                                        <tr>
                                            <td>${course.getId()}</td>
                                            <td>${course.getName()}</td>
                                            <td>
                                                ${course.isStatus()}
                                            </td>
                                            <td><span class="badge bg-red">55%</span></td>
                                        </tr>
                                        </c:forEach>
                                        
                                    </table>
                                </div><!-- /.box-body -->
                                <div class="box-footer clearfix">
                                    <ul class="pagination pagination-sm no-margin pull-right">
                                        <li><a href="#">&laquo;</a></li>
                                        <li><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">&raquo;</a></li>
                                    </ul>
                                </div>
                            </div>
                </section><!-- /.content -->
            </aside><!-- /.right-side -->
<%@include  file="../footer.jsp" %>

