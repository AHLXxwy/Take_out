<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">吃了吗外卖</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
       
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">${username==null?"未登录":username}</a>
      </li>
      
      
    </ul>
    <form class="form-inline my-2 my-lg-0"method="post" action='SearchFood'>
      <input class="form-control mr-sm-2" type="search" placeholder="请输入关键字" aria-label="Search"name='key'>
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">查询</button>
    </form>
  </div>
</nav>