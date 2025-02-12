package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/admin/common")
public class CommonController {
    @PostMapping
    @ApiOperation("文件上传")
    public Result<String> upload(MultipartFile file) {
        return Result.success("111111111");
    }
}
