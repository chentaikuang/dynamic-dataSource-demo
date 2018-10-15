package com.xiaochen.demo.controller;

import com.xiaochen.demo.common.Result;
import com.xiaochen.demo.entity.UserInfo;
import com.xiaochen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserService userService;

    /**
     * visit url:http://localhost:8888/test/tips
     *
     * @return
     */
    @GetMapping("/tips")
    public Map tips() {
        Map map = new HashMap();
        map.put("tips", "hello");
        map.put("curTime", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return map;
    }

    /**
     * http://localhost:8888/test/getById?id=1
     * @param id
     * @return
     */
    @RequestMapping("/getById")
    public Result tips(@RequestParam int id) {
        UserInfo user = userService.getById(id);
        return Result.success(user);
    }

    /**
     * http://localhost:8888/test/getByName/xiaochen
     * @param name
     * @return
     */
    @GetMapping("/getByName/{name}")
    public Result tips(@PathVariable(value = "name") String name) {
        UserInfo user = userService.getUserByName(name);
        return Result.success(user);
    }
}
