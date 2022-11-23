package com.example.servicehospitalapi.Controller;


import com.example.commonutils.result.Result;
import com.example.model.hosp.HospitalSet;
import com.example.servicehospitalapi.Service.HospitalSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 医院设置表 前端控制器
 * </p>
 *
 * @author promiseme
 * @since 2022-11-22
 */


@Api(tags = "HospitalSetApi")
@Controller
@RequestMapping("/hospital-set")
public class HospitalSetController {

    //注入HospitalSetService
    @Autowired
    private HospitalSetService hospitalSetService;


    @GetMapping("findall")
    @ResponseBody
    @ApiOperation("查询所有数据")
    public List<HospitalSet> findall(){
        List<HospitalSet> list = hospitalSetService.list();
        return  list;
    }



    @ResponseBody
    @PostMapping("getId")
    @ApiOperation("g根据id查询具体信息")
    public HospitalSet getId(Long id){
        HospitalSet hosp = hospitalSetService.getById(id);
        return hosp;
    }

    @ApiOperation("根据id删除信息具体信息")
    @ResponseBody
    @DeleteMapping("delByid")
    public Result delByid(long id){
        boolean b = hospitalSetService.removeById(id);
        if (b){
            return Result.ok();
        }else{
            return  Result.fail();
        }
    }



}

