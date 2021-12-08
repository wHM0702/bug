//package com.example.bug.api;
//
//import io.swagger.annotations.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Api(tags = "用户操作")
//public interface BugApi {
//
//    @ApiOperation(value = "获取下拉列表的内容")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "pid",dataType = "Integer",example = "1001",value = "1001就是获取网页的信息，1002就是获取后台的信息，1003就是获取编辑的信息")
//    })
//    @ApiResponses({
//            @ApiResponse(code = 200,message = "正常"),
//            @ApiResponse(code = 505,message = "数字过大")
//    })
//    @RequestMapping(value = "/",method = RequestMethod.GET)
//    public String init(@RequestParam(value = "pid",required = false) Integer pid, HttpServletRequest request);
//
//
//    @ApiOperation(value = "添加BUG功能")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "pid",dataType = "int",example = "1001",value = "1001就是添加网页的bug，1002就是添加后台的bug，1003就是添加编辑的bug"),
//            @ApiImplicitParam(name = "severity",dataType = "int",example = "10",value = "10就是文字错误，20就是添加次要错误，30就是添加严重错误"),
//            @ApiImplicitParam(name = "title",dataType = "String",example = "点击错误",value = "bug标题"),
//            @ApiImplicitParam(name = "user",dataType = "String",example = "小花",value = "报告人"),
//    })
//    @ApiResponses({
//            @ApiResponse(code = 200,message = "正常"),
//            @ApiResponse(code = 505,message = "数字过大")
//    })
//    @RequestMapping(value = "/addDetails",method = RequestMethod.POST)
//    public String addDetails(int pid,int severity,String title,String user);
//}
