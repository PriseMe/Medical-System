package com.example.servicehospitalapi.Controller;


import com.example.model.hosp.HospitalSet;
import com.example.servicehospitalapi.Service.HospitalSetService;
import com.example.servicehospitalapi.Service.Impl.HospitalSetServiceImpl;
import io.swagger.annotations.ApiModel;
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


@ApiOperation("医院Api")
@Controller
@RequestMapping("/hospital-set")
public class HospitalSetController {

    //注入HospitalSetService
    @Autowired
    private HospitalSetService hospitalSetService;




}

