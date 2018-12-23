<!-- Content Header (Page header) -->
<section class="content-header">
    <h1>
        Data Tables
        <small>advanced tables</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Tables</a></li>
        <li class="active">Data tables</li>
    </ol>
</section>

<!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">用户管理</h3>
                </div>
                <!-- /.box-header -->
                <div class="box-body">
                    <table id="example1" class="table table-bordered table-striped">
                        <thead>
                        <tr>
                            <th>昵称</th>
                            <th>头像</th>
                            <th>登录方式</th>
                            <th>登录名</th>
                            <th>口令</th>
                            <th>是否启用</th>
                        </tr>
                        </thead>
                        <tbody>
                            <#if userPage.list?? && (userPage.list?size > 0)>
                                <#list userPage.list as user>
                                    <#if user.userAuthList?? && (user.userAuthList?size > 0)>
                                        <#list user.userAuthList as userAuth>
                                             <tr>
                                                 <#if userAuth_index == 0>
                                                     <td rowspan="${user.userAuthList?size}">
                                                         ${user.nickName!''}
                                                     </td>
                                                     <td rowspan="${user.userAuthList?size}">
                                                         <img src="${user.headPortrait!'/img/Ps123.Net_0009.jpg'}"
                                                              width="100"
                                                              height="100">
                                                     </td>
                                                 </#if>
                                                 <td>${userAuth.identityType!''}</td>
                                                 <td>${userAuth.identifier!''}</td>
                                                 <td>${userAuth.credential!''}</td>
                                                 <td>${userAuth.isDel!''}</td>
                                             </tr>
                                        </#list>
                                    <#else>
                                        <tr>
                                            <td>${user.nickName!''}</td>
                                            <td><img src="${user.headPortrait!'/img/Ps123.Net_0009.jpg'}" width="100"
                                                     height="100"></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                    </#if>
                                </#list>
                            </#if>
                        </tbody>
                        <tfoot>
                        <tr>
                            <th>Rendering engine</th>
                            <th>Browser</th>
                            <th>Platform(s)</th>
                            <th>Engine version</th>
                            <th>CSS grade</th>
                        </tr>
                        </tfoot>
                    </table>
                </div>
                <!-- /.box-body -->
            </div>
            <!-- /.box -->
        </div>
        <!-- /.col -->
    </div>
    <!-- /.row -->
</section>
<!-- page script -->
<script>
    $(function () {
        $('#example1').DataTable();
    })
</script>
