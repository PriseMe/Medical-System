package com.example.servicehospitalapi.Service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.model.hosp.HospitalSet;
import com.example.servicehospitalapi.Mapper.HospitalSetMapper;
import com.example.servicehospitalapi.Service.HospitalSetService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医院设置表 服务实现类
 * </p>
 *
 * @author promiseme
 * @since 2022-11-22
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

}
