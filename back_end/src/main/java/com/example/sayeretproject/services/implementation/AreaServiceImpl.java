package com.example.sayeretproject.services.implementation;

import com.example.sayeretproject.accessingdatajpa.AreaRepository;
import com.example.sayeretproject.accessingdatajpa.PointRepository;
import com.example.sayeretproject.beans.Area;
import com.example.sayeretproject.exceptions.ExistException;
import com.example.sayeretproject.services.interfaces.AreaService;
import com.example.sayeretproject.services.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AreaServiceImpl extends UserService implements AreaService {


    public AreaServiceImpl(PointRepository pointRepository, AreaRepository areaRepository) {
        super(pointRepository, areaRepository);
    }

//    @Override
//    public Area getAreaByName(String areaName) throws ExistException {
//        return this.areaRepository.findByName(areaName);
//    }

    @Override
    public Area getAreaById(int areaId) throws ExistException {
        return this.areaRepository.findById(areaId).orElseThrow(() -> new ExistException(""));
    }

    @Override
    public void save() {
//        List<Area> areas = new ArrayList<>();
        Area a1 = Area.builder().id(1).area("רמת הגולן").build();
        Area a2 = Area.builder().id(2).area("אצבע הגליל").build();
        Area a3 = Area.builder().id(3).area("גליל עליון").build();
        Area a4 = Area.builder().id(4).area("גליל תחתון").build();
        Area a5 = Area.builder().id(5).area("עמק יזרעאל").build();
        Area a6 = Area.builder().id(6).area("הכרמל").build();
        Area a7 = Area.builder().id(7).area("עמק הירדן ובעקת בית שאן").build();
        Area a8 = Area.builder().id(8).area("השומרון").build();
        Area a9 = Area.builder().id(9).area("השרון").build();
        Area a10 = Area.builder().id(10).area("רמת הגולן").build();
        Area a11 = Area.builder().id(11).area("בקעת הירדן").build();
        Area a12 = Area.builder().id(12).area("מדבר יהודה").build();
        Area a13 = Area.builder().id(13).area("הרי יהודה").build();
        Area a14 = Area.builder().id(14).area("שפלת יהודה").build();
        Area a15 = Area.builder().id(15).area("מישוחר החוף").build();
        Area a16 = Area.builder().id(16).area("נגב").build();
        Area a17 = Area.builder().id(17).area("ערבה").build();
//        this.pointRepository.findAll().forEach(point -> {
//            Area area = Area.builder().id(point.getAreaId()).area(point.getAreaName()).build();
//            if (!areas.contains(area)) {
//                areas.add(area);
//            }
//        });

        this.areaRepository.saveAll(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17));
    }

    @Override
    public List<Area> getAllAreas() {
        return this.areaRepository.findAll();
    }
}
